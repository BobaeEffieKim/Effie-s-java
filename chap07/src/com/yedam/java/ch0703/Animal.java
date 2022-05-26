package com.yedam.java.ch0703;

public abstract class Animal {	//클래스 선언부에 abstract이 필수는 아니지만, 클래스 내에 추상 메소드가 하나라도 있으면 추상클래스가 되기때문에 붙여줘야함 

	public void breathe() { 			//숨은 누구나 쉬니까 일반 메소드로 선언
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound();		//아직 실행에 대한 내용이 없음
	
}
