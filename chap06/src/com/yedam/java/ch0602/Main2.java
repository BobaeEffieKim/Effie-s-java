package com.yedam.java.ch0602;

public class Main2 {

	public static void main(String[] args) { //사용자가 넣은 값을 기반으로 인스턴스가 생섬됨
		Car myCar = new Car ("Blue");
		
		Car yourCar = new Car("티볼리","Silver");
		
		Car newCar = new Car("레이","yello",120);
		
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		System.out.println(newCar.maxSpeed);
		System.out.println();
		
		System.out.println(yourCar.model);
		System.out.println(yourCar.color);
		System.out.println(yourCar.maxSpeed);
		System.out.println();
		
		System.out.println(newCar.model);
		System.out.println(newCar.color);
		System.out.println(newCar.maxSpeed);
		System.out.println();
	}

}
