package com.yedam.jave.ch0901;

public class A {

	A(){
		System.out.println("A 인스턴스가 생성됨.");
	}
	
	
	//인스턴스 멤버 클래스
	class B{
		//필드
		int field1;
		//생성자
		B(){		//중첩 클래스도 인스턴스 만들 수 있음
			System.out.println("B 인스턴스가 생성됨.");
		}
		//메소드
		void method1() {
			
		}
	}
	

//정적 멤버 클래스
	
	static class C{ 		//static 붙어서 정적 멤버 클래스가 되었음
		
		//필드
		int field1;
		static int field2;
		//생성자
		C() {
			System.out.println("C 인스턴스가 생성됨.");
		}
		//메소드
		void method1() {}
		static void method2() {}	
		
	}
	
	void method() {
		//로컬 클래스	->정적 멤버들을 가지지 못한다. 
		class D {		//로컬클래스는 메소드 내에 클래스를 정의해버림.
		
			//필드
			int field1;
			//생성자
			D(){
				System.out.println("D 인스턴스가 생성됨.");
			}
			//메소드
			void method1() {}
			
		}
		D d = new D();
		d.field1 = 1;
		d.method1();
	}
	
	
}

	
	