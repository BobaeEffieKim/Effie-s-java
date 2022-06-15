package com.yedam.java.ch0701_01;

import com.yedam.java.ch0701.Phone;

public class SmartPhone extends Phone { //super때문에 처음에 오류뜸 -> 따라서 무조건 필수로필요한 생성자 가져온다 

	public SmartPhone(String model, String color) {
		super(model, color);
		
	}

	//파이널 클래스 ->나를 단독으로 쓴느건 상관없지만 자식은 만들지 않겠다
	//파이널 메소드 ->나를 단독으로 쓰는건 상관없지만 나를 재정의 할 수 없어
	
//	@Override
//	void powerOff() { 
//		System.out.println("휴대폰이 종료됩니다.");
//		super.powerOff();
//		//super.print();
//	}
//	
//	
//	@Override
//	void bell() {
//		super.bell();
//		System.out.println("벨소리 : 싸이 - that that");
//	}
//
//	@Override
//	void call() {
//		super.call();
//		System.out.println("안내 문구 : 전화는 용건만 간단히");
//	} 
//
//	
//	}
//	
	
	//메소드의 공식을 모르고 이름만 알고 있을때
	//마우스 우클릭 > 소스 > override/implement...>오버라이드 하고자하는 것 체크
	
}
