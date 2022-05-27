package com.yedam.java.ch0801;
//RemoteControl 구현 클래스
public class Audio implements RemoteControl {
	private int volume;//setVolume을 쓰기 위해 값을 담을 변수 하나 선언
	
	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = volume;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 오디오 볼륨 :"+this.volume);
	}

}
