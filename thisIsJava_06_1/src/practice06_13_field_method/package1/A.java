package practice06_13_field_method.package1;

public class A {

	//같은 클래스 내에서는 어느 접근제한자든지 다 사용할 수 있음
	
	//필드
	public int field1;	//-> public
	int field2;			//-> default
	private int field3;	//-> private
	
	//생성자	  -> 1. 생성 후 위의 필드 값을 한번 바꿔보자!
			//-> 2. 메소드 호출해보자!
			//-> 같은 클래스 내부라서 다 사용가능
	public A() {
		//1.
		field1 =1;
		field2 =1;
		field3 =1;
		//2.
		method1();
		method2();
		method3();
	}
	
	//메소드
	public void method1() {}	//-> public
	void method2() {}			//-> default
	private void method3() {}	//-> private
	
}
