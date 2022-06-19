package practice0803_interface_implement;

import practice0802_static_method.RemoteControl;

public class Television implements RemoteControl{

	private int volume;	//텔레비전의 현재 볼륨 값을 저장할 수있는 필드
	
	//구현 메소드
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
		//setVolume을 호출할 때 주어진 매개값 볼륨을 통해서 위에 필드 볼륨에 설정할 것임
		
		//올바른 값(0~10)만 들어갈 수있도록 매개값 검사할 수있게
		if(volume > RemoteControl.MAX_VOLUME) {
			//맥스볼륨보다 더 큰 값이 들어온다면 볼륨은 무조건 맥스볼륨으로 설정해버림
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {	//그렇지않고 범위내의 볼륨이 들어왔다면 볼륨의 필드값으로 매개값을 설정하라
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 " + this.volume);
	}

	
	
}
