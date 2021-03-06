package com.yedam.jave.ch0901;

public class Y {

	//필드
	int field1;
	static int field2;
	//메소드
	void method1() {}
	static void method2() {}
	
	//인스턴스 멤버 클래스 -> Y클래스의 인스턴스가 반드시 존재한다는 의미
	//				 ->	인스턴스가 접근할 수 있는 모든 내부 멤버를 호출할 수 있음.
	class B{
		void method() {
			field1 = 1;
			field2 = 2;
			
			method1();
			method2();
		}
	}
	
	//정적 멤버 클래스 -> Y클래스의 인스턴스가 존재하지 않음. 정적 멤버 클래스를 사용할때 인스턴스가 필요없음
	// 			  -> Y클래스의 정적 내부 멤버들만 호출할 수 있음.
	static class C{
		void method() {
			//(오류) field1 = 1;
			field2 = 2;
			
			//(오류) method1();
			method2();
		}
	}
	
	void method(int arg) {
		int var = 1;
//		arg = 100;
//		var = 90;
		class D {
			void method() {
				//(오류) 		int result = arg + var;
			}
		}
		D d = new D();
		d.method();
		var = 2;
		//(오류) return var;
	}
	
	
	
}
