package com.yedam.java.ch0605;

public class Singleton {

	//필드
	private static Singleton singleton = new Singleton(); //자기자신도 필드로 가질 수 있음 , 지금은 인스턴스필드여서 외부에서는 사용못함
	
	//생성자
	private Singleton(){}
	
	//메소드
	static Singleton getInstance() {
		return singleton;
	}
	
}
