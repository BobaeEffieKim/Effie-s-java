package com.yedam.java.ch06.hw;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		boolean run = true;
		Scanner scan = new Scanner(System.in);
		HomeworkScores HwScores = new HomeworkScores();
		
		
		while(run) {
			System.out.println("===============================================================");
			System.out.println("1.학생 수 | 2.학생 점수 입력 | 3.학생 점수 전체조회 | 4.학생 점수 분석 |5.종료");
			System.out.println("===============================================================");
			System.out.println("선택 > ");
			int selectNo = Integer.parseInt(scan.nextLine());
			
			if(selectNo == 1) {
				System.out.println("학생 수 >");
				int student = Integer.parseInt(scan.nextLine());
				HwScores.setStudentNum(student);
				
			} else if(selectNo == 2) {
				System.out.println("학생 점수 >");
				int score = Integer.parseInt(scan.nextLine());
				HwScores.setStudentScore(score);
			} else if(selectNo == 3) {
				HwScores.printScores();	
			
			} else if(selectNo == 4) {
				System.out.println("학생 점수 분석 >");
				HwScores.printResult();
			
			} else if(selectNo == 5) {
				run = false;
				System.out.println("프로그램 종료");
			}	
			
		}
		
	}

}
