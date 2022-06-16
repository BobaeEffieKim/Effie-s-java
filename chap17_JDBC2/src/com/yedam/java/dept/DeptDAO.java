package com.yedam.java.dept;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.yedam.java.emp.Employee;

public class DeptDAO {

	//싱글톤
	private static DeptDAO deptDAO = null;
	private DeptDAO() {}
	public static DeptDAO getInstance() {
		if(deptDAO == null) {
			deptDAO = new DeptDAO();
		}
		return deptDAO;
	}
	
	//Oracle 연결 정보
	
	String jdbc_driver;
	String oracle_url;
	String connectedId;
	String connectedPwd;
	
	//각 메소드에서 공통적으로 사용하는 필드
	Connection conn;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	
	
	
	public void connect() {
		dbConfig();
		
		try {
		//1. JDBC Driver 로딩
		Class.forName(jdbc_driver);
		
		//2. DB 서버 접속
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
		
		try {
			String filePath = ClassLoader.getSystemClassLoader().getResource(resource).getPath();
			properties.load(new FileInputStream(filePath));
		} catch (IOException e) {
			e.printStackTrace();
		}
		jdbc_driver = properties.getProperty("driver");
		oracle_url = properties.getProperty("url");
		connectedId = properties.getProperty("id");
		connectedPwd = properties.getProperty("password");
	}
	
	
	//4. 자원 해제
	public void disconnect() {
		try {
			if(rs != null) rs.close();
			if(stmt != null) stmt.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	//3. CRUD 실행
	
	//전체 조회
	
	public List<Department> selectAll(){
		List<Department> list = new ArrayList<>();
	
	
	try {
		
		connect();
		
		stmt = conn.createStatement();
		rs = stmt.executeQuery("SELECT*FROM departments ORDER BY department_id");
		
		while(rs.next()) {
			Department dept = new Department();
			dept.setDepartmentId(rs.getInt("department_id"));
			dept.setDepartmentName(rs.getString("department_name"));
			dept.setManagerId(rs.getInt("manager_id"));
			dept.setLocation_id(rs.getInt("location_id"));
		
			list.add(dept);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	
	}
	
	//단건 조회
	public Department selectOne(int departmentId) {
		Department dept = null;
		
		try {
			connect();
			
			String sql = "SELECT* FROM departments WHERE department_id = "+departmentId;
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
		
		
			if(rs.next()) {
				dept = new Department();
				dept.setDepartmentId(rs.getInt("department_id"));
				dept.setDepartmentName(rs.getString("department_name"));
				dept.setManagerId(rs.getInt("manager_id"));
				dept.setLocation_id(rs.getInt("location_id"));
			}
				
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return dept;
	}
	
	//등록
	public void insert(Department dept) {
		
		try {
			connect();
			
			String sql = "INSERT INTO departments VALUES (?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, dept.getDepartmentId());
			pstmt.setString(2, dept.getDepartmentName());
			pstmt.setInt(3, dept.getManagerId());
			pstmt.setInt(4, dept.getLocation_id());
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println("등록이 완료되었습니다.");
			} else {
				System.out.println("등록에 실패하였습니다.");
			}
			
			System.out.println(result + "건이 완료되었습니다.");
		
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
	}
	
	
	//수정
	
	public void update(Department dept) {
	
		try {
			connect();
			
			String sql = "UPDATE departments SET manager_id =? WHERE department_id = ?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, dept.getManagerId());
			pstmt.setInt(2, dept.getDepartmentId());	
			
			int result = pstmt.executeUpdate();
			
			
			if(result > 0) {
				System.out.println("등록이 완료되었습니다.");
			} else {
				System.out.println("등록에 실패하였습니다.");
			}
			
			System.out.println(result + "건이 완료되었습니다.");
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
	
	
	//삭제
	
	public void delete(int departmentId) {
		
		try {
			connect();
			
			String sql = "DELETE FROM departments WHERE department_id = "+departmentId;
			
			stmt = conn.createStatement();
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
	
	
	
	
	
	
	
	
	
	
	
	
	
}
