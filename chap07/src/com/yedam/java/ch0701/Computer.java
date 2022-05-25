package com.yedam.java.ch0701;

public class Computer extends Calculator {

	//@-> 몇줄의 코딩을 짧은 요약어를 뜻하는 문법
	@Override //-> 이 메소드가 부모거를 재정의한거다 라고 자바에게 알려줌. 자바가 시그니처가 확실하게 일치하는지 더 꼼꼼하게 비교해봄.
	double areaCircle(double r) {
		System.out.println("부모 :"+super.areaCircle(r));
		System.out.println("Computer 객체");
		return Math.PI * r * r;
	}
	
	void print() {
		super.areaCircle(5); //메소드재정의하면 부모,자식것 둘다 생긴다
		areaCircle(5);		 //but 자식게 우선순위가 더 높음
	}
	
}
