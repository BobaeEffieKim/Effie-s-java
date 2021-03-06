package chap01;

/*
 * 
 * 변수 -> 메모리의 저장위치. 값을 저장하는 공간
 * 유형 -> 메모리에 값을 저장하는 형식 (구조와 크기가 다름)
 * 변수이름 -> 본인이 기억할 만한 규칙과 의미를 생각해서 지어야 나중에 떠올릴 수 있음
 * 
 * 변수의 유형 
 *             1bite    2     4     8
 * 숫자   정수   byte < short < int < long < BigDecimal
 * 				127	  3만2천  21억  10^18
 * 
 *			   7자리     15
 *       실수  float < double  유효자릿수 정밀도에 차이가 있음
 *       					ex) 0.000012 -> 0.12*10^-5
 *       
 * 문자	한글자 char		<= 'a' '가'   / char는 short < char < int
 * 		단어  String     <= "홍길동"
 * 
 * 논리	boolean <- true, false만 가능
 * 
 * 
 * 날짜
 * 
 */
public class 변수 {

	public static void main(String[] args) {
		int korScore = 128;		   //상수값의 기본형은 int
		long rich = 22000000000l;  //상수값 long 사용하려면 접미어 L or l 사용
		float avg = 0.123456789F;  //float형 변수 avg를 선언하고 상수값 84.7를 변수에 저장
		double totalAvg = 0.1234567890123456789; //상수값 실수의 기본형
		int int2 = 0b1111111;
		int int8 = 017;
		int int16 = 0x7F;
		
		System.out.println("int2= \n\t\t \\" + int2 + "\\");
		System.out.println("int8= \"" + int8 + "\"");
		System.out.println("int16=" + int16);
		
		int k = 60, e = 60, m = 60;
		boolean passYn = true;
		boolean fail = k>50 && e>50 && m>50;
		
		System.out.println("fail = " + fail);
		
		int engScore = 10;		   //변수선언 = 초기화
		int mathScore;			   //변수선언
		mathScore = 100;		   //초기화
		
		System.out.println(avg);
		System.out.println(totalAvg);
		System.out.println(engScore);
		
		char grade = '가'; //67; //'A';		//문자(한글자)는 작은 따옴표
		String grade2 = "A+";			    //문자열은 큰따옴표로 표현
		
		System.out.println("grade = " + (int)grade);
		
		char code = 44033;
		System.out.println("44033 문자 = " + code);
		
	}

}
