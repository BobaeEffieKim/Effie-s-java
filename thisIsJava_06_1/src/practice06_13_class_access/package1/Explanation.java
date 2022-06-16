package practice06_13_class_access.package1;

public class Explanation {

/*
 * [접근제한자]  Access Modifier
 * - 클래스 및 클래스의 구성 멤버에 대한 접근을 제한하는 역할을 한다
 * 	-> 다른 패키지에서 클래스를 사용하지 못하도록 막는다 -> (클래스제한)
 * 	-> 클래스로부터 객체를 생성하지 못하도록 막는다 -> (생성자 제한)
 * 	-> 특정 필드와 메소드를 숨김 처리(사용하지못하도록 막음)한다 -> (필드와 메소드 제한)
 * 
 * - 접근제한자의 종류 (적용대상 : 접근제한자 붙을 수 있는 곳)
 * 	public -> (적용대상) 클래스, 필드, 생성자, 메소드 -> (접근불가한 클래스) 없음	
 *  protected -> (적용대상) 필드, 생성자, 메소드 -> (접근불가한 클래스) 자식클래스가 아닌 다른 패키지에 소속된 클래스
 *  default -> (적용대상) 클래스, 필드, 생성자, 메소드 -> (접근불가한 클래스) 다른 패키지에 소속된 클래스
 *  private -> (적용대상) 필드, 생성자, 메소드 -> (접근불가한 클래스) 모든 외부 클래스
 * 		ex.
 * 		class A {
 * 		 	private int x;	/외부에서 절대로 x라는 필드에 접근할 수 없고 A클래스 내부에서만 사용할 수 있음
 * 		}	
 * 
 * 
 * [클래스의 접근 제한]
 * 
 * 	//default 접근제한
 * class 클래스{...}
 * 		-> 같은 패키지 내부의 것만 사용가능 , 만약 package1에 있는 classA[default임]를 package2에서 사용불가
 * 		-> classA를 다른 패키지에서 사용하고 싶다면 아래와 같이 앞에 public 붙여주면 됨. 
 * 
 * 	//public 접근제한
 * public class 클래스{...}
 * 
 * 
 * [생성자 접근 제한]
 * - 생성자 역할: new연산자를 이용해서 호출하면 객체를 생성
 * - 모든 생성자를 호출할 수 있는건 아님 
 * 
 * public class ClassName{
 * 	//public 접근 제한
 * public ClassName(){}
 * 
 * 	//protected 접근 제한	-> 같은 패키지내에서만 new로 호출가능
 * protected ClassName(){}
 * 
 * 	//default 접근 제한	-> 같은 패키지내에서만 new로 호출가능
 * ClassName(){}
 * 
 * 	//private 접근 제한	-> 현재 자기 클래스 내부가 아닌 외부에서는 new로 호출 절대 불가
 * private ClassName(){}
 * }
 * 
 * 
 * [필드와 메소드의 접근 제한]
 * 	//필드 선언
 * [public | protected | private ] [static] 타입 필드;
 * 
 * 		//필드
 * 		public int field1;		-> public
 * 		int filed2;				-> default
 * 		private int field3;		-> private
 * 
 * 	//메소드 선언
 * [public | protected | private] [static] 리턴타입 메소드(){}
 * 
 * 		//메소드
 * 		public void method1(){}		-> public
 * 		void method2(){}			-> default
 * 		private void method3(){}	-> private
 * 
 * 
 * 
 * 
 */
	
	
	
	
	
	
}
