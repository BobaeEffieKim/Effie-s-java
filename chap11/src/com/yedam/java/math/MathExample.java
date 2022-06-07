package com.yedam.java.math;

public class MathExample {

	public static void main(String[] args) {

		//절대값
		int v1 = Math.abs(-5);
		double v2 = Math.abs(-3.14);
		System.out.println("v1 = "+v1);
		System.out.println("v2 = "+v2);
	
		//올림값
		double v3 = Math.ceil(5.3);
		double v4 = Math.ceil(-5.3);
		System.out.println("v3 = "+v3);
		System.out.println("v4 = "+v4);
	
		//버림값
		double v5 = Math.floor(5.3);
		double v6 = Math.floor(-5.3);
		System.out.println("v5 = "+v5);
		System.out.println("v6 = "+v6);
	
		//최대값
		int v7 = Math.max(5, 9);
		double v8 = Math.max(5.3, 2.5);
		System.out.println("v7 = "+v7);
		System.out.println("v8 = "+v8);
		
	
		//최소값
		int v9 = Math.min(5,9);
		double v10 = Math.min(5.3, 2.5);
		System.out.println("v9 = "+v9);
		System.out.println("v10 = "+v10);
	
		//랜덤값
		double v11 = Math.random();
		System.out.println("v11 = "+v11);
	
		//가까운 정수의 실수값 =>round와 거의 비슷하지만 중간값의 기준이 애매해서 반올림값 구할때는 round를 사용하는게 나음.
		double v12 = Math.rint(5.3);
		double v13 = Math.rint(5.7);
		System.out.println("v12 = "+v12);
		System.out.println("v13 = "+v13);
		
		//반올림값
		long v14 = Math.round(5.3);
		long v15 = Math.round(5.7);
		System.out.println("v14 = "+v14);
		System.out.println("v15 = "+v15);
		
			//round는 소수점 첫번째자리에서 반올림 시킴-> 때문에 원하는 자리에서 반올림하고 싶으면 10배수곱하기로 조정한다음 반올림하고나서 다시 나눠줘야함.
		double value = 12.3456;
		double temp1 = value * 100;
		long temp2 = Math.round(temp1);
		double v16 = temp2 / 100.0;
		System.out.println("v16 = "+v16);
	}



}
