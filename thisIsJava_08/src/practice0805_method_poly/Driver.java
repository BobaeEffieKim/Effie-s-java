package practice0805_method_poly;
//인터페이스의 다형성 보여주는 클래스
public class Driver {

	public void drive(Vehicle vehicle) {
		vehicle.run();
		
		//<매개변수의 다형성>>
		//drive라는 메소드가 실행될때 매개값으로 비히클의 구현객체가 들어온다
		//A구현객체 들어오면 A의 run 실행되고, B구현객체오면 B의 run 실행됨
	}
}
