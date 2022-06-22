package com.yedam.app.common;
//얘를 부모클래스로 하는 서브클래스 두개 만들어서 할 것 
	//이 프로그램이 도는 동안 공유되는 부분을 관리

import java.util.Scanner;

import com.yedam.app.deal.ProductStockManagement;
import com.yedam.app.deal.ReceivingGoodsDAO;
import com.yedam.app.deal.TakeOutGoodsDAO;
import com.yedam.app.products.ProductInfoManagement;
import com.yedam.app.products.ProductsDAO;

public class Management {

	//필드
	protected Scanner sc = new Scanner(System.in);
	protected ProductsDAO pDAO = ProductsDAO.getInstatnce();
		//구현될 클래스를 예상하고 미리 만듦
	protected ReceivingGoodsDAO rDAO = ReceivingGoodsDAO.getInstance();
	protected TakeOutGoodsDAO tDAO = TakeOutGoodsDAO.getInstance();
	
	//생성자 => run메소드로 변경
	public void run() {
		//권한 확인 
			//롤 받아오기
	
		
		while(true) {	
			//와일문 안에 생성자 사용할때 -> 생성자가 종료될때까지 와일문 
			//상속관계에 있을때 -> 생성자를 이용한 프로그램 실행은 어렵다 => 그래서 생성자였다가 run메소드로 바꿈
			//생성자는 바로 실행되기때문에 편의상 썼던거고 , 반드시 생성자에서 쓸 필요는 없다
			menuPrint();
			
			int menuNo = menuSelect();
			
			if(menuNo == 1 ) {
				//제품정보관리
				new ProductInfoManagement();
			} else if(menuNo == 2) {
				//제품관리
				new ProductStockManagement();
			} else if(menuNo == 9) {
				//프로그램 종료
				exit();
				break;
			} else {
				showInputError();
			}
		}
	}
	
	//메소드
	
	protected void menuPrint() {
	
		System.out.println("===============================");
		System.out.println("1.제품정보관리 2.제품재고관리 9.종료");
		System.out.println("===============================");
	}
	
	protected int menuSelect() {
		int menuNo = 0;
		
		try {
			menuNo = Integer.parseInt(sc.nextLine());
		} catch(NumberFormatException e) {
			System.out.println("숫자를 입력해주시기 바랍니다.");
		}
		return menuNo;
	}
	
	protected void exit() {
		System.out.println("프로그램을 종료합니다.");
	}
	
	protected void showInputError() {
		System.out.println("메뉴에서 입력해주시기 바랍니다.");
	}
	
	
	protected boolean selectRole() {
		int memberRole = LoginControl.getLoginInfo().getMemberRole();
		
		if(memberRole == 0) {
			return true;
		
		} else {
			return false;
		}
		
	}
	
	
	
	
}
