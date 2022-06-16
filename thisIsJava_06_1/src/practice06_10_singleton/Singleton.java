package practice06_10_singleton;

public class Singleton {

	//자기자신의 타입으로 필드선언
	private static Singleton singleton = new Singleton();
		//-> 초기화는 자신의 객체 하나를 만들어서 해줌. 자기자신 내부에서는 생성자 사용가능
	
	//생성자-> 외부에서 new로 호출할 수없도록 private으로 막는다
	private Singleton() {
		
	}
	
	//외부에서 호출할 수있는 메소드 만들기
	static Singleton getInstance() {	//싱글톤타입의 메소드, 관례적으로 싱글톤은 이름이 getInstance메소드를 가짐
		return singleton;				//자기자신의 객체인 싱글톤 필드값을 리턴해줌-> 항상 얘가 리턴됨
	}
}
