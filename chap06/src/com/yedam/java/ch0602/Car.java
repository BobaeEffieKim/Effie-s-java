package com.yedam.java.ch0602;

/*
 * 1. 사용자 열거타입 우선순위로 올려놓음 (사용하던 안하던)
 * 2. 그리고 복사해서 동일한 형태로 복사해서 사용함. 그걸 직접사용하는게 아님 (class는 극소수의 상황이 아니면 사용하지않음)
 * 2-1. 이렇게 다양한 인스턴스를 생성할 수 있게함
 * 3. 항상 new를 이용해서 만듦
 */


public class Car {
	//필드
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
	
	Car() {} //기본 생성자 -> class내에 아무 생성자도 없을때 java가 알아서 만들어 줌
	
	Car(String color) {
		//this.color = color; // this는 매게변수 내에서만 사용하는 연산자같은 것 , 인스턴스를 가르킴
		this("그랜저",color,350); //-> * this:생성자 내에서 또다른 생성자 호출할 수 있음 / 이런경우에는 생성자 내에 첫줄에 있어야함 
		company = "기아";
	} 
	
	Car(String model, String color){ //매개변수의 숫자와 타입이 달라야 오버로딩이 성립됨 
		//this.model = model;
		//this.color = color;
		this(model,color,350); //->위 두줄을 줄인것
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
	
}
