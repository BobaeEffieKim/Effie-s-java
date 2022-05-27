package com.yedam.java.ch0802;
//Tire 클래스와 부품관계
public class Car {

	Tire frontLeftTire = new KumhoTire(); //각 타이어에 대해서 인터페이스로 선언
	Tire frontRightTire = new KumhoTire();
	Tire backLeftTire = new KumhoTire();
	Tire backRightTire = new KumhoTire();
	
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
