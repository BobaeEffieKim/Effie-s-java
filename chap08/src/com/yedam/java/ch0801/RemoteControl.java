package com.yedam.java.ch0801;

public interface RemoteControl { // 인터페이스에서는 상수필드 와 추상메소드 만 가능

	//상수필드
	public static final int MAX_VOLUME = 10; //static final 넣어줘야함.
	public int MIN_VOLUME = 0;  			//인터페이스에서는 필드 선언할때 값을 꼭 줘야함.
	//추상메소드
	public abstract void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	/////////////////////////////////////////////////////////
	//일반 메소드
	public default void show() {//일반 메소드를 인터페이스에 추가할 수 있음
		System.out.println("추가한 메소드");
	}
	//정적 메소드
	
	
}
