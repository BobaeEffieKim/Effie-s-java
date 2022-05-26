package com.yedam.java.ch0702;

public class DriverTest {

	public static void main(String[] args) {
		
		Driver driver = new Driver(); //driver 한사람 만들기
		
		
		//driver 클래스의 매개변수는 vehicle 밖에 없지만 
//		Bus bus = new Bus();  -> 원래 이렇게 많이함 . 하지만 아래처럼 인스턴스 생성할때 반드시 변수가 필요한건 아님. 왜냐면 driver에 변수하나 이미 선언되어있음
//		driver.drive(bus);       new로 만든것과 변수선언의 차이 ->이렇게 변수로 선언을 했다면 버스 인스턴스도 자체도 사용할 수 있음-> bus.run();
		
		//매개변수의 다형성 -> 
		driver.drive(new Bus());	  //이 사람은 버스,택시도 운전할 수 있고 모든 차량을 운전할 수 있다.
		driver.drive(new Taxi());
		driver.drive(new Vehicle());
		
		
		
	}
	
	
}
