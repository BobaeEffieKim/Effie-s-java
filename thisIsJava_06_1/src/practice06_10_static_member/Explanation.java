package practice06_10_static_member;

public class Explanation {
/*
 * 	[정적멤버]
 * - 클래스에 고정된 필드와 메소드
 * 		-> 클래스바이트코드에 위치한 필드와 메소드를 뜻함 /'고정된'=>객체마다 생성되는것이 아니라 클래스바이트코드에 고정됐다는 의미
 * - 정적멤버는 클래스에 소속된 멤버로 객체 내부에 존재하지않고, 메소드 영역에 존재함
 * 		-> 메소드영역에는 클래스의 바이트코드들이 있음 
 * 		-> 정적멤버는 객체를 생성하지않고 클래스로 바로 접근해서 사용함 ->메소드에 로딩되어있는 것만으로 사용가능
 * 
 * 	[정적멤버 선언]
 * -필드와 메소드를 선언할때 static을 붙여준다
 * 
 * -정적 필드
 * static 타입 필드 [= 초기값];
 * 
 * -정적 메소드
 * static 리턴타입 메소드(매개변수){}
 * 
 * 	[정적멤버 사용]
 * - 클래스이름과 함께 .연산자로 접근
 * 클래스.필드;
 * 클래스.메소드(매개값);
 * 
 * - 클래스 선언
 * 	필드와 메소드는 객체안에 저장되는게 아니라 메소드영역에 고정된위치에 저장됨
 * public class CalCulator{
 * 	static double pi = 3.14159;
 * 	static int plus(int x, int y){}
 * 	static int minus(int x, int y){}
 * }
 * 
 * - 바람직한 사용 => 클래스 이름으로 접근
 * double result1 = 10 * 10 * Calculator.pi;
 * 	=> 클래스이름.필드명 -> 위의 파이에 저장되어있는 값을 읽고 연산
 * int result2 = Calculator.plus(10,5);
 * 	=> 메소드 호출=> 클래스이름.메소드명(매개값)
 * int reault3 = Calculator.minus(10,5);
 */
/////////////////////////////////////////////////////////////////////////////////////////
/*
 * [인스턴스 멤버 선언 vs 정적 멤버 선언의 기준]
 *	<필드>
 *-객체마다 가지고있어야할 데이터라면 -> 인스턴스 필드
 *	ex.계산기마다 색이 달라야한다면 색을 인스턴스필드로 선언해야함
 *-공유하거나 공용적인 데이터라면 -> 정적필드(메모리 낭비 방지)
 *
 * public class Calculator{
 * 	String color; 				->계산기별로 색이 다르게 하려면
 * 	static double pi=3.14159;	->계산기에서 사용하는 파이값은 동일하기때문에 메소드영역에 위치해두고 객체들이 공유해서 사용하게 한다
 * }
 * 
 * 	<메소드> -> 필드로  작업을 많이 하기 때문에 필드에 따라
 * -객체마다 가져야할 인스턴스 필드로 작업해야할 메소드라면 -> 인스턴스 메소드
 * -인스턴스 필드로 작업하지 않는 메소드라면 -> 정적 메소드
 * public Calculator{
 * 
 * 	String color;									 ->인스턴스필드
 * 	void setColor(String color){this.color = color;} ->인스턴스필드 사용한 메소드이기때문에 메소드내에 this가 있음 이때 절대 static쓰면 안됨
 * 	static int plus(int x, int y){return x + y;}	 -> 실행내용에 인스턴스필드를 사용하지않기때문에 정적메소드로 사용
 * 	static int minus(int x, int y){return x - y;}
 * 
 * }
 * 	
 */
///////////////////////////////////////////////////////////////////////////////////	
/*
 * [정적 초기화 블록]
 * 
 * -클래스가 메소드 영역으로 로딩될때 자동으로 실행하는 블록
 * 		=> 단순한 정수값,실수값,문자열을 정적필드로 저장할때는 선언과 동시에 초기화하는 것이 보통임
 * 		=> 위의경우에 해당되지않는 복잡한 초기화식을 필요로하는 정적필드는 초기화식을 정적초기화블록에서 해줌
 * 		=> 인스턴스멤버에서는 저런 경우에 '생성자'에서 복잡한 식을 작성해서 넣어줌. 하지만 정적멤버는 그렇게 못함
 * 		=> 그래서 이경우 '생성자'역할을 하는 것이 '정적초기화블록'!!
 * 		=> static{....} 형태 
 * class xxx{
 * 	static int x;
 * 	static{
 * 	x = 10;
 * 	}
 * }
 * 
 * -{} 안에 초기화식을 넣어줌 -> 간단한 식이든 for문이든 복잡한 식이든 {}내부에서 작성해서 위의 필드값에 초기화해주는 개념
 * -정적 필드의 복잡한 초기화 작업과 정적 메소드를 호출할 수 있다.
 * 	=> static{}내부에 메소드도 호출가능. 하지만 '인스턴스필드, 인스턴스메소드'는 불가!! 
 * 	=> static{}내부 -> 정적 필드 초기화, 정적메소드 호출은 가능
 * -클래스 내부에 static{}이 여러개가 선언되어도 상관없다. 선언된 순서대로 실행된다.
 * public class Television{
 * 	static String company = "Samsung";
 * 	static String model = "LCD";
 * 	static String info;
 * 
 * 	static{
 * 		info = company + "-" + model;
 * 	}
 * }
 * 	
 */
	
	
	
	
	
	
	
	
	
	
	
}
