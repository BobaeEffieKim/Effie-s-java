package practice0803_multi_implement;
//두개의 인터페이스 구현하는 클래스
public class SmartTv implements RemoteControl, Searchable {

	private int volume;
	
	//RemoteControl 인터페이스의 추상메소드에 대한 실체 클래스
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : "+volume);
	}
	
	//Searchable 인터페이스의 추상메소드에 대한 실체 클래스
	public void search(String url) {
		System.out.println(url +"을 검색합니다.");
	}
}
