package practice0805_field_poly;

public class Explanation {
/*
 * <<타입변환과 다형성>>
 * 
 * [다형성]
 * - 하나의 타입에 여러가지 객체를 대입해서 다양한 실행 결과를 얻는것
 * 		->(상속) 하나의 타입 -> 부모 객체 / 여러객체 -> 자식 객체
 * 		->(인터페이스) 하나의 타입 -> 인터페이스 타입 / 여러객체 -> 구현 객체
 * - 다형성을 구현하는 기술
 * 	-> 상속 또는 인터페이스의 자동타입변환(Promotion)
 * 	-> 오버라이딩(Overriding)
 * 
 *- 다형성의 효과
 *	-> 다양한 실행 결과를 얻을 수 있다
 *	-> 객체를 부품화시킬 수 있어 유지보수가 용이하다
 *
 *
 * [인터페이스를 이용한 다형성 개념]
 * 
 * (프로그램)
 * 
 * I i = new A(); A구현 객체를 대입했다가 문제가 생겨 아래와 같이 B객체로 대체 
 * I i = new B();
 * 
 * i.method1();	//수정이 필요없음 -> B대입 후엔 B의 메소드 1,2가 호출될것임
 * i.method2();	//수정이 필요없음
 * 
 * 
 * interface I {
 * 	void method1();	->인터페이스에 선언된 추상메소드들을 구현객체 A,B에서 각각 호출가능
 * 	void method2();
 * }
 * 
 * 
 * [인터페이스는 매개변수 타입으로 자주 등장한다]
 * - 메소드 호출시 매개값으로 여러가지 종류의 구현 객체를 대입할 수 있어 
 * 메소드 실행 결과가 다양하게 나온다.
 * 
 * 					<<interface>>
 * 					RemoteControl
 * 						 ↑(구현)
 * 			Television			Audio
 * 
 * public void useRemoteControl(RemoteControl rc){}
 * 	-> 나중에 이 메소드를 호출할때 Television과 Audio객체를 매개값으로 사용 가능
 * 	-> ex. useRemoteControl(new Television());
 * 	-> useRemoteControl(new Audio());
 * => 즉, 구현 객체에 따라 이 메소드의 실행블록{}안에서의 내용이 달라진다
 * 
 * 
 * [자동 타입 변환]
 * 
 * 인터페이스 변수 = 구현객체
 * 	-> 구현객체가 인터페이스타입으로 자동 변환 된다
 * 
 * 			인터페이스 A
 * 		↑				↑
 * 	구현 클래스 B 		구현 클래스 C
 * 		↑				↑
 * 	자식 클래스 D		자식 클래스 E
 * 
 * B b = new B();
 * C c = new C();
 * D d = new D();
 * E e = new E();
 *=>
 *	A a1 = b;	(가능) 
 *	A a2 = c;	(가능)
 *	A a3 = d;	(가능)	//B가 가진 메소드를 D도 가지고 있기때문에 가능
 *	A a4 = e;	(가능)	//위의 원리와 마찬가지
 *	 		
 *
 * -------------------------------------------------
 * 
 * [인터페이스 배열로 구현 객체 관리]
 * 
 * 	-> 배열의 항목으로 구현 객체가 대입될 수 있음
 * 	-> 인덱스로 항목을 접근할 수 있음
 * 
 * Tire[] tires {
 * 	new HankookTire(),
 * 	new HankookTire(),
 * 	new HankookTire(),
 * 	new HankookTire(),
 * };
 * 
 * 
 * tires[1] = new KumhoTire();
 * 	-> 두번째항목에 있는 것을 금호타이어로 교체하겠다
 * 
 * 
 * void run(){
 * 	for(Tire tire : tires){
 * 		tire.roll();
 * 	}
 * }
 * 	-> 각 항목의 타이어에 롤 메소드를 호출하고 싶다면, 네번씩 타이어라는 항목을 가져와서
 * 	타이어의 롤을 호출한다
 * 

 * 
 * 
 * 
 * 
 */
}
