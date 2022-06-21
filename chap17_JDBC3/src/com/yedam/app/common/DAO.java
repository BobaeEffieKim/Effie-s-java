package com.yedam.app.common;
//2번
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
/*
*  * common -> 우리가 사용할 공통적인 하위클래스들 만듦
* 		-> dao가 jdbc연결정보 담고있기때문에 dao도 여기서 만듦
* 	
* 	
*/ 
public class DAO {
	
			//상속이 생겨도 자식클래스에서 건들 수 없게 private으로 설정
		//Oracle 연결 정보
		private String jdbc_driver;
		private String oracle_url;
		private String connectedId;
		private String connectedPwd;
		
			//상속이 일어날거라서 필드를 다 protected로 바꿔준다
		//각 메소드에서 공통적으로 사용하는 필드
		protected Connection conn;
		protected Statement stmt;
		protected PreparedStatement pstmt;
		protected ResultSet rs;
		
		public void connect() {
			dbConfig();
			try {
			//1. JDBC Driver 로딩
				//자바에서 디비에다 연결선을 꽂는 느낌
			Class.forName(jdbc_driver);
			
			//2. DB 서버 접속
				//선을 꽂아서 부팅시키고 로그인하는 느낌
				//커넥션이라는 클래스 타입으로 드라이버 매니져를 이용해서 연결
				// 매개는 꼭 url, id, pwd이 순서로 해야함
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
	properties로 선언하면 ->프로펄타이즈파일에 글로 적었던 것들을 '키=밸류'
						맵타입으로 담기면서 키와 밸류로 들어간다
	map{key : value, key : value, key: value}
		키 : 값의 제목 / 밸류 : 값
		
		map<> -> key : value
		list<> -> 순서가 없이? 값들이 줄세워놓은게 아니라 무질서하게 한 주머니안에 들어있음 
			
*/			
			try {
				//프로펄다이즈 경로를 먼저 가져옴
					//클래스로더라는 자바내장클래스에서 겟 로더 쓰고, 겟리소스에서 리소스에 적어준 파일을 가졍겠다.그리고 겟패스에서 경로 가져옴 
					// 이 전체를 스트링타입으로 파일 패스에 담음 -> 마치 폴더찾아갓거 파일을 더블클릭으로 연격
				String filePath = ClassLoader.getSystemClassLoader().getResource(resource).getPath();
				//
				properties.load(new FileInputStream(filePath));
			} catch (IOException e) {
				//뭔 오류인지 알려주겠다
				e.printStackTrace();
			}
			//겟프로펄티가 맵이랑 비슷하여 값을 가져와서 담고 담고 담고 함
			jdbc_driver = properties.getProperty("driver");
			oracle_url = properties.getProperty("url");
			connectedId = properties.getProperty("id");
			connectedPwd = properties.getProperty("password");
		}

		//4. 자원 해제
			//디비랑 연결했으면 무조건 연결끊어줘야함
			//순서중요! 마지막으로 연결한거부터 해줘야함 (연결과 역순!)
		public void disconnect() {
			try {	//값이 있다 = 지금 사용중이다 라는 뜻 
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
/*
 * 
 
 * 
 * 	
 */
	
}
