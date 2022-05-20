package hw;

import java.util.Scanner;

public class P161과제 {

	public static void main(String[] args) {
		
		boolean run = true;
		int balance = 0;
		int menu;
		int money=0;
		String result = "";
		Scanner scan = new Scanner(System.in);
		int sum = money + balance;
		int sub = balance - money;
		
		do {
			
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.println("선택 > ");
			
			menu = Integer.parseInt(scan.nextLine());
			if(menu ==1) {
				System.out.println("예금액 > ");
				balance += Integer.parseInt(scan.nextLine());
			
				
			} else if(menu==2) {
				System.out.println("출금액 > ");
				balance -= Integer.parseInt(scan.nextLine());
			} else if(menu==3) {
				System.out.println("잔고액 > ");
				System.out.println(balance);
			} else if(menu==4) {
				System.out.println("종료");
				break;
			}
			
		} while(true);
		System.out.println("시스템 종료");
	} 
	

}
