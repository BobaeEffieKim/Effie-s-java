package practice0804_abstract_method_use;

public class RemoteControlEx {

	public static void main(String[] args) {
		//인터페이스변수도 참조변수라서 구현객체 대입되기 전 null로 초기화할수있음
		RemoteControl rc = null;

		//변수에 구현객체 대입
		rc = new Television();
		//추상메소드 호출	-> Television의 turnOn이 실행됨
		rc.turnOn();
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
	}

}
