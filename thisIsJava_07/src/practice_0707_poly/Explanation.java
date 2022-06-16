package practice_0707_poly;

public class Explanation {
/*
 * <<필드의 다형성>>
 * 
 * [다형성을 구현하는 기술적 방법]
 * -부모타입으로 자동변환되어야 한다
 * -자식클래스에서 재정의된 메소드(오버라이딩)가 있어야한다
 * 
 * 					void roll(){}
 * 			↑(상속)          				↑(상속)
 * [한국타이어에서 재정의]void roll(){}	 [금호타이어에서 재정의]void roll(){}
 * 
 * class Car{
 * 	->카를 설계할때 타이어타입으로 네개의 타입을 선언
 *	/필드	-> 초기값으로 타이어 객체를 생성하여 대입
 *	Tire frontLeftTire = new Tire();
 * 	Tire frontRightTire = new Tire();
 * 	Tire backLeftTire = new Tire();
 * 	Tire backRightTire = new Tire();
 * 
 * 	/메소드
 * 	void run(){}
 * }
 * 
 * 
 *  * void run(){	-> 런 메소드 정의. => 롤 메소드를 필드에 호출
 *  	=> 카 객체를 만들어서 런 메소드를 실행하면 -> 각 타이어의 롤이라는 메소드가 실행되게 설계
 * 	frontLeftTire.roll();
 * 	frontRightTire.roll();
 * 	backLeftTire.roll();
 * 	backRightTire.roll();
 * }
 * 
 * 	/실핼
 * Car myCar = new Car();	-> 카 객체 생성하여 마이카가 참조하도록 대입
 * 
 * myCar.frontRightTire = new HankookTire(); 앞오른쪽타이어에 한국타이어객체 대입
 * 	-> 원래 타이어 객체가 대입되어있었는데, 한국타이어로 다시 대입 (타이어 상속받는 한국타이어라 가능)
 * myCar.backLeftTire = new Kumhotire();
 * 	-> 기존의 타이어 객체를 금호타이어로 교체
 * myCar.run();
 * 	-> 이 메소드가 실행되면 앞오른타이어와 왼뒤 타이어는 각 교체된 타이어가 실행됨
 * 
 * 즉, 다형성이란
 * -> 다양한 자식객체들을 대입할 수 있고 , 각기다른 자식객체들이 실행될 수 있음
 * -> 필드에 각기다른 여러객체를 대입하므로해서 클래스의 실행결과가 다양해질수있음
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
