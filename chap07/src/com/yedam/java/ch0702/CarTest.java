package com.yedam.java.ch0702;

public class CarTest {

	public static void main(String[] args) {
		
	
	Car car = new Car();
	
	for(int i=1; i<=5; i++) {
		int problemLocation=car.run();//반환되는 타입 -> 혹시라도 문제가 생기면 어딘지 위치 알려줌
	
		
		switch(problemLocation) {
		case 1:
			System.out.println("앞왼쪽 Tire 교체");
			car.frontLeftTire = new Tire("앞왼쪽",15);
			break;
		case 2:
			System.out.println("앞오른쪽 Tire 교체");
			car.frontRightTire = new Tire("앞오른쪽",14);
			break;
		case 3:
			System.out.println("뒤왼쪽 HankookTire 교체");
			car.backLeftTire = new HankookTire("뒤왼쪽",13);
			break;
		case 4:
			System.out.println("뒤오른쪽 KumhoTire 교체");
			car.backRightTire = new KumhoTire("뒤오른쪽",12);
			break;
		}
		System.out.println("==============================");
	}
		
	}
	
}
