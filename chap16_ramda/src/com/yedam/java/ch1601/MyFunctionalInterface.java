package com.yedam.java.ch1601;

@FunctionalInterface	//현재 인터페이스가 람다식 인터페이스로도 사용될 수 있음을 알림
						//그래야 실수로 다른 메소드를 추가하는 일을 방지하게 됨.
public interface MyFunctionalInterface {

	/*
	 * 일반적인 인터페이스처럼 상수필드 가지지 않음
	 * 람다식 문법을 사용하려면 인터페이스는 반드시 하나의 메서드만 포함하고 있어야한다.
	 */
	
	public  void method();
	
}

