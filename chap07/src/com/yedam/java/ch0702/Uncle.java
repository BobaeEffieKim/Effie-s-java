package com.yedam.java.ch0702;
/*
 * 아버지 형제 
 * 조부모 메소드 상속받음
 */


public class Uncle extends Grandpa {

	@Override
	void method() {
		System.out.println("Uncle 메소드");
	}
	
	
	//아래는 추가된 내용 -> ChildTest2 로 이어짐
	void method3() {
		System.out.println("Uncle 고유 메소드");
	}
	
	
}
