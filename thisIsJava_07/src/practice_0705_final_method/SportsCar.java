package practice_0705_final_method;

public class SportsCar extends Car{

	@Override
	public void speedUp() {
		speed += 10;
	}
	
	
	//stop은 final이라서 재정의 할 수 없음
	
}
