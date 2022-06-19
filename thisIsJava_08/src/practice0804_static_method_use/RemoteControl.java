package practice0804_static_method_use;

public interface RemoteControl {
	//상수 필드
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//디폴트 메소드	-> 반드시 구현 클래스 있어야함
		//디폴트메소드는 구현 클래스에 나타나진않음, 
		//하지만 텔레비전 클래스의 인스턴스 메소드로 선언되어있다고 가정해야함
	default void setMute(boolean mute) {
		//외부로부터 boolean타입인 뮤트값을 받아서 뮤트가 트루면 아래를,아니면 그 아래를 출력
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	//정적 메소드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
	
}
