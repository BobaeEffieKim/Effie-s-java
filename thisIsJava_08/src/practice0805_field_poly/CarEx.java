package practice0805_field_poly;

public class CarEx {

	public static void main(String[] args) {

		Car myCar = new Car();

		myCar.run();
	
		//타이어교체
		
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		
		myCar.run();
		
	}

}
