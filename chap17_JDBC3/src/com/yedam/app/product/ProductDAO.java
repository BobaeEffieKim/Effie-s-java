package com.yedam.app.product;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//DAO 클래스
import com.yedam.app.common.DAO;



public class ProductDAO extends DAO {

	//싱글톤
	private static ProductDAO productDAO = null;
	private ProductDAO() {}
	
		//필드가 널이면 객체생성을 한번 하고, 아니면 있는 객체니까 첨 만들었던거로 불러와라?
	public static ProductDAO getInstance() {
		if(productDAO == null) {
			productDAO = new ProductDAO();
		}
		return productDAO;
	}
	
	
	//CRUD
	
	//등록
	public void insert(Product product) {
		try {
			//연결
			connect();
			//쿼리문 작성
			String sql = "INSERT INTO product VALUES (product_seq.nextval, ?, ?)";
			
			//dao에서 상속을 받고 있으니까 따로 필드 선언안해줘도 사용할 수 있음
				//pstmt는 연결하면서 바로 쿼리문 넣어줌 그래서 매개값에 sql이 들어감
					//그냥 stmt는 매개변수에 sql이 안들어감 
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, product.getProductName());
			pstmt.setInt(2, product.getProductId());
			
			//디벨로퍼에서 쿼리문적고 실행버튼 누르는 역할
				//등록할때는 데이터하나씩만 하니까 커서이동같은 느낌의 rs은 필요없다
			int result = pstmt.executeUpdate();
			
			if(result > 0) {	//결과가 한개 이상이면 등록 완료
				System.out.println("정상적으로 등록되었습니다.");
			} else {
				System.out.println("정상적으로 등록되지 않았습니다.");
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
	}
	
	//수정	-> 무엇을 수정할건지 정하기	=> 가격
	public void update(Product product) {
		try {
			connect();
			
			String sql = "UPDATE product SET product_price = ? WHERE product_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, product.getProductPrice());
			pstmt.setInt(2, product.getProductId());
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println("정상적으로 수정되었습니다.");
			} else {
				System.out.println("정상적으로 수정되지 않았습니다.");
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
	}
	
	
	//삭제
	public void delete(int productId) {
		
		try {
			connect();
			
			String sql = "DELETE FROM product WHERE product_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, productId);
			
			//rs와 다른점 -> 결과의 데이터가 몇개(정수)인지만 알고 싶을때
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println("정상적으로 삭제되었습니다.");
			} else {
				System.out.println("정상적으로 삭제되지 않았습니다.");
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
	}
	
	
	//단건 조회1	-> 무엇을 기준으로 조회할건지 -제품 번호
	public Product selectOne(int productId){
							//보고싶은 프로덕트 아이디를 입력하면 아래 나오도록
		Product pro = null;
		
		try {
			connect();
			String sql = "SELECT * FROM product WHERE  product_id="+productId;
			stmt = conn.createStatement();
			//검색했을때 결과의 테이블 정보를 가져올때 쓴다 
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				pro = new Product();
				//위처럼 생성하여 가져오면 다 빈값이니까, 세터로 데이터 넣어줌
					//게터로 불러온 정보를 보클랙스 객체의 세터에 저장하고
				pro.setProductId(rs.getInt("product_id"));
				pro.setProductName(rs.getString("product_name"));
				pro.setProductPrice(rs.getInt("product_price"));
				
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return pro;
	}
	
	
	
	//단건 조회2	=> 제품 이름
	
	public Product selectOne(String productName){
		Product pro = null;
		
		try {
			connect();
//			//stmt 사용
//			String sql = "SELECT * FROM product WHERE  product_name='"+productName+"'";
//			stmt = conn.createStatement();
//			rs = stmt.executeQuery(sql);
//			
			String sql = "SELECT * FROM product WHERE  product_name=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, productName);
			rs = pstmt.executeQuery();
			
			//반환되는 값을 하나만 실행할때는 if사용 -> 원래 이렇게하지만 이렇게쓰면 코드가 복잡해지므로 while사용 
			//while 쓰면 가장 마지막으로 등록된 값으로 쿼리가 실행됨
			
			while(rs.next()) {
				pro = new Product();
				pro.setProductId(rs.getInt("product_id"));
				pro.setProductName(rs.getString("product_name"));
				pro.setProductPrice(rs.getInt("product_price"));
				
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}return pro;
	}
	
	//전체 조회
	public List<Product> selectAll(){
		List<Product> list = new ArrayList<Product>();
		//조회할때 제품이 몇개나올지 모르니까 list타입(배열크기 안정해도됨)
	//원래 배열 int arr[3] = {3,6,9} 식으로 생각할때 {3,6,9}여기값에 <Product>가 들어감
	//리스트라는 배열에 프로덕트 객체들이 순서대로 담긴다
	//근데 그 프로덕트가 클래스타입이니까 그 객체들이 그 클래스가 가지고있는 예를 들면 id,name..을 다 가지고 있음
	//디벨로퍼로 치면 프로덕트 하나가 테이블의 한 행이나 다름없다
		
		try {
			connect();
			String sql = "SELECT * FROM product ORDER BY product_id";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			//위 쿼리문의 결과가 나옴
			//커서가 생겨서 그 결과의 첫줄부터 읽어들어서 값 저장 -> 첫줄의 정보로 pro1만듦
			//다음줄로 넘어가서 -> pro2 만듦 (new 생성자가 있기 때문에)
			//이제 읽을 줄이 더이상 없으면 false를 반환하고 와일문 끝남 
			while(rs.next()) {
				Product pro = new Product();
				pro.setProductId(rs.getInt("product_id"));
				pro.setProductName(rs.getString("product_name"));
				pro.setProductPrice(rs.getInt("product_price"));
				
				//위의 프로덕트 객체에 생성해서 담은 값을 리스트에 담는 것
				list.add(pro);
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}
	
}
