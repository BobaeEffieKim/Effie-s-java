package com.yedam.java.ch0602;

public class Main {

	public static void main(String[] args) {
		Car myCar = new Car();
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		System.out.println(myCar.maxSpeed);
		myCar.speed = 100; //독립적인 인스턴스가 되었으므로 가능한것
		System.out.println(myCar.speed);
		
		
		Car yourCar = new Car();
		System.out.println(yourCar.company);
		System.out.println(yourCar.model);
		System.out.println(yourCar.color);
		System.out.println(yourCar.maxSpeed);
		System.out.println(yourCar.speed);
		
		
		Car blueCar = new Car("Blue");
		System.out.println(blueCar.color);
		
		Car newCar = new Car();	//별도의 매개변수값을 매기지않은것
		System.out.println(newCar.color);
		
		
		
	}

}
