package com.yedam.java.ch1101;

import java.util.Date;	//(*중요*)import할때 sql데이터가인지 util데이터인지 확인해야함.

public class ToStringTest {

	public static void main(String[] args) {

		Object obj1 = new Object();
		System.out.println(obj1.toString());
		//java.lang.Object@3d012ddd -> @뒷자리가 메모리 주소지만 딱히 필요없음
		
		Date date = new Date();
		System.out.println(date.toString());

		Member member = new Member("홍길동");
		System.out.println(member);
		
		
	}

	
}
