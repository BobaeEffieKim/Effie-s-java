package com.yedam.app.common;

import java.util.Scanner;

import com.yedam.app.members.Member;
import com.yedam.app.members.MemberDAO;

public class LoginControl {

	private Scanner sc = new Scanner(System.in);
	private static Member loginInfo = null;
	static Member getLoginInfo() {
		return loginInfo;
	}
	
	public LoginControl() {
		while(true) {
			menuPrint();
			
			int menuNo = menuSelect();
			
			if(menuNo == 1) {
				//로그인
				login();
			} else if(menuNo == 2) {
				//종료
				exit();
				break;
			} else {
				showInputError();
			}
		}
	}
	
	private void menuPrint() {
		System.out.println("==============");
		System.out.println("1.로그인 | 2.종료");
		System.out.println("==============");
	}
	
	private int menuSelect() {
		int menuNo = 0;
		
		try {
			menuNo = Integer.parseInt(sc.nextLine());
		} catch(NumberFormatException e) {
			System.out.println("숫자 형식으로 입력해주세요.");
		}
		return menuNo;
	}
	
	private void exit() {
		System.out.println("프로그램을 종료합니다.");
	}
	
	private void showInputError() {
		System.out.println("메뉴를 확인해주시기 바랍니다.");
	}
	
	private void login() {
		//아이디와 비밀번호 입력
		Member inputInfo = inputMember();
		
		//로그인 시도
			//원래 이부분은 필드 만들어서 사용했는데, 반복적으로 안쓸거면 필드 안만들어도 됨
		loginInfo = MemberDAO.getInstance().selectOne(inputInfo);
		
		//실패할 경우 그대로 메소드 종료
		if(loginInfo == null) return;
		
		//성공할 경우 프로그램을 실행 -> 성공했다면 메인 메소드에서 실행했던 애를 여기서 실행 시킴
		new Management().run();
		
	}
	
	private Member inputMember() {
		Member info = new Member();
		System.out.println("아이디 > ");
		info.setMemberId(sc.nextLine());
		System.out.println("비밀번호 > ");
		info.setMemberPassword(sc.nextLine());
		return info;
		
		
	}
	
	
	
	
	
	
}
