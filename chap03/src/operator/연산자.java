package operator;

import java.io.IOException;
import java.util.Scanner;

public class 연산자 {

	public static void main(String[] args) {

		//산술연산();
		//짝수검사();
		//부호연산();
		//incDesOp();     //증감연산
		//denyLogicOp();  //논리부정
		//toLower();	  //문자연산
		//compareOp();      //비교연산
		//isDigit();        //입력값이 숫자인지 판단
		//isChar();		    //대소문자 구분
			//new Character.is -> is 뒤에 나오는것인지 검사
			//new Chatacter.to -> to뒤에 나오는 것으로 변환
		//conditionOp();	//삼항연산자(조건연산자)
	
	}
	
		//삼항연산자
		public static void conditionOp() {
			int score = 79;
			String grade = ((score >= 90) ? "A등급" : (score >= 80 ? "B등급" : "C등급")); //90이상이면 'A' 아니면 'B'가 나오게 , 80이하면 C
			System.out.println(grade);
			
			
		}
	
	
		//대소문자 구분
		public static void isChar() {
			try {
				int key = System.in.read();
				boolean result = ((key >= 65) && (key <=90)) || ((key >= 97) && (key <= 122)); //65~90대문자 or 97~122소문자  
				String str = result ? "문자" : "문자아님";	//result가 참이면 두번째항, 거짓이면 세번째항	
				System.out.println(str);		
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	
	
		//숫자인지 판단
		public static void isDigit() { //try하다가 에러나면 catch로 조치하세요
			try {
				int key = System.in.read();
				boolean result = (key >= 48) && (key <=57); //48에서 57사이면 숫자 
				System.out.println(result);		
						
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
			
		}
	
		//비교연산
		public static void compareOp() {
			int year = 2022;
			boolean result = (year % 4 ==0 && year % 100 != 0) || year %400 == 0; //4로 나눈 나머지가 0이어야하고(&&) 100으로 나눈 나머지가 0이 아니어야한다. 혹은(||) 400으로 나눈 나머지가 0이어야한다.
			System.out.println(result);
			
			
		}
	
		//문자연산
		public static void toLower() {
			char c = 'A';
			char p =  (char)(c + 32); //덧셈의 결과는 int지만 char로 만들고 싶으면 강제변환
			System.out.println(c + ":" + p);
			
		}
	
		//논리부정
		public static void denyLogicOp() {
			boolean play = true;
			play = !play;
			System.out.println(play);
			
		}
	
		//증감연산자
		public static void incDesOp() {
			int x = 10;
			int y = 10;
			--x;
			x = x - 1;
			++y;
			
			System.out.println(x);
			System.out.println(y);
			
			int a = 10;
			int b = 10;
			//a = a + 1;
			//b = b + 1;		
			int c = a++ + b++;
			System.out.println(c);
			
		}
	
		//부호연산
		public static void 부호연산() {
			int i1 = +100;
			int i2 = -100;
			
			byte x = 100;
			int result = -x; //부호연산의 결과는 int
			
			
		}
	
		//짝수인지 검사
		
	public static void 짝수검사() {
		int n1 = 6;
		boolean result = n1 % 2 ==0;
		System.out.println(result);
			
		}
	
	//산술연산자
	public static void 산술연산() {
		int n1 = 10;
		int n2 = 3;
		
		int n3 = n1 / n2;  //몫
		int n4 = n1 % n2; //나머지
		
		System.out.println(n3 + ":" +n4);
		
		
		
		
	}
	

}
