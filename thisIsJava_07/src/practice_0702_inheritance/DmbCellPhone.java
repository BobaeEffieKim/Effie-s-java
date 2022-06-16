package practice_0702_inheritance;

public class DmbCellPhone extends CellPhone {

	//CellPhone의 필드와 메소드 다 물려받는다.
	
	//현재클래스의 추가적인 필드와 메소드 추가하기
	
	int channel;
	
	//생성자
	DmbCellPhone(String model, String color, int channel){
		this.model = model;		//부모에서 물려받은 값
		this.color = color;		//부모에서 물려받은 값
		this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.println("채널"+channel +"번 DMB방송 수신을 시작합니다.");
	}
	
	void changeChannelDmb() {
		this.channel = channel;//매개값으로 channel을 받아서 출력에 대입해준다
		System.out.println("채널"+channel +"번으로 바꿉니다.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB방송 수신을 멈춥니다.");
	}
	
	
}
