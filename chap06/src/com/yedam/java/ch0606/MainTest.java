package com.yedam.java.ch0606;

import com.yedam.java.ch0605.Car;

public class MainTest {

	public static void main(String[] args) { //현재 패키지에 있는 않은 클래스를 쓰고자할때 import해주기 ->ctrl+shift+o =쓸수있는 다른패키지목록 보여줌
		Car myCar = new Car("포르쉐"); //처음에는 오류가 난다. 불러온 ch05의 Car는 public이 아니기때문에. 그럼 chap05 Car에 다 public 붙여주면 됨.
			
		myCar.run();
		
		
		
	}

}
