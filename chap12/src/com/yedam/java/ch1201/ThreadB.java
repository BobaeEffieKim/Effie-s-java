package com.yedam.java.ch1201;

public class ThreadB extends Thread{

	//thread만드는 방식 중 하나 => 2. Thread 클래스 상속받기
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("현재 순서 : "+i);
			try {
			Thread.sleep(500);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	
	
}
