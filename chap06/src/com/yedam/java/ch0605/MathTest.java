package com.yedam.java.ch0605;

public class MathTest {

	public static void main(String[] args) {
		double result1 = 10* 10* Math.pi; //math라는 메소드는 정적영역에서의 메소드와 필드 사용 
		int result2 = Math.plus(10, 5);	  //인스턴스 만들지 않고 바로 사용
		int result3 = Math.minus(10, 5);
		
		System.out.println("result1 : "+result1);
		System.out.println("result2 : "+result2);
		System.out.println("result3 : "+result3);
	}

}
