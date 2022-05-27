package com.yedam.java.ch0801;
//Remote Control 구현하는 클래스
public class TV implements Control{//RemoteControl,/*여기서부터 셋탑 연결했다치자*/ SmartControl {

	private int volume;	//인터페이스에서는 선언하지 못한 필요한 필드 하나 입력해주기
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 :"+this.volume);
	}

	@Override
	public void searchInternet(String url) {
		
	}

	@Override
	public void executeApp(String app) {
		
	}
	
	
	
	
	
}
