package practice06_13_field_method.package1;

public class B {

	public B() {	//B 생성자

		//A클래스에 선언된것들을 사용하려면 A객체를 먼저 만들어놓고, 참조변수를 통해서 써야함
		A a = new A();
		
		a.field1 =1;
		a.field2 =1;
		//(오류) a.field3 =1;	//private으로 선언되어서 A클래스 외부에서는 사용할 수 없음
		
		a.method1();
		a.method2();
		//(오류) a.method3();	//private으로 선언되어서 A클래스 외부에서는 사용할 수 없음

		
		
		
	}
	
	
}
