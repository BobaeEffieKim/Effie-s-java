package com.yedam.java.ch0605;

public class Planet {
	//필드
	final int radius;				 // static 없으면 내가 원하면 값변경을 한번 있다
	static final double pi = 3.1459; // static 있으면 값이 변동될 수 없다
	
	Planet(int radius){
		this.radius = radius;
	}
	
	//메소드
	void getArea() {
		double result = 4 * Planet.pi * this.radius * this.radius; 
		System.out.println("행성의 표면적 :"+result);		
	}
	
	

}
