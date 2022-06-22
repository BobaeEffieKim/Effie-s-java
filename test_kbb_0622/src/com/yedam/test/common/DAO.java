//common package -> 사용할 공통적인 하위클래스들을 만듦
//dao class -> jdbc연결 정보 담고 있음
package com.yedam.test.common;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DAO {
	//오라클 연결 정보 -> 상속관계가 생겨도 자식클래스에서 값 변경할 수 없게 private으로
	private String jdbc_driver;
	private String oracle_url;
	private String connectedId;
	private String connectedPwd;
	
	//상속할 필드들은 protected로
	protected Connection conn;
	protected Statement stmt;
	protected PreparedStatement pstmt;
	protected ResultSet rs;
	
	
	public void connect() {
		dbConfig();
		try {
		
		//1. JDBC Driver로딩 -> 자바에서 디비에서 연결 선을 꽂는 것과 같은 과정	
		Class.forName(jdbc_driver);

		//2. DB 서버 접속 -> 선 꽂은 후에 부팅하고 로그인 하는 개념
		// connection클래스 타입으로 DriverManager를 이용해서 연결 -> 매개변수 순서 지키기!
		conn = DriverManager.getConnection(oracle_url,connectedId, connectedPwd);
		
			
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC Driver 로딩 실패");
		} catch (SQLException e) {
			System.out.println("DB 접속 실패");
		}
	}
		
		
	private void dbConfig() {
		String resource = "config/db.properties";
		Properties properties = new Properties();
		/*	
		properties로 선언하면 ->프로펄티즈파일에 글로 적었던 것들을 '키=밸류'
							맵타입으로 담기면서 키와 밸류로 들어간다
		map{key : value, key : value, key: value}
			키 : 값의 제목 / 밸류 : 값
			
			map<> -> key : value
			list<> -> 값들이 줄세워놓은게 아니라 무질서하게 한 주머니안에 들어있음 
				
	*/	
		try {
		//프로펄티즈 경로 가져오기 
			//자바내장클래스 ClassLoader에서 systemClassLoader를 읽어오고?,resource파일을 겟으로 읽어 가져오겠다. 그 후 getPath로 경로 가져오겠다 
			//이 과정을 스트링타입의 파일패스에 담음 -> 폴더 찾아가서 파일을 더블클릭으로 여는 것과 같은 과정
			String filePath = ClassLoader.getSystemClassLoader().getResource(resource).getPath();
			
			//?프로펄티즈 객체로 로더에 접근, 파일인풋스트림이라는 객체를 생성하는데 매개값으로 위의 과정을 받아서 실행하겠다
			properties.load(new FileInputStream(filePath));
			
		} catch(IOException e) {
			//무슨 오류인지 알려주겠다
			e.printStackTrace();
		}
		
		//getProperties가 맵과 비슷한 역할을 하여 각 값을 키:밸류 형태로 담아준다
		jdbc_driver = properties.getProperty("driver");
		oracle_url = properties.getProperty("url");
		connectedId = properties.getProperty("id");
		connectedPwd = properties.getProperty("password");
	
	}
	
	//4. 자원해제 -> 연결하고 다 쓴 후에는 무조건 연결해제 해줘야함
		//순서가 중요! 연결과 역순으로 연결해제 해줘야함
	public void disconnect() {
		try {	//값이 있다 = 지금 사용 중이다
			if(rs != null) rs.close();
			if(stmt != null) stmt.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	//db연결 전체의 과정 => jdbc 드라이버에 로딩 -> db 접속 -> db환경설정? -> 연결해제
}
