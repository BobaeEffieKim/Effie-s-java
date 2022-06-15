package com.yedam.java.ch0606.pacakge1;

public class B {

	//필드
	A a1 = new A(true);
	A a2 = new A(1);
	//(오류) A a3 = new A("문자열"); //private은 클래스 내에서만 허용가능하기때문에 오류남
	
	
	//생성자
	public B() {
		
		A a = new A(); //A에서 불러온 값이니 new연산자를 써서 호출
		a.field1 = 1;
		a.field2 = 1;
	//(오류) a.field3 = 1; //접근제한자가 private이기 때문에 처음에 오류남.
		
		a.method1();
		a.method2();
	//(오류) a.method3();
	}
	
	
}
