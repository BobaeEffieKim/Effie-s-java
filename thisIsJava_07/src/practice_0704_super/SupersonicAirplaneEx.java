package practice_0704_super;

public class SupersonicAirplaneEx {

	public static void main(String[] args) {

		
		SupersonicAirplane sa = new SupersonicAirplane();
		
//		//먼저 실습했던 것
//		sa.fly(); 	//슈퍼소닉에어플레인 클래스에서 재정의 된 fly 실행
//					//출력순서 1.부모클래스의 fly먼저 실행, 2.그다음 자식에서 오버로딩된코드 차례로 출력
		
		sa.takeOff();
		sa.fly();  		//자식에서 재정의한 메소드
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();		//자식에서 재정의한 메소드
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();		//자식에서 재정의한 메소드
		sa.land();
	}

}
