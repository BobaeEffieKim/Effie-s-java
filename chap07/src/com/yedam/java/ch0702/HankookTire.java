package com.yedam.java.ch0702;

public class HankookTire extends Tire{

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean roll() {
		++accumulatedRotation; // 누적되는 회전수 증가시킴
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "KumhoTire 수명 :"+(maxRotation - accumulatedRotation)+"회");
			return true;
		} else {
			System.out.println("***"+location+"KumhoTire펑크");
			return false;
		}
	}
	
	
	
}
