package practice0804_abstract_method_use;

public class Explanation {
/*
 * [인터페이스에 구현 객체를 대입하는 방법]
 * 
 * public class MyClass {
 * 
 * 	//필드에서 사용될때 -> 인터페이스 변수가 사용되고 초기값으로 구현객체가 대입될 수 있음 
 * 	RemoteControl rc = new Television();
 * 
 * 	//생성자 -> 매개변수로 인터페이스 변수를선언하여, 
 * 			나중에 객체 생성할때 구현객체 대입가능(아래줄처럼!!)
 * 		=> MyClass mc = new MyClass(new Television());
 * 		=> 인터페이스 변수에 대입될 수있는 객체는 이 인터페이스로 사용할 수있는 
 * 			즉 이 인터페이스의 구현객체라면 얼마든지 위의 매개변수 자리에 대입될 수 있음
 * 			예를 들어 , 텔레비전뿐만 아니라 오디오도 가능!
 * 
 * 	MyClass(RemoteControl rc){
 * 		this.rc = rc;
 * 	}
 * 
 * 	//메소드
 * 	void methodA(){
 * 		//1. 메소드 안에서 '로컬 변수'로 인터페이스 변수를 선언해서 사용할 수 있음
 * 			-> 구현객체가 대입된다
 * 		RemoteControl rc = new Audio();
 * }
 * 
 * 		//2. 메소드의 '매개변수'로 인터페이스변수가 사용될 수 있음
 * 			->위자리에 mc.methodB(new Audio());같은 다양한 구현객체가 호출되어서 사용될수있음
 * 	void methodB(RemoteControl rc){}
 * 
 * }
 * 
 * -------------------------------------------------------------------
 * [추상 메소드 사용]
 * 인터페이스 변수에 구현객체가 대입된 후 추상메소드를 인터페이스를 통해 호출을 했을 경우에,
 * 구현객체의 실제 재정의된 실체메소드가 실행된다
 * 
 * RemoteControl rc = new Television();
 * 	rc.turnOn();	-> Television의 turnOn() 실행
 * 	rc.turnOff();	-> Television의 turnOff() 실행
 * 
 * 개발코드[MyClass] -> 
 * 인터페이스[RemoteControl] > turnOn();과 turnOff();가짐 ->
 * 구현 객체[Television, Audio] > 텔레비전과 오디오 각각 turnOn(){}과 turnOff(){}구현
 * 								=> 리모콘에 의해 실제로 실행되는 메소드임
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
