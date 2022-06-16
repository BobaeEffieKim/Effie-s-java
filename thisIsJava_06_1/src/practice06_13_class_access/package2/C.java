package practice06_13_class_access.package2;

import practice06_13_class_access.package1.B;

public class C {

	// C클래스에서 A타입 필드 a를 선언
	//A a; 	(x)컴파일 오류남 -> A는 default걸려있는 다른 패키지 클래스라서 
	
	B b;	//B가 다른패키지에 있으므로 import(ctrl+shift+o)시켜주면 사용 가능함 => public이라서!!
}
