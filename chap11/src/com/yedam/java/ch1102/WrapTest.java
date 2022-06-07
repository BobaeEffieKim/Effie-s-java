package com.yedam.java.ch1102;

public class WrapTest {

	public static void main(String[] args) {

		Integer obj1 = new Integer(100);
		Integer obj2 = Integer.valueOf("100");
		Integer obj3 = 100;
		
		int val2 = obj2.intValue();	//원래 공식적으로 언박싱하는 메소드
		int val3 = obj3;
		
		int result = obj2 + val3;
		
		Integer object1 = 300;
		Integer object2 = 300;
		
		//등호연산자 사용하면 자동언박싱이 안되고 객체끼리 비교하게 됨
		System.out.println("== 결과 :"+(object1 == object2));
		//그래서 언방식후 하거나, equals라는 메소드 사용함
		System.out.println("언박싱 후 == 결과 :"+ 
				(object1.intValue() == object2.intValue()));
		System.out.println("equals() 결과 :"+
				 object1.equals(object2));
		
		
		
	}

}
