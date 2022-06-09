package com.yedam.java.ch1202;

public class ThreadTest {

	public static void main(String[] args) {

		ThreadA thread = new ThreadA();
		thread.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread.setStop(true);
			//2초동안 작동되고 멈춤
		
		
		System.out.println("-------------------------------------");
		
		Thread sub = new Thread() {
			@Override		//익명 자식객체 만들기
			public void run() {
				while(true) {
					if(Thread.interrupted())
						break;
					System.out.println("===========실행 중");
				}
				System.out.println("============자원 정리");
				System.out.println("============종료");
			}
		};
		sub.start();
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		sub.interrupt();
	}

}
