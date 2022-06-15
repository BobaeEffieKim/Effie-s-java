package com.yedam.java.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectExample {

	public static void main(String[] args) throws Exception {

		//1. JDBC Driver 로딩하기
			//ojdbc에 있는 드라이브 정보에 로딩됨
		Class.forName("oracle.jdbc.driver.OracleDriver");
			
		//2. DB 접속하기	
			//connection위한 db정보
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "hr";
		String pwd = "hr";
		
		Connection con = DriverManager.getConnection(url, id, pwd);
		
		//3. Statement or PreparedStatement 객체 생성하기
		Statement stmt = con.createStatement();
		
		//4. Query 구성
			//db에 요청할 정보를 쿼리로 짜기
		String sql = "SELECT * FROM employees WHERE last_name = 'King'";
		
		//5. Query 실행
		ResultSet rs = stmt.executeQuery(sql);
		
		//6. 결과값 출력하기
			//컬럼명 정확하게 써야하고, 리턴되는 타입 지정해줘야함 
			// SELECT절에 있는 컬럼 순서로 가져올 수도 있음
		while(rs.next()) {
			String name = rs.getString("first_name") + " "
						+ rs.getString("last_name");
			System.out.println(name);
		}
		
		//7. 자원해제하기
			//생성된 순서와 정반대로 해제하는게 정석
		if(rs != null) rs.close();
		if(stmt != null) stmt.close();
		if(con != null) con.close();
		
	}

}
