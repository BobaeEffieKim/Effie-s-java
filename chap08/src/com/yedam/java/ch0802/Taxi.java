package com.yedam.java.ch0802;

public class Taxi implements Vehicle { //자동차 중의 하나기때문에 Vehicle의 사용방법을 따른다는 뜻

	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	} 

}
