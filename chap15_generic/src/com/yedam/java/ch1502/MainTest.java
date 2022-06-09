package com.yedam.java.ch1502;

public class MainTest {

	public static void main(String[] args) {

		//int result1 = Util.compare("홍", "김");	//넘버타입을 상속받는 클래스사용할때 문자타입은 담으면 오류남
		
		int result2 = Util.compare(1, 10);
		
		int result3 = Util.compare(0.5, 5.9);
		
	}

}
