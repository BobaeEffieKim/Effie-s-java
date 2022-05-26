package com.yedam.java.ch0702;

public class Tire {

	//필드
	public int maxRotation; //타이어 수명
	public int accumulatedRotation; //누적 회전수
	public String location; //타이어 위치
	
	//생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	
	
	//메소드 -> 타이어가 작동되는 메소드
	public boolean roll() {
		++accumulatedRotation; // 누적되는 회전수 증가시킴
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "Tire 수명 :"+(maxRotation - accumulatedRotation)+"회");
			return true;
		} else {
			System.out.println("***"+location+"Tire펑크");
			return false;
		}
	}
	
	
	
}
