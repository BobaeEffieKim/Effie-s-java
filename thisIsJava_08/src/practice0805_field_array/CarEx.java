package practice0805_field_array;

public class CarEx {

	public static void main(String[] args) {

		Car myCar = new Car();

		myCar.run();
	
		//타이어교체
			//원래 코드 배열 타입으로 고쳐보기
		//myCar.frontLeftTire = new KumhoTire();
		myCar.tires[0] = new KumhoTire();
		
		//myCar.frontRightTire = new KumhoTire();
		myCar.tires[1] = new KumhoTire();
		
		myCar.run();
		
	}

}
