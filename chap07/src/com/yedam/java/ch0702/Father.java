package com.yedam.java.ch0702;

/*
 * 아버지 메소드 /부모
 * 조부모 메소드 상속받음
 */

public class Father extends Grandpa{

	@Override
	void method( ) {
		System.out.println("Father 메소드");
	}
	
	
	//아래는 추가 된 내용 -> ChildTest2 로 이어짐
	void method2() {
		System.out.println("Father 고유 메소드");
	}
	
	
}
