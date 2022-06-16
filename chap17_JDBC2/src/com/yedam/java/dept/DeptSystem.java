package com.yedam.java.dept;

import java.util.List;
import java.util.Scanner;

public class DeptSystem {

	//필드
	private DeptDAO dao = DeptDAO.getInstance();
	private Scanner sc = new Scanner(System.in);
	
	//생성자
	public DeptSystem() {
		
		while(true) {
			//메뉴 출력
			menuPrint();
			//메뉴 입력
			int menuNo = selectMenu();
			//각 기능별 실행
			if(menuNo == 1) {
				//등록
				insertDepartment();
			} else if(menuNo == 2) {
				//수정
				updateDepartment();
			} else if(menuNo == 3) {
				//삭제
				deleteDepartment();
			} else if(menuNo == 4) {
				//사원조회(단건조회)
				selectDepartment();
			} else if(menuNo == 5) {
				//전체조회
				selectAllDepartment();
			} else if(menuNo == 9) {
				exit();
				break;
			} else {
				inputError();
			}
		}
	}

	private void menuPrint() {
		System.out.println("--------------------------------------------------");
		System.out.println("1.등록 | 2.수정 | 3.삭제 | 4.부서조회 | 5.전체부서조회 |9.종료");
		System.out.println("--------------------------------------------------");
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
	
	
	
	private void insertDepartment() {
		//부서 정보 입력
		Department dept = inputAll();
		//DB에 전달
		dao.insert(dept);
	}
	
	private void updateDepartment() {
		//수정하는 정보 입력
		Department dept = inputUpdateInfo();
		//DB에 전달
		dao.update(dept);
	}
	
	
	private void deleteDepartment() {
		//부서 번호 입력
		int departmentId = inputDepartmentId();
		//DB에 전달
		dao.delete(departmentId);
	}
	
	private void selectDepartment() {
		//부서 번호 입력
		int departmentId = inputDepartmentId();
		//DB 검색
		Department dept = dao.selectOne(departmentId);
		//결과 출력
		if(dept != null) {
			System.out.println(dept);
		} else {
			System.out.println("원하는 정보가 존재하지 않습니다.");
		}
		
	}
	
	private void selectAllDepartment() {
		List<Department> list = dao.selectAll();
		
		for(Department dept : list) {
			System.out.println(dept);
		}
		
	}
	
	private Department inputAll() {
		Department dept = new Department();
		
		System.out.println("부서 번호 >> ");
		dept.setDepartmentId(Integer.parseInt(sc.nextLine()));
		
		System.out.println("부서 이름 >> ");
		dept.setDepartmentName(sc.nextLine());
		
		System.out.println("담당 매니저 >> ");
		dept.setManagerId(Integer.parseInt(sc.nextLine()));
		
		System.out.println("부서 위치 >> ");
		dept.setLocation_id(Integer.parseInt(sc.nextLine()));
	
		return dept;
	}
	
	private Department inputUpdateInfo() {
		Department dept = new Department();
		
		System.out.println("부서 번호 >> ");
		dept.setDepartmentId(Integer.parseInt(sc.nextLine()));
		
		System.out.println("변경 매니저 >> ");
		dept.setManagerId(Integer.parseInt(sc.nextLine()));
		
		return dept;
	}
	
	private int inputDepartmentId() {
		System.out.println("부서 번호 >> ");
		return Integer.parseInt(sc.nextLine());
	}
	
	
}
