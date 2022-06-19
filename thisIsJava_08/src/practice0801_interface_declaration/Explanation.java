package practice0801_interface_declaration;

public class Explanation {

/*
 * [인터페이스란]
 * - 개발 코드와 객체가 서로 통신하는 접점
 * 	-> 개발 코드는 객체의 내부 구조를 알 필요가 없고 인터페이스의 메소드만 알고 있으면 됨
 * 	-> 개발하는코드가 어떤 객체를 이용하려고한다 (메소드 호출하여 결과를 받는것을 이야기함)
 * 		=> 이때 개발코드가 직접 객체를 이용하는게 아니라 중간에 있는 인터페이스의 메소드를 호출
 * 		=> 인터페이스는 참조하는 객체를 이용하여 객체의 해당 메소드를 실행시켜 결과를 리턴받아 개발코드에 넘겨줌
 * 
 * [인터페이스의 역할]
 * - 개발 코드가 객체에 종속되지않게하여 객체를 교체할 수 있도록하는 역할
 * 	-> 인터페이스를 사용하는 객체라면 개발코드는 (인페뒤에있는 객체상관없이)오로지 인터페이스만 보고 작성됨?
 * 		=> 인터페이스 뒤의 객체가 문제있어서 변경되더라도 인터페이스에 문제가 없는한 개발코드에 문제없게됨
 * - 개발 코드 변경없이 리턴값 또는 실행 내용이 다양해질 수있다(다형성)
 * 		=> 개발코드가 인터페이스에서 같은 메소드를 호출하더라도 
 * 			인페뒤에있는 어떤 객체가 사용되느냐에따라 결과값이 달라질 수 있음
 * 
 * -------------------------------------------------------------- 
 * 
 * [인터페이스 선언]
 * 
 * - 인터페이스 이름
 * 	-> 자바 식별자 작성 규칙에 따라 작성 (클래스 이름 짓듯이)
 * 		=> 첫글자 대문자, 문자로시작, 특수문자는 $와_만
 * 
 * - 소스 파일 생성
 * 	-> 인터페이스 이름과 대소문자가 동일한 소스 파일을 생성 (인터페이스명.java)
 * 
 * - 인터페이스 선언 (접근제한자는 퍼블릭이나 디폴트가 온다)
 * [public] interface 인터페이스명{}
 * 
 * - 인터페이스 구성 멤버 -> 위의 {}안에 들어가는 멤버
 * 	-> 상수 
 * 	-> 추상메소드
 * 	-> 디폴트메소드
 * 	-> 정적 메소드
 * 
 * 
 * interface 인터페이스명 {
 * 	//상수
 * 	타입 상수명 = 값;
 * 		->인터페이스에서의 모든필드는 모두 static final의 성질을 갖는다
 * 		->초기값을 반드시 줘야한다
 * 
 * 	//추상메소드
 * 	타입 메소드명(매개변수);
 * 		-> abstract
 * 
 * 	//디폴트메소드
 * 	default 타입 메소드명(매개변수){}
 * 		-> 인터페이스에서 정의되지만 구현 객체가 있어야함
 * 
 * 	//정적메소드
 * 	static 타입 메소드명(매개변수){}
 * 
 * }
 * 
 * 
 * [상수 필드 선언]
 * - 인터페이스는 상수필드만 선언이 가능
 * 	-> 실행중에 데이터를 저장하지 않기때문에 데이터저장할 인스턴스 또는 정적필드가 필요없다
 * - 인터페이스에 선언된 필드는 모두 public static final의 특성을 갖는다
 * 	-> 필드 선언시에 생략하더라도 자동적으로 컴파일과정에서 붙는다
 * - 상수명은 대문자로
 * - 선언과 동시에 초기값을 지정해야한다
 * 	-> static{}블록을 작성할 수 없으므로 static{}으로 초기화할수없다 -> 클래스에서는 가능했었다
 * 
 * [public static final] 타입 상수명 = 값;
 * 
 * public interface RemoteControl{
 * 	public int MAX_VOLUME = 10;
 * 	public int MIN_VOLUME = 0;
 * }
 * 	
 */
	
	
}