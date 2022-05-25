package com.yedam.homework;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {

		boolean run = true;
		Scanner sc = new Scanner(System.in);
		ProductSystem system = new ProductSystem();
		
		while(run) {
			System.out.println("1.상품 수 | 2.상품 및 가격 입력 | 3.제품별 가격 | 4.분석 | 5.종료");
			System.out.print("입력 >");
			int menuNo = Integer.parseInt(sc.nextLine());
			
			
			if(menuNo == 1) {
				System.out.println("상품 수 >");
				int count = Integer.parseInt(sc.nextLine());
				system.setListSize(count);
			} else if(menuNo ==2) {
				System.out.println("상품 이름>");
				String name = sc.nextLine();
				System.out.println("상품 가격>");
				int price = Integer.parseInt(sc.nextLine());
				system.putProduct(name, price);
			} else if(menuNo ==3) {
				system.printList();
			} else if(menuNo ==4) {
				Product maxInfo = system.getMaxPriceInfo();
				System.out.println("최고 가격 제품 :"+ maxInfo.getName());
				System.out.println("최고 가격을 제외한 총합 :"+ system.getTotalPrice());
			} else if(menuNo ==5) {
				run = false;
				System.out.println("프로그램 종료");
			}
			
			
			
			
		}
		
		
	}

}
