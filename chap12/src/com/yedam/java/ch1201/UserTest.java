package com.yedam.java.ch1201;

public class UserTest {

	public static void main(String[] args) {

		Calculator cal = new Calculator();
		//cal.setMemory(100);
		
		//하나의 인스턴스를 유저1과 유저2가 동시에 사용하고 있음
		User user1 = new User();
		user1.setCalculator(cal);
		user1.start();
		
		User user2 = new User();
		user2.setCalculator(cal);
		user2.start();
	}

}
