package practice_0702_inheritance;

public class DmbCellPhoneEx {

	public static void main(String[] args) {

		//자식객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
		
		
		System.out.println("모델 : "+dmbCellPhone.model);
		System.out.println("색상 : "+dmbCellPhone.color);
			//DmbCellPhone 클래스에 정의안되어있지만 상속받아서 사용할 수 있음
		System.out.println("채널 : "+dmbCellPhone.channel);
			//자기자신의 클래스에 가진 것 출력
		System.out.println();
		
		//상속받은 메소드
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요 나야 거기 잘 지내니");
		dmbCellPhone.receiveVoice("...");
		dmbCellPhone.sendVoice("여보세요 왜 말 안하니");
		dmbCellPhone.powerOff();
		System.out.println();
		//자신의 메소드
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb();
		dmbCellPhone.turnOffDmb();
	}

}
