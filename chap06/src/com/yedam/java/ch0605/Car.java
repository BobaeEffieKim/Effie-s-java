package com.yedam.java.ch0605;

public class Car {

	//필드
	public String model;
	int speed;
	
	//정적 필드 - 생산수량 
	public static int count; //main자체가 이미 정적 메소드여서 이때까지는 static이 붙은 메인 메소드들을 위주로 썼다.
							 //하지만 이때까지 어떻게 정적메소드인 메인안에서 인스턴스 메소드를 쓸 수 있었을까?
							 //다만 정적메소드안에서 인스턴스 메소드 쓰기위해서 new연산자로 미리 만들면 쓸 수 있음
	
	//생성자 -> 클래스와 동일한 이름가진다. 때에 따라 매개변수도 가진다
	public Car(String model){
		this.model = model;
		Car.count++; //(정적필드)/ static이 붙은 데서는 this웬만하면 쓰지말것
		
	}
	
	//메소드
	public void setSpeed(int speed) {
		this.speed = speed;    //인스턴스 내에서 값을 바꾸겠다는 의미, 어느 인스턴스에서 불러오느냐에따라 그 인스턴스내에서speed를 바꿀수있음. 
	}
	
	public void run() {
		for(int i=10; i<50; i+=10) {
			this.setSpeed(i);
			
			System.out.println(this.model + "가 달립니다.");
			System.out.println("시속:"+this.speed + "km.h");
			
		}
	}
}
