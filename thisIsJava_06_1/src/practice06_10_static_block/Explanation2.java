package practice06_10_static_block;

public class Explanation2 {

/*
 * [정적메소드와 정적 블록 작성 시 주의점]
 * 
 * -객체가 없어도 실행할 수 있기때문에 이들 블록 내부에 인스턴스 필드나 메소드를 사용불가
 * -객체 자신의 참조인 this 사용할 수 없음
 * 
 *	/인스턴스 필드와 메소드
 *int field1;
 *void method(){} 
 * 
 * 	/정적 필드와 메소드
 *static int field2; 
 *static void method2(){} 
 * 
 *	/정적 블록 
 *static{ 
 * 	field1 = 10;	->컴파일 에러 => 인스턴스필드이기때문에 사용불가
 * 	method1();		->컴파일 에러
 * 
 * 	field2 = 10;
 * 	method2();
 * }
 * 
 * 	/정적 메소드
 * static void Method3{
 * 	this.field1 = 10;	->컴파일 에러	=> 객체가 있어야만 사용될수있는인스턴스필드를 사용할 수 없음
 * 	this.method1();		->컴파일 에러	=> this는 객체가 있을때 자신을 표시하는것이기때문에 this도 사용불가
 * 
 * 	field2 = 10;
 * 	method2();
 * 
 * 	/정적 메소드 내에서 반드시 인스턴스멤버 사용하고 싶을때 => 객체 생성하여 사용하기
 * 
 *ClassName obj = new ClassName(); 
 *	=> obj라는 객체가 ClassName이라는 객체를 참조하고 있을 때 참조변수 통해서 인스턴스멤버 사용가능
 *obj.field1 = 10;	=> obj가 참조하는 객체로 가서 field1 사용하라
 *obj.method1(); 	=> obj가 참조하는 객체로 가서 method1 사용하라
 * 
 */
	
/////////////////////////////////////////////////////////////////////////////
/*
 * [main도 정적 메소드]
 * public class Car{
 * 
 * 	int speed;	 -> 인스턴스 멤버 => Car라는 객체가 생성되어야만 사용할 수 있음
 * 	
 *  void run(){} -> 인스턴스 멤버 => Car라는 객체가 생성되어야만 사용할 수 있음
 *  
 *  public static void main(String[] args){
 *  
 *  	speed = 60;	-> 컴파일 오류	=> main은 객체 생성없이 사용하는 정적 메소드이기때문에 맞바로 인스턴스사용하면 오류
 *  
 *  	run(); 		-> 컴파일 오류
 *  }
 * } 
 *  
 * public static void main(String[] args) {
 *	/그래서 Car라는 객체를 생성해서 이것을 통해 사용해야함
 * 	Car myCar = new Car();
 * 	myCar.speed = 60;
 * 	myCar.run();
 * }
 * 
 */
	
/////////////////////////////////////////////////////////////
/*

 * 
 * 
 * 
 * 
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
