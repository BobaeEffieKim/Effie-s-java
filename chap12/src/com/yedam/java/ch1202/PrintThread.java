package com.yedam.java.ch1202;

public class PrintThread extends Thread {

	
	@Override 	//try-catch구문을 while문 안에 넣느냐 while을 감싸는 형태로 넣느냐에 따라 실행결과가 달라짐
	public void run() {
		
		//interrupt=> 작업 중 일시적인 추가작업이 필요한 경우
		while(true) {
			System.out.println("실행 중");
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				System.out.println("interrupt method 실행");
			}
		}
		
		
//		//interrupt=> 작업 스레드를 종료시킬 경우
//		try {
//			while(true) {			//무한반복 스레드
//				System.out.println("실행 중");
//				Thread.sleep(1000);	//1000=>1second
//			}
//		} catch(InterruptedException e) {
//			System.out.println("interrupt method 실행");
//		}
//		System.out.println("자원 정리");
//		System.out.println("종료");
//		
//	}
	
}
}
