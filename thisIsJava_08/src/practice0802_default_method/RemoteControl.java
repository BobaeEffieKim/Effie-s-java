package practice0802_default_method;

public interface RemoteControl {

	public static final int MAX_VOLUME =10;
	int MIN_VOLUME =0;

	
	//추상 메소드 선언
	public abstract void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//defulat method
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
}
