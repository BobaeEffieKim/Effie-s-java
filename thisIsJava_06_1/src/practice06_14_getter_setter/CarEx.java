package practice06_14_getter_setter;

public class CarEx {

	public static void main(String[] args) {

		//객체 생성 , getter 사용 -> 필드값 읽기
		Car myCar = new Car();
		//setter 사용 -> 필드값 저장
		myCar.setSpeed(-50);
		myCar.setStop(false);
		
		System.out.println("현재속도 : "+myCar.getSpeed());	//Car 클래스의 speed에 저장되어있는 값을 현재 클래스에서 생성한 객체에서 읽을 수 있도록
		
		if(!myCar.isStop()) {	//stop게터에서 값이 true로 나오면 false로 바꿔주고, false가 나오면 true로 바꿔줘라
			myCar.setStop(true);//stop이 false가 될때 setstop에 true를 줘서 자동차를 멈추도록해라
		}
		System.out.println("현재속도 : "+myCar.getSpeed());
		System.out.println(myCar.isStop());
		
		
	}

}
