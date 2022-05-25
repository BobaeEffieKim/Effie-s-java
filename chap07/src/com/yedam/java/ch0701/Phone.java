package com.yedam.java.ch0701;

public class Phone {
	String model;
	String color;
	
	public Phone(String model, String color) { //새로운 생성자 생성 ->DmbPhone에 super()오류남
		this.model = model;
		this.color = color;
	}
	
	
	final void powerOn() { //final붙여보기 
		System.out.println("전원을 켭니다.");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	void bell( ) { //protected 이상의 범위여야 상속가능함
		System.out.println("벨이 울리고 진동을 일으킵니다.");
	}
	
	void call() {
		System.out.println("통화를 합니다.");
	}
	
//	private void print() {
//		System.out.println("소리를 켭니다.");
//	}
	
}
