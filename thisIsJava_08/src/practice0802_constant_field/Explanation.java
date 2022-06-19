package practice0802_constant_field;

public class Explanation {
/*
 * [인터페이스의 추상 메소드 선언]
 * - 인터페이스를 통해 호출된 메소드는 최종적으로 객체에서 실행됨
 * - 인터페이스의 메소드는 기본적으로 실행블록이 없는 추상메소드로 선언한다
 * 	=> 개발코드에서 인터페이스만을 보고 메소드를 호출 
 * 		=> 인터페이스는 자신이 참조하고있는 객체로가서 인터페이스의 메소드를 재정의한 메소드를 실행
 * 			=> 실행으로 리턴된 값을 인터페이스가 받아서 개발코드로 제공
 * 	-> 실제 실행되는 메소드가 객체에 있으므로 인터페이스에는 호출방법만 기술한 추상메소드사용
 * 	-> [public abstract] 리턴타입 메소드명(매개변수);
 * 
 * - public abstract를 생략하더라도 자동적으로 컴파일 과정에서 붙게된다
 * public interface RemoteControl{
 * 	public void turnOn();
 * 	public void turnOff();
 * 	public void setVolume(int volume);
 * }
 * 
 * -------------------------------------------------------------------
 * 
 * [default 메소드 선언]
 * - 자바8에서 추가된 인터페이스의 새로운 멤버
 * 	[public] default 리턴타입 메소드명(매개변수){}
 * - 실행 블록을 가지고 있는 메소드
 * - default 키워드를 반드시 붙여야한다
 * - 기본적으로 public 접근 제한을 가지므로 생략하더라도 컴파일할때 붙는다
 * 
 * public interface RemoteControl{
 * 	default void setMute(boolean mute){
 * 	if(mute){
 * 		system.out.println("무음 처리합니다.");
 * 	} else {
 * 		system.out.println("무음 해제합니다.");
 * 	}
 * }
 *}
 *
 * 
 * [정적 메소드 선언]
 * - 자바8에서 추가된 인터페이스의 새로운 멤버
 * 	[public] static 리턴타입 메소드명(매개변수){}
 * 
 * public interface RemoteControl {
 * 	static void changeBattery(){
 * 		sysout ("건전지를 교환합니다");
 * }
 * 
 * 
 * 
 */
}
