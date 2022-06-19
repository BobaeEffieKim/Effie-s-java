package practice0805_casting;

public class Explanation {
/*
 *  * -------------------------------------------------------------
 * [강제 타입 변환(Casting)]
 * - 인터페이스 타입으로 자동 타입 변환 후, 다시 구현 클래스 타입으로 변환
 * 	-> 필요성 : 구현 클래스 타입에 선언된 다른 멤버를 사용하기 위해
 * 	=> 조건 : 인터페이스변수가 구현클래스 객체를 참조하고 있을때만 가능
 * 
 * 	구현클래스 변수 = (구현클래스) 인터페이스변수;
 * 
 * 
 * interface Vehicle{
 * 	void run();
 * }
 * 		↑(구현)
 * 
 * class Bus implements Vehicle{
 * 	void run(){...};	//재정의
 * 	void checkFare(){}	//자기 메소드
 * }
 * 
 * 
 * 
 * Vehicle vehicle = new Bus();
 *	//비히클은 인터페이스타입 변수이기때문에 인터페이스에 정의된 메소드만 호출할 수있기때문에 
 * vehicle.run();	-> 가능
 * vehicle.checkFare();	->불가능
 * 
 * Bus bus = (Bus) vehicle; 	//강제타입변환
 * 
 * bus.run(); ->가능
 * bus.checkFare(); -> 불가능
 * 
 * 

 */
}
