package practice1112_wrapper;

public class Explanation {
/*
 * 
 * <<포장 클래스->Wrapper>>
 * 
 * [포장 객체]
 * - 기본타입(byte,char,short,int,long,float,double,boolean)값을 포장하는 객체
 * - 기본 타입의 값은 외부에서 변경할 수 없다
 * 
 * 		 [포장클래스]
 * byte -> Byte
 * char -> Character
 * short -> Short
 * int -> Integer
 * long -> Long
 * float -> Float
 * double -> Double
 * boolean -> Boolean
 * 
 * 
 * [박싱, 언박싱]
 * - 박싱 : 기본 타입의 값을 포장 객체로 만드는 과정
 * - 언박싱 : 포장 객체에서 기본 타입의 값을 얻어내는 과정
 * 
 * 	//박싱 코드 
 * 1)생성자를 이용	-> 매개값으로 포장할 값을 줌
 * 
 * [기본타입의 값을 줄 경우]					[문자열을 줄 경우]
 * Byte obj= new Byte(10);				Byte obj = new Byte("10");
 * Character obj=new Character('가');
 * Short obj = new Short(100);			Short obj = new Short("100");
 * Integer obj = new Integer(1000);		Integer obj = new Integer("1000");
 * Long obj = new Long(10000);		Long obj = new Long("10000");
 * Float obj = new Float(2.5F);			Float obj = new Float("2.5F");
 * Double obj = new Double(3.5);		Double obj = new Double("3.5");
 * Boolean obj = new Boolean(true);		Boolean obj = new Boolean("true");
 * 
 * 2)valueOf() 메소드 이용
 * 
 * Integer obj = Integer.valueOf(1000);
 * Integer obj = Integer.valueOf("1000");	->문자열로 제공된 값을 정수화하여 포장
 * 
 * 
 *	//언박싱 코드	-> 기본 타입 값을 이용(obj = > 랩퍼 객체)
 *
 *	byte		num 	=	obj.byteValue(); ->바이트랩퍼 객체 내에 있는 바이트값이 리턴되어나옴
 *	char		ch	 	=	obj.charValue();
 *	short		num 	=	obj.shortValue();
 *	int			num 	=	obj.intValue();
 *	long		num 	=	obj.longValue();
 *	float		num 	=	obj.floatValue();
 *	double		num 	=	obj.doubleValue();
 *	boolean		bool 	=	obj.booleanValue();
 * 
 * 
 * [자동 박싱과 자동 언박싱]
 * - 자동 박싱은 포장 클래스 타입에 기본값이 대입될 경우에 발생
 * Integer obj = 100; 	// 자동 박싱
 * 	->정수값을 포장클래스 타입에 대입하면 자동으로 박싱됨  
 * 		-> 정수값을 인티저라는 클래스타입 변수에 대입 
 * 			->100이라는 값을 포장하는 인티저 객체 만들어짐
 * 				-> 그 객체의 번지를 obj가 참조함
 * 
 * 
 * List<Integer> list = new ArrayList<Integer>;
 * list.add(200);		//자동 박싱
 * 
 * - 자동 언박싱은 기본 타입에 포장 객체가 대입될 경우에 발생
 * Integer obj = new Integer(200);
 * int value1 = obj;		//자동 언박싱
 * 	-> 인티저객체 안에 있는 값200(obj)가 자동으로 언박싱되어서 변수 밸류1에 저장된다
 * int value2 = obj + 100;	//자동 언박싱
 * 
 * ---------------------------------------------------------------------
 * [문자열을 기본 타입 값으로 변환]
 * -기본 타입으 값을 이용 (다른 기본타입도 똑같음 . 몇개만 예시로 쓴다)
 * 
 * int		num		= 	Integer.parseInt("1000");
 * double 	num 	=	Double.parseDouble("3.5");
 * boolean 	bool	=	Boolean.praseBoolean("true");
 * 
 * 
 * [포장값 비교]
 * - 포장 객체는 내부의 값을 비교하기 위한 포장 객체로 ==와 != 연산자를 사용할 수 없다
 * 	-> 예외 : 다음값이라면 포장 객체로 ==과 != 연산자로 내부값 비교할 수 있따
 * 
 * (타입)					(값의 범위)
 * boolean					true, false
 * char						\u0000 ~ \u007f
 * byte, short, int			-128 ~ 127
 * 
 * - 헷갈림 방지위해서 값을 언박싱해서 비교하거나 equals()메소드로 내부 값을 비교하는 것이 좋다
 * 
 * 
 * 
 * 
 */
}
