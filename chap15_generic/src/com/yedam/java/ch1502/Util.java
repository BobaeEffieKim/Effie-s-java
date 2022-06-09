package com.yedam.java.ch1502;

public class Util {

	//뒤에 있는 클래스를 상속하는 클래스로 제한된다
	public static <T extends Number> int compare(T t1, T t2){//숫자클래스의 최상위클래스는 Number
	
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		return Double.compare(v1, v2);
		
	}	
}
