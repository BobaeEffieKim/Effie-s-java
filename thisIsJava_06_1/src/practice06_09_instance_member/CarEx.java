package practice06_09_instance_member;

public class CarEx {

	public static void main(String[] args) {

		//Car클래스 타입의 변수선언
		Car myCar = new Car("포르쉐");
		Car yourCar = new Car("벤츠");
			//메모리에 두개의 객체가 생성되었고 각각의 참조변수(myCar, yourCar)를 참조하게 됨
		
		//메소드 호출
		myCar.run();
		yourCar.run();
			//각각의 객체에서 run메소드 실행됨
	}

}
