package com.yedam.java.ch1202;

import java.util.Scanner;

public class PrintTest {

	public static void main(String[] args) {

		//new PrintThread().start();
		Thread jobThread = new PrintThread();
		jobThread.start();
		
		System.out.println("프로그램을 종료하시겠습니까?");
		int result = new Scanner(System.in).nextInt();
		
		if(result > 0) {		//0이 아닌 다른 수를 입력하면 interrupt method실행되며 종료
			jobThread.interrupt();
		}
	}

}
