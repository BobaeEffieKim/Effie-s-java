package practice0805_method_poly;

public class Explanation {
/*
 *  * ---------------------------------------------------------------
 * [매개변수의 다형성]
 * 
 * 인터페이스-> Vehicle
 * 				↑(구현)
 * 구현클래스 -> Bus
 * 
 * public class Driver{
 * 
 * 	//매개변수로 인터페이스타입 객체줌. -> 인터페이스의 런 메소드 호출
 * 	public void drive(Vehicle vehicle){
 * 		vehicle.run();
 * 	}
 * }
 * 
 * 
 * void drive(Vehicle vehicle){
 * 	vehicle.run();	=>구현객체가 재정의한 런 메소드가 실행됨
 * }
 * 
 * =>
 * 	드라이버클래스로부터 객체 생성
 * Driver driver = new Driver();
 * 	버스객체 생성 -> 비히클 인터페이스 구현한 클래스
 * Bus bus = new Bus();
 * 
 * 	드라이브 메소드 매개값에 인터페이스의 구현객체 대입
 * driver.drive(bus);		=>자동타입변환 Vehicle vehicle = bus;
 * 
 * 

 * 
 * 
 */
}
