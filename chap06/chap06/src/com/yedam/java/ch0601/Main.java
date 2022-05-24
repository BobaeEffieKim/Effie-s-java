package com.yedam.java.ch0601;

public class Main {

	public static void main(String[] args) {

		Car myCar = new Car();		//new 연산자를 사용하면 새로운 인스턴스를 생성하는 것임, 기존것이랑 같은것 쓰고싶으면 복사해야함
		System.out.println(myCar);
		
		Car yourCar = new Car();
		System.out.println(yourCar);
		
	}

}
