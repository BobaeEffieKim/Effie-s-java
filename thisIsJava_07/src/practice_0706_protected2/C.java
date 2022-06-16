package practice_0706_protected2;

import practice_0706_protected1.A;

public class C {

	public void method() {
		
		//A가 protected로 선언된 객체이기때문에 다른 패키지인 C에서는 사용불가 
		
		//A a = new A();
		
		//a.field = "value";	
		//a.method();
	}
	
	
}
