package practice0804_default_method_use;

public class Audio implements RemoteControl{

	private int volume;
	
	private boolean mute;
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}

	@Override	
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			System.out.println("현재 Audio 볼륨 : " + this.volume);
		}
	}

	//디폴드메소드 재정의하기! 	
		//실제 구현클래스에서 재정의할때는 default키워드 붙이지않음
	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		
		if(mute) {
			System.out.println("Audio 무음 처리합니다.");
		} else {
			System.out.println("Audio 무음 해제합니다.");
		}
		
	}
}
