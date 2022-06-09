package com.yedam.java.ch1201;

public class MainThreadTest {

	public static void main(String[] args) {

		//동시에 출력하는 것 --> 하지만 하나가 완료되고 다음 for문이 출력됨 
		//=> 동시작업되게 하기위해 ThreadA 클래스를 만들고 이를 활용한 MultiThreadTest클래스도 만든다
		for(int i=1; i<=5; i++) {
			System.out.println("현재 순서 : "+i);
			try {
			Thread.sleep(500);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		for(int i=1; i<=5; i++) {
			System.out.println(i+"번째 출력");
			try {
			Thread.sleep(500);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
