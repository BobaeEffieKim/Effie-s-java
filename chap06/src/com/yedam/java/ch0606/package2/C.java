package com.yedam.java.ch0606.package2;

import com.yedam.java.ch0606.pacakge1.A;

public class C {

		//필드 -> 접근제한자 없으면 자동으로 디폴트
		A a1 = new A(true);
		//(오류) 	A a2 = new A(1);	    // defult 라서 패키지 벗어나면 오류
		//(오류) A a3 = new A("문자열");  //private 이기때문에 클래스 벗어났을때부터 오류
		
		
		//생성자
		public C() {
			
			A a = new A(); //A에서 불러온 값이니 new연산자를 써서 호출
			
			a.field1 = 1;
			//(오류) a.field2 = 1; //접근제한자가 default라서 오류
			//(오류) a.field3 = 1; //접근제한자가 private이기 때문에 처음에 오류남.
			
			a.method1();
			//(오류) a.method2();  //접근제한자가 default라서 오류
			//(오류) a.method3();  //접근제한자가 private이기 때문에 처음에 오류남.
		}
		
		
		
	
}
