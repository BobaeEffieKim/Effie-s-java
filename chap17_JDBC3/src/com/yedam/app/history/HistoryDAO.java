package com.yedam.app.history;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.yedam.app.common.DAO;
import com.yedam.app.product.Product;

public class HistoryDAO extends DAO {

	//싱글톤
	private static HistoryDAO historyDAO = null;
	private HistoryDAO() {}
	public static HistoryDAO getInstance() {
		if(historyDAO == null) {
			historyDAO = new HistoryDAO();
		}
		return historyDAO;
	}
	
	
	//CRUD
	
	//등록
	public void insert(History history) {
		
		try {
			connect();
			String sql = "INSERT INTO product_history VALUES (?,?,?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, history.getProductId());
			pstmt.setInt(2, history.getProductCategory());
			pstmt.setInt(3, history.getProductAmount());
		
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
	
	
	//수정	- 수량
	
	public void update(History history) {
		try {
			connect();
			
			String sql = "UPDATE product_history SET product_amount = ? WHERE product_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, history.getProductAmount());
			pstmt.setInt(2, history.getProductId());
			
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
			
			String sql = "DELETE FROM product_history WHERE product_id = ?";
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
	
	
	//단건조회	- 각 상품에 대한 입고
	
	public int selectInAmount(int productId) {
		
		int result = 0;

		try {
			connect();
			String sql = "SELECT SUM(product_amount)as sum FROM product_history WHERE product_id =? AND product_category = 1";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, productId);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				result = rs.getInt("sum");
				//컬럼명 그대로 가지고오는 방식
				//혹은 as로 별칭선언한뒤 별칭으로 가져오는 방식
				//select절의 컬럼순서를 기준으로 숫자로 가져와도됨
				
			}
			
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
		
		
		return result;
	}
	
	//단건조회 - 각 상품에 대한 출고
	
	public int selectOutAmount(int productId) {
		
		int result = 0;

		try {
			connect();
			String sql = "SELECT SUM(product_amount)as sum FROM product_history WHERE product_id =? AND product_category = 2";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, productId);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				result = rs.getInt("sum");
				//컬럼명 그대로 가지고오는 방식
				//혹은 as로 별칭선언한뒤 별칭으로 가져오는 방식
				//select절의 컬럼순서를 기준으로 숫자로 가져와도됨
				
			}
			
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
		
		
		return result;
	}
	
	
	
//	public History selectOne(int productId) {
//		History history = null;
//		
//		try {
//			connect();
//			
//			String sql = "SELECT*FROM product_history WHERE product_id=" + productId;
//			stmt = conn.createStatement();
//			rs = stmt.executeQuery(sql);
//			
//			while(rs.next()) {
//				history = new History();
//				history.setProductId(rs.getInt("product_id"));
//				history.setProductCategory(rs.getInt("product_category"));
//				history.setProductAmount(rs.getInt("product_amount"));
//			}
//		} catch(SQLException e) {
//			e.printStackTrace();
//		} finally {
//			disconnect();
//		}
//		return history;
//	}
//	
	
	//전체조회	- 전체 상품의 각 재고
	
	public Map selectAllAmount() {
		//단순쿼리로하기 좀 복잡해서 데이터를 들고와서 자바쪽에서 처리하기
		Map<Integer, Integer> list = new HashMap<>();
		try {
			connect();
			
			//db에서 각 제품에 따른 입고량과 출고량 들고옴
			
			String sql = "SELECT product_id, product_category, SUM(product_amount) as amount FROM product_history GROUP BY product_id, product_category";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);	//rs -> 한 행을 읽음
			
			//입고와 출고에 따흔 각각의 목록
			Map<Integer, Integer> inList = new HashMap<>();
			Map<Integer, Integer> outList = new HashMap<>();
			
			while(rs.next()) {
				//위의 쿼리문에서 각 제품별 입고에 대한 수량과 출고에 대한 수량이 한 테이블에 있어서 ,각각 연산하기 쉽지 않음
					//입고량과 출고량 분리하는 부분 => while문
					//제품이름이 딱 정해져있기때문에 그걸 이용해서 컨트롤하기 map이 더 나음
				int category = rs.getInt("product_category");
				if(category == 1) {
					inList.put(rs.getInt("product_id"), rs.getInt("amount"));
				} else {
					outList.put(rs.getInt("product_id"), rs.getInt("amount"));
				}
			}
			
			//각 리스트에서 한바퀴 돌면서 재고를 구하는 것
			Set<Integer> keySet = inList.keySet();
			for(int key : keySet) {
				int inAmount = inList.get(key);
				Integer outAmount = outList.get(key);
				
				//입고가 됐다고해서 반드시 출고가 되는건 아님->재고수량이 있을때만
				if(outAmount != null) {
					list.put(key, (inAmount - outAmount));
				} else {
					list.put(key, inAmount);
				}
				
			}
			
			
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
		
	}
	
	
	
	
//	public List<History> selectAll(){
//		List<History> list = new ArrayList<History>();
//		
//		try {
//			connect();
//			String sql = "SELECT * FROM product_history ORDER BY product_id";
//			stmt = conn.createStatement();
//			rs = stmt.executeQuery(sql);
//			
//			while(rs.next()) {
//				History history = new History();
//				history.setProductId(rs.getInt("product_id"));
//				history.setProductCategory(rs.getInt("product_category"));
//				history.setProductAmount(rs.getInt("product_amount"));
//				
//				list.add(history);
//			}
//			
//		} catch(SQLException e) {
//			e.printStackTrace();
//		} finally {
//			disconnect();
//		}
//		return list;
//	}
//	
	
	
	
}
