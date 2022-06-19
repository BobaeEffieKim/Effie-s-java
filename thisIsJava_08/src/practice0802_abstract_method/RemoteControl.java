package practice0802_abstract_method;

public interface RemoteControl {

	public static final int MAX_VOLUME =10;
	int MIN_VOLUME =0;

	
	//추상 메소드 선언
	public abstract void turnOn();
	void turnOff();
	void setVolume(int volume);
	
}
