package com.yedam.java.ch0802;
//실행 클래스
public class CarTest {

	public static void main(String[] args) {

		Car myCar = new Car();
		myCar.run();
		
		System.out.println();
		
		myCar.frontLeftTire = new HankookTire(); //한국타이어로 교체
		myCar.frontRightTire = new HankookTire();
		
		myCar.run();
	}

}
