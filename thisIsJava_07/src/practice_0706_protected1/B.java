package practice_0706_protected1;

public class B {

	
	public void method() {
		A a = new A();
		//protected  였던 A의 생성자 생성할 수 있음 -> 같은 패키지 내에 있기때문
		
		a.field = "value";	//같은 패키지 내이기때문에 a의 필드와 메소드 호출 가능
		a.method();
	}
	
}
