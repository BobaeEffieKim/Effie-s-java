package com.yedam.java.ch0703;

public class Dog extends Animal{ //Animal이 추상클래스에 추상메소드까지 가지고있기때문에 오류남 -> Dog에서 정의해줘야함
								 //해결방법2가지) 추상메소드를 재정의하던지, 추상메소드가 되던지
	@Override
	public void sound() {		//추상메소드 정의
		System.out.println("멍멍");
		
	}

}
