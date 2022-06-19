package practice0805_casting;

public class VehicleEx {

	public static void main(String[] args) {

		//인터페이스타입 변수 선언 , 구현객체 생성하여 대입
		Vehicle vehicle = new Bus();
		
		//비히클로 접근하여 호출할 수있는 메소드는 run뿐 => 인터페이스에 런만 정의돼서!
		vehicle.run();
		
		//꼭 체크페어 메소드 호출하고 싶을때 => 강제 타입변환
			//Vehicle인터페이스타입을 다시 Bus타입으로 복원한다
			//처음에 버스객체를 생성하여 비히클레 대입했기때문에 , 역으로 해준다고 생각하면 이해감
		Bus bus = (Bus) vehicle;
		bus.run();
		bus.checkFare();
		
	}

}
