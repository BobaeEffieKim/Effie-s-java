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
			connect();
			String sql = "INSERT INTO product VALUES (product_seq.nextval, ?, ?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, product.getProductName());
			pstmt.setInt(2, product.getProductId());
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
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
		Product pro = null;
		
		try {
			connect();
			String sql = "SELECT * FROM product WHERE  product_id="+productId;
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
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
		
		try {
			connect();
			String sql = "SELECT * FROM product ORDER BY product_id";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				Product pro = new Product();
				pro.setProductId(rs.getInt("product_id"));
				pro.setProductName(rs.getString("product_name"));
				pro.setProductPrice(rs.getInt("product_price"));
				
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
