package practice06_13_constructor_access.package1;

public class A {

	//필드
	A a1 = new A(true);		//public
		//-> 자기자신클래스 타입의 a1이라는 필드 선언 
		//-> public A(boolean b) {}생성자를 호출해서 자기자신의 객체만들기
	
	A a2 = new A();			//default
	
	A a3 = new A("문자열");	//private
	
	
	//생성자 오버로딩 
	//-> 여러개의 생성자 선언/ 매개변수의 타입,수,순서가 다르면 얼마든지 생성해서 사용할 수 있음
	
		//public 생성자
	public A(boolean b) {}
	
		//default 생성자
	A(){}
		//private 생성자
	private A(String s) {}	// -> 보통 싱글톤 만들때 이렇게 함
}
