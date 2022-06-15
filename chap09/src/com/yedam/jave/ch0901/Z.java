package com.yedam.jave.ch0901;

public class Z {	//Z클래스 안에 클래스 B와 C가 존재

	//인스턴스 멤버 -> Z클래스의 인스턴스가 존재한다는 걸 의미
	B field1 = new B();	//Z클래스의 인스턴스가 존재
	C field2 = new C();	//Z클래스의 정보만 있으면 됨 -> 
	
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	//정적 멤버 -> Z클래스의 인스턴스가 없을 수 있다.
	//(오류) static B field3 = new B(); //B클래스는 Z클래스의 인스턴스가 반드시 필요함. 따라서 정적필드와 정적 메소드에서는 사용 불가.
	static C field4 = new C(); //Z클래스의 정보만 필요
	
	static void method2() {
		//(오류) 	B var1 = new B();
		C var2 = new C();
	}
	
	//인스턴스 멤버 클래스
	class B{}
	//정적 멤버 클래스
	static class C{}
	
	
}



//생성자는 인스턴스 만들기 위해 존재함