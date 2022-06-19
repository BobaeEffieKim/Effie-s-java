package practice0804_abstract_method_use;

public class Audio implements RemoteControl{

	private int volume;
	
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

}
