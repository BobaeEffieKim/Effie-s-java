package practice0803_interface_implement;

import practice0802_static_method.RemoteControl;

public class RemoteControlEx {

	public static void main(String[] args) {

		// 인터페이스 변수 선언
		RemoteControl rc;
		//인터페이스는 객체를 생성할 수 없음, 구현객체가 대입되어야함
		rc = new Television();
		
		//인터페이스를 통해서 인터페이스의 추상메소드들 호출 가능
		rc.turnOn();
		rc.turnOff();	//최근에 실행된 Audio의 메소드들로 실행될것임
	}

}
