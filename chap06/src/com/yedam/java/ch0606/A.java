package com.yedam.java.ch0606;

class A {} //default 상태

class B {  //default 동일한 패키지 내에서는 어디에 뭘로 쓰던 상관이 없음
	A a;
	
	B(A a){
		this.a = a;
	}
	
	void method() {
		A a;
	}
}
