package practice0805_instanceof;
//인터페이스의 다형성 보여주는 클래스
public class Driver {

	//<매개변수의 다형성>>
	//drive라는 메소드가 실행될때 매개값으로 비히클의 구현객체가 들어온다
	//A구현객체 들어오면 A의 run 실행되고, B구현객체오면 B의 run 실행됨
	public void drive(Vehicle vehicle) {

		//버스 객체가 들어오면 요금체크를 하도록 만들어보기
		if(vehicle instanceof Bus) {
			//비히클 인터페이스가 참조하는 객체가 버스인가 확인
		
		//실행클래스에서 매개값으로 버스를 넣어주면 위의 drive메소드 매개값으로 버스가 들어와서
			//if절이 true가 되어서 checkFare메소드까지 실행
			//bus가 아닌 다른 매개값 들어오면, if절이 false가 되어 run메소드만 실행
			
			Bus bus = (Bus)vehicle;
			bus.checkFare();
		}
		vehicle.run();//위의 여부와 상관없이 모든 비히클은 달리기때문에 
		
	}
}
