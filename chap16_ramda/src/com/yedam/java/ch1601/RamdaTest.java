package com.yedam.java.ch1601;

public class RamdaTest {

	public static void main(String[] args) {

//매개변수도 리턴타입도 없는 람다식
		MyFunInterfaceA fa = () -> {
			String str = "method call1";
			System.out.println(str);
		};
		fa.method();
		
		//실행되는 명령어가 한줄 밖에 없는 경우에는 중괄호 생략하여 더 간단하게 표현가능한 예시 
		fa = () -> {System.out.println("method call2");};
		fa.method();
		
		fa = () -> System.out.println("method call3");
		fa.method();
		
		
		System.out.println();
//매개변수가 있고 리턴타입이 없는 람다식
			//()안에 매개변수 같게 써주고, {}안에 그 변수 이용한 연산 
		MyFunInterfaceB fb = (int x) -> {
			int result = x * 5;
			System.out.println(result);
		};
		fb.method(5);
		
		fb = (x) -> {System.out.println(x * 5);};
		fb.method(7);
			//매개변수 한개고 실행문도 하나밖에 없으면 더 간소화 시킬 수도 있음
		fb = x -> System.out.println(x * 5);
		fb.method(10);
		
		
//매개변수가 있고 리턴타입이 있는 람다식
		
		MyFunInterfaceC fc = (int x, int y) -> {
			int result = x + y;
			return result;
		};
		fc.method(1,2);
		
		fc = (x, y) -> { return x + y ;};
		System.out.println(fc.method(1, 5));
		
		fc = (x, y) -> x + y;
		System.out.println(fc.method(6, 5));
		
		fc = (x, y) -> {
			//int result = Math.max(x, y);
			//return result;
			
			return Math.max(x, y);
		};
		fc = (x, y) -> Math.max(x, y);
		System.out.println(fc.method(10, 12));
		
		int val1 = 10;
		int val2 = 20;
		
		fa = () -> {
			int result = val1 + val2;
			System.out.println(result);
		};
		//val1 = 100;
		fa.method();
		
		
		
		
		
		
	}

}
