package com.yedam.java.emp;

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

//DAO클래스 -> db와 연결하는 클래스 
public class EmpDAO {

	//싱글톤 -> DAO는 가능한 싱글톤으로 만든다
		 //-> db에 관해서는 이 인스턴스를 통해서만 접속하도록 관리가 용이하려고 싱글톤으로 만든다
	//new 연산자를 사용해도 상관은 없지만, 호출되는 순간에 new연산자 호출되면서 인스턴스가 생성되게 순간을 조절할 수 있어서 이렇게 함
		//-> 어느 시점에 인스턴스를 생성하느냐의 차이가 있음. 
	private static EmpDAO empDAO = null;
	private EmpDAO() {}
	public static EmpDAO getInstance() {
		if(empDAO == null) {
			empDAO = new EmpDAO();
		}
		return empDAO;
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
	
	//전제 조회
	public List<Employee> selectAll(){
		List<Employee> list = new ArrayList<>();
		
		try {
			connect();
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM employees ORDER BY employee_id");
			while(rs.next()) {	//한 행을 다 읽고 커서가 다음으로 이동하는 걸 나타내는 메소드 
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setHireDate(rs.getDate("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setCommissionPct(rs.getDouble("commission_pct"));
				emp.setManagerId(rs.getInt("manager_id"));
				emp.setDepartment_id(rs.getInt("department_id"));
				
				list.add(emp);
				
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			
			disconnect();
		}
		return list;
	}
	//단건 조회
	public Employee selectOne(int employeeId) {
		Employee emp = null;	//단건조회할때는 null로 반환 -> 값이 있는지 없는지 확인하기 더 용이하다
		
		try {
			connect();
			
			String sql = "SELECT * FROM employees WHERE employee_id = "+ employeeId;
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {	//while문 돌리면 반환하는 값이 하나가 아닐 수도 있어서 전제조건이 깨져버림
				emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setHireDate(rs.getDate("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setCommissionPct(rs.getDouble("commission_pct"));
				emp.setManagerId(rs.getInt("manager_id"));
				emp.setDepartment_id(rs.getInt("department_id"));
		
				
			}
		} catch(SQLException e) {
			e.printStackTrace(); 	//비워두면 종료되어버리기때문에 비워두지말기
		} finally {
			disconnect();
		}
		return emp;
	}
	
	
	//등록
	public void insert(Employee emp) {
		//매개변수로 vo 객체 받고, 리턴타입은 없음
		
		try {
			connect();
			
			String sql = "INSERT INTO employees VALUE (?,?,?,?,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, emp.getEmployeeId());	
			pstmt.setString(2, emp.getFirstName());
			pstmt.setString(3, emp.getLastName());
			pstmt.setString(4, emp.getEmail());
			pstmt.setString(5, emp.getPhoneNumber());
			pstmt.setDate(6, emp.getHireDate());
			pstmt.setString(7, emp.getJobId());
			pstmt.setDouble(8, emp.getSalary());
			pstmt.setDouble(9, emp.getCommissionPct());
			pstmt.setInt(10, emp.getManagerId());
			pstmt.setInt(11, emp.getDepartment_id());
			
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
	public void update(Employee emp) {
		try {
		
		connect();
		
		String sql = "UPDATE employees SET salary =? WHERE employee_id = ?";
		pstmt = conn.prepareStatement(sql);
		
		pstmt.setDouble(1, emp.getSalary());
		pstmt.setInt(2, emp.getEmployeeId());	
		
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
	public void delete(int employeeId) {
		try {
			connect();
			
			String sql = "DELETE FROM employees WHERE employee_id =" + employeeId;
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
