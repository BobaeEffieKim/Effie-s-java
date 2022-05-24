package com.yedam.java.ch0605;

public class SingletonTest {

	public static void main(String[] args) {
		//singleton obj1 = new singleton();
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다."); //obj1과 obj2의 변수가 동일한 인스턴스를 가르치고있다. = 주소가 같다
		} else {
			System.out.println("다른 Singleton 객체입니다.");
		}
		
		
	}

}
