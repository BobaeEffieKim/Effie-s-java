package practice_0704_super;

public class SupersonicAirplane extends Airplane{

	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;	//초기값으로 노멀 상수값을 준다=>1값이 들어감
	
	//일반비행말고 초음속비행으로 바꿔주려면
	@Override
	public void fly() {
		
//	먼저 실습했던 것
//		super.fly();	//부모클래스에 있는 fly 먼저 실행하고 아래 출력한다
//		System.out.println("초음속 비행모드로 변경합니다.");
//		System.out.println("초음속 비행을 합니다.");
		
		if(flyMode == SUPERSONIC) {	//flymode가 슈퍼소닉이라는 값을 가지고있을경우 이렇게 실행
			System.out.println("초음속 비행합니다");
		} else {					//아닐경우 이렇게 실행
			super.fly(); 			//부모의 fly를 호출=> "일반비행합니다"
		}
		
	}
}
