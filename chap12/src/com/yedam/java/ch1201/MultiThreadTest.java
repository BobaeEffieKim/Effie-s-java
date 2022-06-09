package com.yedam.java.ch1201;

public class MultiThreadTest {

	public static void main(String[] args) {

		Thread main = Thread.currentThread();
		System.out.println("메인 스레드 : "+main.getName());
		//threaA 했을때
//		Runnable a = new ThreadA();
//		Thread thread = new Thread(a);	//실제로 동작하는 것
//		
		//2번째 방법 할때 => thread 클래스 상속받을때
		ThreadB thread = new ThreadB();
		thread.setName("threadA");
		System.out.println("작업 스레드 : "+thread.getName());
		thread.start();	//작업 시작
		
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
