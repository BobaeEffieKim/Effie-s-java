package practice0804_default_method_use;

public class Explanation {
/*
 * [디폴트 메소드 사용]
 * 
 * //디폴트 메소드	-> 반드시 구현 클래스 있어야 사용될수있음
		//디폴트메소드는 구현 클래스에 나타나진않음, 
		//하지만 보이진않아도 구현 클래스의 인스턴스 메소드로 선언되어있다고 가정해야함
 * 
 * public interface RemoteControl{
 * 	default void setMute(boolean mute){
 * 
 * 	}
 * }
 * - 인터페이스만으로는 사용할 수 없다
 * 		 RemoteControl.setMute(true); => 사용불가
 * 	-> 구현 객체가 인터페이스에 대입되어야 호출할 수 있는 인스턴스 메소드이다
 * 		RemoteControl rc = new Television();
 * 		rc.setMute(true);
 * 
 * - 인터페이스를 구현하는 모든 구현 객체(ex.텔레비젼,오디오)가 가지고 있는 기본 메소드로 사용한다
 * 	-> 필요에 따라 구현클래스가 디폴트 메소드를 재정의해서 사용할 수 있다
 * 
 * 
 *------------------------------------------------------------------
 * 

 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
}
