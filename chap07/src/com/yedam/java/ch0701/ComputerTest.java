package com.yedam.java.ch0701;

public class ComputerTest {

	public static void main(String[] args) {

		Calculator cal = new Calculator(); //일반계산기를 인스턴스로 만들고, 
		System.out.println("원 면적 : "+cal.areaCircle(10));//반지름10일때 원의면적
		
		Computer com = new Computer();
		System.out.println("원 면적 : "+cal.areaCircle(10));
		
		
		System.out.println();
		
		com.print();
		
	}

	
}
