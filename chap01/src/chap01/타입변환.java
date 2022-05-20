package chap01;
/*
 * 데이터타입을 다른 타입으로 변환
 * 강제형 변환
 * 자동형 변환
 * 
 * String <--> 기본데이터형(int, double,,)
 * 
 */
public class 타입변환 {

	public static void main(String[] args) {
		//자동
		int a = 100;
		long b = a;
		
		//강제
		long c = 100;
		int d = (int)c;
		
		//자동
		double e = c;
		
		//강제
		double f = 5.2;
		long g = (long)f; 
		System.out.println("g = " + g);
		//원래 '정수/정수'의 값이 정수로 나와야해서 'double h = 10/3'이 '3.333'이 아닌 '3.0'으로 나옴. 하지만 'double h =(double)10/3로 강제 변환해주면 정상적인 값이 나옴. 
		double h = (double)10 / 3;
		System.out.println("h = " + h);
		
		System.out.println("결과는 = " + 10 + 20); //String = int 이기때문에 String에 담기면서 문자열처럼 붙어서 1020으로 나옴
		System.out.println( 10 + 20 + " = 결과"); //int + int 가 앞에 있으므로 뒤의 String에 영향 받지 않음

	
		//int(기본타입) -> String
		int i = 100;
		String j = String.valueOf(i);
		
		//String -> int
		String k = "100";
		int l = Integer.parseInt(k);
	
	}

}
