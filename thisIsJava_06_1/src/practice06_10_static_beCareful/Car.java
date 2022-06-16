package practice06_10_static_beCareful;

public class Car {

	int speed;
	
	void run() {
		System.out.println(speed +"으로 달립니다.");
	}
	
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.speed=60;	//myCar가 참조하는 객체로가서 speed 필드 사용해라
		myCar.run();	//myCar가 참조하는 객체로가서 run메소드 실행해라
	}

	//학습의 편의성을 위해 라이브러리클래스와 실행클래스를 한페이지에 작성한것임.
	
}
