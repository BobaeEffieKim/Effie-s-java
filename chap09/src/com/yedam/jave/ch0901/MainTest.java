package com.yedam.jave.ch0901;

public class MainTest {

	public static void main(String[] args) {
//중첩클래스
		A a = new A();
//		
		
		//인스턴스 멤버 클래스
//		A.B b = a.new B(); //A클래스로 만들어진 인스턴스(a변수 이용)로 내부클래스 B에 접근할 수 있음
//		b.field1 = 1;
//		b.method1(); 
//		
//	}
		//정적 멤버 클래스
		A.C.field2 = 2;	//인스턴스와 상관없이 C클래스에 대해서 바로 접근 가능
		A.C.method2();  //C클래스 자체가 A클래스 안에 있기때문에 A.C.으로 들어갈뿐
		
		A.C c = new A.C();
		c.field1 =1;
		c.method1();
		
		System.out.println();
		
		//로컬 클래스
		a.method();

	}
}