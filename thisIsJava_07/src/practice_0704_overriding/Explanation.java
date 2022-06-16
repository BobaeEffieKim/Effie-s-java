package practice_0704_overriding;

public class Explanation {
/*
 * [메소드 재정의 (Override)]
 * - 부모클래스의 상속 메소드를 수정해서 자식 클래스에서 재정의하는 것
 * - 메소드 재정의 조건
 * 	-> 부모 클래스의 메소드 선언부와 동일해야함
 * 	-> 접근제한을 더 강하게 오버라이딩할수없다 (ex. public을 default or private으로 불가, 반대로 default는 public으로 수정가능)
 *  -> 새로운 예외를 throws 할 수 없다
 *  
 * [@Override 어노테이션]
 * - 컴파일러에게 부모 클래스의 메소드와 선언부가 동일한지 검사하도록 지시
 * - 정확한 메소드 재정의를 위해 붙여주는 것이 좋음(오탈자 등을 방지)
 * 
 *  public class Computer extends Calculator{
 *  @Override
 *  double areaCircle(double r) {
 *  	system.out.println("Computer 객체의 areaCircle() 실행");
 *  	return Math.PI * r * r;
 *  	}
 *  }	-> Calculator가 가지고 있는 areaCircle이라는 메소드가 있는데 Computer라는 자식클래스에서 재정의하고싶을때
 *  	-> 카큐레이터가 가지고있는 메소드 에리어서클의 선언부를 그대로 작성하여 재정으 할때,
 *  		제대로 정의되었는지 확인하기위해  @Override 붙여준다.
 *  
 *   
 *   [메소드 재정의 효과]
 * - 부모 메소드는 숨겨지는 효과 발생
 * 	-> 재정의된 자식 메소드가 실행
 * 	-> 부모클래스에도 있는 메소드가 자식클래스에서 재정의됐을때,
 * 		자식클래스에 먼저가서 보고 있으면 실행되고, 부모클래스꺼는 호출되지않음
 * 
 * class Parent{
 * 	void method1(){}
 * 	void method2(){}
 * }
 * 
 * ↑(상속)
 * 
 * class Child extends Parent{
 * 	void method2(){}	//메소드 재정의
 * 	void method3(){}	//자기 메소드
 * }
 * 
 * 
 * class ChildEx{
 * 	public static void main~{
 * 		//자식객체생성
 * 	Child child = new Child();
 * 
 * 	child.method1();	//부모클래스의 메소드1호출
 *  child.method2();	//먼저 자식객체 먼저확인-> 메소드2있으면 실행 , 부모 메소드2-> 호출되지않음
 *  child.method3();	//자식 클래스의 메소드3 호출
 * 
 * ---------------------------------------------

 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
}
