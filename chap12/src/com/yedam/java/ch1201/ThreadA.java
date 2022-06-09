package com.yedam.java.ch1201;

public class ThreadA implements Runnable {

	@Override
	public void run() {
		
		//thread만드는 방식 중 하나 => 1. runnable 구현
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
