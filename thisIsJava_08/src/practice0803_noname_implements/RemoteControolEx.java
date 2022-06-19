package practice0803_noname_implements;

import practice0802_static_method.RemoteControl;

//익명 객체를 사용할거라 구현클래스 아닌 실행 클래스에서 해보기
public class RemoteControolEx {

	public static void main(String[] args) {

		//인터페이스변수 선언할때, 뒤에 익명 구현객체가 온다
		RemoteControl rc1 = new RemoteControl() {
			
		//추상메소드 재정의 해야 컴파일 오류 나지않음
		//예전 구현 객체의 {}안에 온 내용을 카피해서 써도됨 (아래가 그부분)
			
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

		//다른 메소드를 추가할 수도 있음
			//하지만 추가된 필드와 메소드는 클래스 실행블록 내에서만 사용할 수 있음
			//rc라는 변수를 가지고 volume이나 otherMethod는 사용 할 수 없다
				//rc라는 변수를 통해서는 인터페이스에 선언된 애들만 사용 가능
			//결국 윗줄에서 언급된것들은 추상메소드 블럭 내에서만 사용될 수 있다
		public void otherMethod() {
			
		}
			
		}; 
	
		RemoteControl rc2 = new RemoteControl() {
			
			//추상메소드 재정의 해야 컴파일 오류 나지않음
			//예전 구현 객체의 {}안에 온 내용을 카피해서 써도됨 (아래가 그부분)
				
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

			//다른 메소드를 추가할 수도 있음
				//하지만 추가된 필드와 메소드는 클래스 실행블록 내에서만 사용할 수 있음
				//rc라는 변수를 가지고 volume이나 otherMethod는 사용 할 수 없다
					//rc라는 변수를 통해서는 인터페이스에 선언된 애들만 사용 가능
				//결국 윗줄에서 언급된것들은 추상메소드 블럭 내에서만 사용될 수 있다
			public void otherMethod() {
				
			}
				
			}; 
		
		
	}

}
