package practice0805_field_poly;

public class Car {

	
	//바퀴를 인터페이스로 선언 -> 타이어는 교체가 용이하도록
		//-> 초기값으로 한국타이어라는 객체를 만들어서 대입
	Tire frontLeftTire = new HankoookTire();
	Tire frontRightTire = new HankoookTire();
	Tire backLeftTire = new HankoookTire();
	Tire backRightTire = new HankoookTire();
	
	void run() {
		//인터페이스 타입 필드를 이용하여 추상메소드 roll 호출
			//결국 인터페이스에 대입된 한국타이어의 롤이 실행될 것임
		
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
