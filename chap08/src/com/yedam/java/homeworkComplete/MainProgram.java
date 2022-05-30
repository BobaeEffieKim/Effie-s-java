package com.yedam.java.homeworkComplete;

import java.util.Scanner;

public class MainProgram {

	//필드 선언
	private Scanner sc = new Scanner(System.in);
	private BookAccess dao = BookRepo.getInstance();
	private BookSystem pro = new BookSystem();
	
	//생성자
	public MainProgram() {
		//메뉴 출력
	while(true) {	
		pro.menuPrint();
		//메뉴 선택
		int menuNo = menuSelect();
		//각메뉴 실행
		
		if(menuNo == 1) {
			pro.inputInfo(dao);
		} else if(menuNo == 2) {
			pro.printAllInfo(dao);
		} else if(menuNo == 3) {
			pro.printInfo(dao);
		} else if(menuNo == 4) {
			pro.printRepot(dao);
		} else if(menuNo == 5) {
			exit();
			break;
		} else {
			
		}
	}
	}
	
	//메소드
	
	private int menuSelect() {
		System.out.println("선택 >");
		return Integer.parseInt(sc.nextLine());
	}
	
	private void exit() {
		System.out.println("프로그램을 종료합니다.");
	}
	
}
