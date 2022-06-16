package practice06_13_field_method.package2;

import practice06_13_field_method.package1.A;

public class C {

	public C() {	//C생성자
		
	A a = new A();
	
	a.field1 =1;
	//(오류) a.field2 =1;	//default로 선언되어서 다른 패키디에서는 사용할 수 없음
	//(오류) a.field3 =1;	//private으로 선언되어서 A클래스 외부에서는 사용할 수 없음
	
	a.method1();
	//(오류) a.method2();	//default로 선언되어서 다른 패키디에서는 사용할 수 없음
	//(오류) a.method3();	//private으로 선언되어서 A클래스 외부에서는 사용할 수 없음

	}
}
