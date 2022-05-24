package com.yedam.java.ch0604_1;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		
		boolean run = true; 					//while문을 돌릴거라서 필요
		Scanner sc = new Scanner(System.in);    //값을 입력받을거니까 필요
		Calculator program = new Calculator();  //while할동안계속 값을 누적할 계산기 필요
		
		while(run) {
			
			System.out.println("1.갯수입력 | 2.숫자입력 | 3.더하기 | 4.빼기 | 5.곱하기 | 6.나누기 | 7.종료");
			System.out.println("선택 >");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			
			if(selectNo ==1) {
				System.out.println("갯수 입력");
				int size = Integer.parseInt(sc.nextLine());
				program.setArraySize(size);
			} else if(selectNo ==2) {
				System.out.println("숫자 입력");
				int num = Integer.parseInt(sc.nextLine());
				program.setNum(num);
			} else if(selectNo ==3) {
				System.out.println("더하기");
				int plus = Integer.parseInt(sc.nextLine());
				program.plus();
			} else if(selectNo ==4) {
				System.out.println("빼기");
				int minus = Integer.parseInt(sc.nextLine());
				program.minus();
			} else if(selectNo ==5) {
				System.out.println("곱하기");
				int mult = Integer.parseInt(sc.nextLine());
				program.mult();
			} else if(selectNo ==6) {
				System.out.println("나누기");
				double divide = Double.parseDouble(sc.nextLine());
				program.divide();
			} else if(selectNo ==7) {
				run=false;
				System.out.println("프로그램 종료");
			}
		}
	}
	
	
	
}
