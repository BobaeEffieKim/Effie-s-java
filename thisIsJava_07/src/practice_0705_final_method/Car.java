package practice_0705_final_method;

public class Car {

	//필드
	public int speed;
	
	//메소드
	public void speedUp() {
		speed += 1;
	}
	
	public final void stop() {	//더이상 수정 못하도록 final 붙이기
		System.out.println("차를 멈춤");
		speed = 0;	//차를 멈추니까 당연히 속도는 0
	}
}
