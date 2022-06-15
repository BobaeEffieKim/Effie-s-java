package com.yedam.java.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//JDBC 패턴 외우기!!

public class SQLExample {

	public static void main(String[] args) throws Exception {

		//1. JDBC Driver 로딩하기
		Class.forName("oracle.jdbc.driver.OracleDriver");
			//보통 exception처리해줌
		
		//2. DB 서버 접속하기
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "hr";
		String pwd = "hr";
		
		Connection con = DriverManager.getConnection(url, id, pwd);
		
		//2번까지는 거의 고정
		
		
		//3. CRUD 실행
			/******************INSERT********************/
			//-1. Statement or PreparedStatement 객체 생성하기
				//preparedStatement쓰면 일일이 변수명과 타입확인안해도 ?로 대체 가능 / sql문도 사용가능
				//set메소드도 ?만큼 있어야함
			String insert 
			= "INSERT INTO employees VALUES(?,?,?,?,?,?,?,?,?,?,?)";
			
			PreparedStatement pstmt = con.prepareStatement(insert);
		
			//-2. SQL 구성 후 실행
			pstmt.setInt(1, 1000);	//첫번째 매개변수 : ?의 숫자, 두번째 매개변수 : int 타입인 1000으로 대체
			pstmt.setString(2, "Kil-Dong");
			pstmt.setString(3, "Hong");
			pstmt.setString(4, "kdHong@google.com");
			pstmt.setString(5, "82.10.1234.1234");
			pstmt.setString(6, "21/11/05");
			pstmt.setString(7, "SA_REP");
			pstmt.setInt(8, 6000);
			pstmt.setDouble(9, 0.15);
			pstmt.setInt(10, 149);
			pstmt.setInt(11, 80);
			
			//-3. 결과 출력
				//DDL ->~~Update사용 
				//DML(insert,update,delete) -> executeUpdate사용
			int result = pstmt.executeUpdate();
			
			System.out.println("insert 결과 : "+result);
			
			
			/******************UPDATE********************/
			//-1. Statement or PreparedStatement 객체 생성하기
				//값을 넣을 위치에 물음표로 표시
			String update 
			= "UPDATE employees SET last_name = ? WHERE employee_id = ?";
			//String temp = "UPDATE"+ tables + "SET"+column+ "="; -> statement
			
			pstmt = con.prepareStatement(update);
			
			//-2. SQL 구성 후 실행
				//set은 반드시 물음표 순대로 할 필요는 없음
			pstmt.setInt(2, 1000);
			pstmt.setString(1, "Kang");
		
			//-3. 결과 출력
			result = pstmt.executeUpdate();
			
			System.out.println("update 결과 : " + result);
			
			
			/******************SELECT********************/
			//-1. Statement or PreparedStatement 객체 생성하기
			String select
			= "SELECT * FROM employees ORDER BY employee_id";
			pstmt = con.prepareStatement(select);
			
			//-2. SQL 구성 후 실행
			ResultSet rs = pstmt.executeQuery();
			
			//-3. 결과 출력
			while(rs.next()) {
				String info = rs.getInt("employee_id") + " : "+ rs.getString("first_name");
				System.out.println(info);
			}
			
			
			/******************DELETE********************/
			//-1. Statement or PreparedStatement 객체 생성하기
			String delte 
			= "DELETE FROM employees WHERE employee_id = ?";
			pstmt = con.prepareStatement(delte);
			
			//-2. SQL 구성 후 실행
			pstmt.setInt(1, 1000);
		
			//-3. 결과 출력
			result = pstmt.executeUpdate();
			
			System.out.println("delete 결과 : "+result);
			
			
		//4. 자원 해제하기
		if(rs != null) rs.close();
		if(pstmt != null) pstmt.close();
		if(con != null) con.close();
		
	}

}
