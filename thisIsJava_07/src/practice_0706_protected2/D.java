package practice_0706_protected2;

import practice_0706_protected1.A;
	//A가 다른패키지에 있었기 때문에 import 필요 (ctrl+shift+o)

public class D extends A{

	public D() {
		super();
		
		//A가 protected라서 다른 패키지에 있지만 자식 클래스인 D 클래스에서 A멤버사용가능
		this.field = "value";
		this.method();
		
	}
	
	public void method() {
		
		this.field = "value";
		this.method();
		
	}
}
