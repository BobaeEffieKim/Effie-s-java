package com.yedam.java.example1;
//새로운 방식 -> 위에서 아래로 내려오는 형식

import java.util.Scanner;

public class CustomerSystem {

	//필드
	private Repo repo = new Repo(); // 저장소 생성(내가 사용하려는 저장소 하나 생김)
	private Scanner sc = new Scanner(System.in);
	
	//생성자		->while문을 항상 메인에서 돌렸다면, 이번엔 생성자 안에서 돌리기.
	//Main 클래서에서 new생성자 해주기
	public CustomerSystem() {
		while(true) {
			//메뉴 출력
			menuPrint();
			//메뉴 선택
			int menuNo = menuSelect();
			if(menuNo == 1) { //if가 아닌 switch문을 사용하면 while문은 멈추지 않음
				//메뉴1 - 회원가입
				signUp();
			} else if(menuNo == 2) {
				//메뉴2 - 회원정보
				myPage();
			} else if(menuNo == 3) {
				//메뉴3 - 결제시 금액
				payInfo();
			} else if(menuNo == 4) {
				//메뉴4 - 종료
				exit();
				break;
			}
			
		
		}
		
	}
	
	//메소드
	void menuPrint() {
		System.out.println("====================================");
		System.out.println("1.회원가입 | 2.회원정보 | 3.결제금액 | 4.종료");
		System.out.println("====================================");
	}
	
	int menuSelect() {
		System.out.print("메뉴 >");
		return Integer.parseInt(sc.nextLine());
	}
	
	void signUp() {
		//회원정보 입력
		Customer info = inputAll();
		//가입
		repo.insert(info); //입력받을때 사용되는 메소드를 만들어 놓고 그걸 호출해서 써야함 -> 중복코드줄임
		
	}
	
	Customer inputAll() {
		//회원 기본 정보 입력
		System.out.println("아이디 >");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("이름 >");
		String name = sc.nextLine();
		
		//회원 등급 선택
		int selected = selectGrade();
		Customer customer = null;
		switch(selected) {
		case 1:
			customer = new Customer(id,name);
			break;
		case 2:
			customer = new Gold(id,name);
			break;	
		case 3:
			customer = new VIP(id,name,"이한나");
			break;	
		} 
		return customer;
	}
	
	int selectGrade() {
		System.out.println("1.SILVER | 2.GOLD | 3.VIP");
		System.out.println("--------------------------");
		return Integer.parseInt(sc.nextLine());
	}
	
	void myPage() {
		int customerId = inputOne();
		Customer info = repo.selectOne(customerId);
		System.out.println(info.showInfo()); //showInfo는 string이기때문
	}
	
	void payInfo() {
		int customerId = inputOne();
		Customer info = repo.selectOne(customerId);
		
		System.out.print("구매 금액 >");
		int price = Integer.parseInt(sc.nextLine());
		int pay = info.calcPrice(price);
		System.out.println("결제 금액 :"+pay);
	}
	
	void exit() {
		System.out.println("프로그램 종료");
	}
	
	int inputOne() {
		System.out.println("고객 아이디 >");
		return Integer.parseInt(sc.nextLine());
		
	}
	
	
	
}
