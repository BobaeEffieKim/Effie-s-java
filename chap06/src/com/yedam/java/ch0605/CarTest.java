package com.yedam.java.ch0605;

public class CarTest {

	public static void main(String[] args) {

		//CarTest ct = new CarTest(); -> 정적 메소드 안에서 인스턴스 쓸때 이렇게 
		//ct.print();
		
		Car myCar = new Car("포르쉐");
		Car yourCar = new Car("벤츠");
		
		myCar.run();
		System.out.println(yourCar.speed);
		yourCar.run();
		
	}

	public void print() {
		System.out.println();
	}
	
}
