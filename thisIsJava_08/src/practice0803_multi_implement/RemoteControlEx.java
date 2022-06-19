package practice0803_multi_implement;

public class RemoteControlEx {

	public static void main(String[] args) {

		//객체 생성
		SmartTv tv = new SmartTv();
		//인터페이스타입 변수에 객체 대입
			//tv객체를 리모트컨트롤 인터페이스 변수에 대입, 서처블인터페이스 변수에 대입
		//RemoteControl rc = new SmartTv();이렇게 해도되지만
		//미리 객체를 생성해 놓고, 한번은 리모트 인터페이스로 사용하고,한번은 서처블로 사용할수있게끔
		
		RemoteControl rc = tv;
		//RemoteControl인터페이스에 선언된 추상메소드를 rc통해서 호출
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		
		Searchable sc = tv;
		sc.search("www.naver.com");
	}
	

}
