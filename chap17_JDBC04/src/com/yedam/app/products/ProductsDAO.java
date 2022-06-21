package com.yedam.app.products;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.app.common.DAO;

public class ProductsDAO extends DAO {

	//싱글톤
	private static ProductsDAO productsDAO = null;
	private ProductsDAO() {}
	public static ProductsDAO getInstatnce() {
		if(productsDAO == null) {
			productsDAO = new ProductsDAO();
		}return productsDAO;
	}
	
	//등록
	public void insert(Product product) {
		try {
			connect();
			//쿼리문 -> 이번엔 컬럼 지정해보기
			String sql = "INSERT INTO products (product_id, product_name, product_price) "
						+ "VALUES(products_seq.nextval, ?, ?)";	//product_id는 시퀀스를 이용했었음
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, product.getProductName());
			pstmt.setInt(2, product.getProductPrice());
			
			//제대로 실행되었는지 확인
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
	
	//수정	- 재고
	public void updateStock(Product product) {
		try {
			connect();
			//쿼리문 
			String sql = "UPDATE products SET product_stock " + product.getProductStock()
						+ "WHERE product_id =?" + product.getProductId();
			stmt = conn.createStatement();
			
			//제대로 실행되었는지 확인
			int result = stmt.executeUpdate(sql);
			
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
	
	//수정 - 재고를 제외하고 이름과 가격에 대해서 수정할 수 있도록
	public void updateInfo(Product product) {
		try {
			connect();
			String sql = "UPDATE products "
						+"SET product_name = ?,"
						+" product_price = ? "
						+"WHERE product_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, product.getProductName());
			pstmt.setInt(2, product.getProductPrice());
			pstmt.setInt(3, product.getProductId());
			
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
	
	
	//삭제 -> 잘못 다 삭제될걸 방지하여 애초에 매개값으로 전체가 아닌 필요한 일부값만 받도록 설정하는게 좋음
	public void delete(int productId) {
		try {
			connect();
			//쿼리문 
			String sql = "DELETE FROM products " 
						+ "WHERE product_id = " + productId;
			stmt = conn.createStatement();
			
			//제대로 실행되었는지 확인
			int result = stmt.executeUpdate(sql);
			
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
	
	
	
	//단건조회	- 재고이름	-> 리턴타입 신경써야함, 리턴타입이 몇개인지에 따라 달라짐(배열을 쓸수도 있음)
	public Product selectOne(String productName) {
		//첫줄에 리턴되는 타입의 변수를 쓰고 null값을 준다
		Product product = null;
		
		try {
			connect();
			
			String sql = "SELECT * FROM products WHERE product_name = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, productName);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				product = new Product();
				
				product.setProductId(rs.getInt("product_id"));
				product.setProductName(rs.getString("product_name"));
				product.setProductPrice(rs.getInt("product_price"));
				product.setProductStock(rs.getInt("product_stock"));
			
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
		return product;
	}
	
	
	
	//전체조회	-> 매개변수는 따로 없고, 리턴타입은 리스트
	public List<Product> selectAll(){
		List<Product> list = new ArrayList<>();
		
		try {
			connect();
			
			String sql = "SELECT*FROM products "
						+ "ORDER BY product_id";
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {	//데이터가 몇개인지 모르니까 와일문 돌리기
				Product product = new Product();
				product.setProductId(rs.getInt("product_id"));
				product.setProductName(rs.getString("product_name"));
				product.setProductPrice(rs.getInt("product_price"));
				product.setProductStock(rs.getInt("product_stock"));
			
				list.add(product);
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
		return list;
	}
	
}
