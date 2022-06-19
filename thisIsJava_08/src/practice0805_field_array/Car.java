package practice0805_field_array;

public class Car {

	//1. 타이어 인터페이스 타입의 배열로 배열 변수 선언, 
	//2. 구현객체(한국타이어)를 항목으로 대입
	Tire[] tires = {
			new HankoookTire(),
			new HankoookTire(),
			new HankoookTire(),
			new HankoookTire()
	};
	
	
	
	void run() {
		
		//타이어 타입의 인터페이스를 선언 (Tire tire)
		//배열 객체 (tires) 지정	
		//-> 배열의 길이(항목의 수)만큼 for문 반복됨
		//-> 한번 반복할때마다 tires 항목객체 을 Tire tire에 대입
		for(Tire tire : tires) {
			tire.roll();	//tire인터페이스의 roll메소드 호출
		}
	}
}
