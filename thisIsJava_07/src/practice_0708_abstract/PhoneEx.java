package practice_0708_abstract;

public class PhoneEx {

	public static void main(String[] args) {

		//Phone phone = new Phone();
			//폰이란 클래스로부터 객체를 생성하려하면 오류남
			//Phone은 추상클래스이기때문 -> 부모클래스로만 쓰여야함
		
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
//		
//		 * ※추상클래스는 객체로 생성될수는 있다
//		 * -> 직접적으로 new연산자로는 객체 생성 불가!!
//		 * -> 하지만 상속하여 자식클래스 통해서는 객체 생성될 수있음!!
	}

}
