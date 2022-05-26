package com.yedam.java.ch0702;

public class Car {
	//필드
	 Tire frontLeftTire = new Tire("앞왼쪽", 6);
	 Tire frontRightTire = new Tire("앞오른쪽", 2);
	 Tire backLeftTire = new Tire("뒤왼쪽", 3);
	 Tire backRightTire = new Tire("뒤오른쪽", 4);
	 
	//생성자
	
	 
	 
	//메소드 -> 자동차가 작동한다는 것은 결국 모든 타이어가 한바퀴씩 돈다는것
	 int run() { //else if쓰지 않고 다 if로 한 이유는 타이어는 동시에 작동되어야하기때문
		 System.out.println("[자동차가 달립니다.]");
		 if(frontLeftTire.roll() == false) {
			 stop();
			 return 1; //1은 앞왼쪽을 의미하는 임의의 숫자 
		 }
		 if(frontRightTire.roll() == false) {
			 stop();
			 return 2;
		 }
		 if(backLeftTire.roll() == false) {
			 stop();
			 return 3;
		 }
		 if(backRightTire.roll() == false) {
			 stop();
			 return 4;
		 }
		 
		 return 0; //어느 if문에도 해당이 안되면 지나가기 -> 어디에서도 펑크가 나지않았다
		 
	 }
	
	 void stop() {
		 System.out.println("[자동차가 멈춥니다]");
	 }
	 
	 
}
