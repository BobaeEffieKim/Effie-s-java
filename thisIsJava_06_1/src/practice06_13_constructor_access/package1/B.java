package practice06_13_constructor_access.package1;

public class B {

	
	
	//필드
	A a1 = new A(true);		//public
		//-> 자기자신클래스 타입의 a1이라는 필드 선언 
		//-> public A(boolean b) {}생성자를 호출해서 자기자신의 객체만들기
	
	A a2 = new A();			//default
	
	//A a3 = new A("문자열");	//private	-> 같은 클래스 내부에서만 가능하므로 B에서 호출하면 오류남
	
	
}
