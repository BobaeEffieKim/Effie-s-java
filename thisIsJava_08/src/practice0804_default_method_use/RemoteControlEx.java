package practice0804_default_method_use;

public class RemoteControlEx {

	public static void main(String[] args) {
		//인터페이스변수도 참조변수라서 구현객체 대입되기 전 null로 초기화할수있음
		RemoteControl rc = null;

		//변수에 구현객체 대입
		rc = new Television();
		//추상메소드 호출	-> Television의 turnOn이 실행됨
		rc.turnOn();
	
		//디폴트 메소드 호출
		rc.setMute(true);
			// 구현객체가 대입이 되어야만 디폴트 메소드 사용할 수 있음
			//RemoteControl.setMute(true); => 사용 불가!!!!!
		
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);	//Audio에서 재정의된 메소드가 호출됨 
		
	}

}
