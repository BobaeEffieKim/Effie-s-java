package com.yedam.java.emp;
//프로그램이 동작하는 클래스

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

public class EmpSystem {

	//필드
	private EmpDAO dao = EmpDAO.getInstance();
	private Scanner sc = new Scanner(System.in);
	
	//생성자 -> 여기서 동작하는 방식 정해주기
	public EmpSystem() {
		while(true) {
			//메뉴 출력
			menuPrint();
			//메뉴 입력
			int menuNo = selectMenu();
			//각 기능별 실행
			if(menuNo == 1) {
				//등록
				insertEmployee();
			} else if(menuNo == 2) {
				//수정
				updateEmployee();
			} else if(menuNo == 3) {
				//삭제
				deleteEmployee();
			} else if(menuNo == 4) {
				//사원조회(단건조회)
				selectEmployee();
			} else if(menuNo == 5) {
				//전체조회
				selectAllEmployee();
			} else if(menuNo == 9) {
				exit();
				break;
			} else {
				inputError();
			}
		}
	}
	
	private void menuPrint(){//생성자안에서만 작동하도록 구성
		System.out.println("=======================================");
		System.out.println("1.등록 2.수정 3.삭제 4.사원조회 5.전체조회 9.종료");
		System.out.println("=======================================");
	}
	
	private int selectMenu() {
		int menu = 0;
		try {
			menu = Integer.parseInt(sc.nextLine());	
			//nextLine은 모든걸 입력받을 수있지만, 우리가 원하는 값은 정수이기때문에 일차적으로 parseInt로 걸러줌
		} catch(NumberFormatException e) {
			System.out.println("숫자를 입력해주세요.");
			//menu = Integer.parseInt(sc.nextLine());-> 사용자가 경고문보고 다시 한번만에 제대로 입력할거란 가정하에
		}
		return menu;
	}
	
	private void exit() {
		System.out.println("프로그램을 종료합니다.");
	}
	
	private void inputError() {
		System.out.println("메뉴에 맞게 입력해주세요.");
	}
	
	
	private void insertEmployee() {
		//사원정보 입력
		Employee emp = inputAll();
		//DB에 전달
		dao.insert(emp);
	}
	
	private void updateEmployee() {
		//수정하는 정보 인력
		Employee emp = inputUpdateInfo();
		//DB에 전달
		dao.update(emp);
	}
	
	private void deleteEmployee() {
		//사원번호 입력
		int employeeId = inputEmployeeId();
		//DB에 전달
		dao.delete(employeeId);
	}
	
	private void selectEmployee() {
		//사원번호 입력
		int employeeId = inputEmployeeId();
		//DB 검색
		Employee emp = dao.selectOne(employeeId);
		//결과 출력
		if(emp != null) {
			System.out.println(emp);
		} else {
			System.out.println("원하는 정보가 존재하지 않습니다.");
		}
	}
	
	private void selectAllEmployee() {
		List<Employee> list = dao.selectAll();
		
		for(Employee emp : list) {
			System.out.println(emp);
		}
		
	}
	
	private Employee inputAll() {
		Employee emp = new Employee();
		System.out.println("사번 >> ");
		emp.setEmployeeId(Integer.parseInt(sc.nextLine()));
		
		System.out.println("이름 >> ");
		emp.setFirstName(sc.nextLine());
		
		System.out.println("성 >> ");
		emp.setLastName(sc.nextLine());
		
		System.out.println("이메일 >> ");
		emp.setEmail(sc.nextLine());
		
		System.out.println("전화번호 >> ");
		emp.setPhoneNumber(sc.nextLine());
		
		System.out.println("입사일(YYYY-MM-DD) >> ");
		emp.setHireDate(Date.valueOf(sc.nextLine()));
	
		System.out.println("직급 >> ");
		emp.setJobId(sc.nextLine());
		
		System.out.println("연봉 >> ");
		emp.setSalary(Double.parseDouble(sc.nextLine()));
		
		System.out.println("상여 >> ");
		emp.setCommissionPct(Double.parseDouble(sc.nextLine()));
		
		System.out.println("상사 >> ");
		emp.setManagerId(Integer.parseInt(sc.nextLine()));
		
		System.out.println("부서 >> ");
		emp.setDepartment_id(Integer.parseInt(sc.nextLine()));
		
		return emp;
	}
	
	private Employee inputUpdateInfo() {
		Employee emp = new Employee();
		System.out.println("사번 >> ");
		emp.setEmployeeId(Integer.parseInt(sc.nextLine()));
		
		System.out.println("연봉 >> ");
		emp.setSalary(Double.parseDouble(sc.nextLine()));
		return emp;
	}
	
	private int inputEmployeeId() {
		System.out.println("사번 >> ");
		return Integer.parseInt(sc.nextLine());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
