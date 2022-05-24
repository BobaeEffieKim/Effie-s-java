package com.yedam.java.ch0606;

public class CarTest {

	public static void main(String[] args) {

		Car myCar = new Car();
		myCar.setSpeed(-50); //myCar.speed=-50   -> 이게 원래 하던 방식
		
		System.out.println("현재 속도 :"+myCar.getSpeed());
		
		myCar.setSpeed(50);
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("현재 속도 :"+ myCar.getSpeed());
		
	}

}
