package practice_0705_final_field;

public class Explanation {

/*
 *[final  필드]
 *- 파이널 필드 = 최종적인 값을 갖고 있는 필드 = 값을 변경할 수 없는 필드, 절대 수정 못함
 *- final 필드의 딱 한번의 초기값 지정 방법
 *	-> 필드 선언시
 *	-> 생성자
 *public class Person{
 *	final String nation = "Korea";
 *	final String ssn;	//=> 초기값이 없지만 한 번 값이 들어오면 절대 수정 못함, 생성자에서 값을 줄 수 있음
 *	String name;
 *
 *	public Person(String ssn, String name){
 *		this.ssn = ssn;	=> 생성자에서 외부값을 받아 줄 수 있지만 한번 주고 나면 수정 못함
 *		this.name = name;	=> 파이널 안붙어서 자유롭게 쓸 수있음
 *	}
 *}
 * -------------------------------------------------------------------
 * 
 * [상수 (static final)]
 * - 상수 = 정적 final 필드
 * 	-> final 필드 : 객체마다 가지는 불변의 인스턴스 필드
 * 	-> 상수 : 객체마다 가지고 있지않고, 메소드 영역에 클래스별로 관리되는 불변의 정적필드
 * 			->공용 데이터로서 사용됨
 * 
 * [상수 선언과 초기화]
 * 
 * - 상수이름
 * 	-> 전부 대문자로 작성하는것이 관례
 * 	-> 다른 단어가 결합되면 _로 연결
 * 
 * - 초기화 방법
 * 	static final double EARTH_RADIUS = 6400;	//double타입의 정적 파이널 상수 선언
 *  static final double EARTH_SURFACE_AREA;
 *  
 *  static {
 *  	EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
 *  }
 *  
 *  1. 선언과 동시에 초기화
 *   static final 타입 상수 [=초기값];
 *   
 *  2. 만약 계산식이나 복잡한 코드가 있다면 static{}블록에서 작성한다.
 *   	선언 때 값을 안준 상수는 static블록에서 딱 한번 줄 수 있음
 *   static final 타입 상수;
 *   static {
 *   	상수 = 초기값;
 *   }
 * 	
 * 
 * 
 * 
 * 
 */
	
	
}
