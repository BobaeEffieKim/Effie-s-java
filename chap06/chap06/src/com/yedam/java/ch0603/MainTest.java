package com.yedam.java.ch0603;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {

		boolean run = true;
		Scanner sc = new Scanner(System.in);
		Program program = new Program(); 
		
		
		
		while(run) {
			System.out.println("1.학생 수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5. 종료");
			System.out.println("선택>");
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if(selectNo == 1) {
				System.out.println("학생 수>");
				int student = Integer.parseInt(sc.nextLine());
				program.setStudentNum(student);
				
			} else if(selectNo == 2) {
				System.out.println("점수입력>");
				int score = Integer.parseInt(sc.nextLine());
				program.setStudentScore(score);
				
			} else if(selectNo == 3) {
				program.printScores();
				
			} else if(selectNo == 4) {
				System.out.println("분석>");
				program.printResult(); //네가 가지고있는 printResult를 호출해달라
				
			} else if(selectNo == 5) {
				run = false;
				System.out.println("프로그램 종료");
			}
			
		}
	}

}
