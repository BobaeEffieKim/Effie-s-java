package practice_0707_promotion;

public class Child extends Parent{

		 
	@Override	//부모 클래스의 메소드 오버라이딩
	public void method2() {
		System.out.println("Child-method2()");
	}
	
	public void method3() {	//자식 본인의 메소드
		System.out.println("Child-method3()");
	}
}
