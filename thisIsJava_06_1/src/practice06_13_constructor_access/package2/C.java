package practice06_13_constructor_access.package2;

import practice06_13_constructor_access.package1.A;

public class C {

	//필드
	A a1 = new A(true);		//public
		//-> 자기자신클래스 타입의 a1이라는 필드 선언 
		//-> public A(boolean b) {}생성자를 호출해서 자기자신의 객체만들기
	
	//A a2 = new A();			//default	-> 같은 패키지 내에서가 아니라서 C에서 호출하면 오류남
	
	//A a3 = new A("문자열");	//private	-> 같은 클래스 내에서가 아니라서 C에서 호출하면 오류남
	
	
	
}
