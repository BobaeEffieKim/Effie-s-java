package practice_0707_poly;

public class Car {

	Tire frontLeftTire = new Tire("앞 왼쪽", 6);	//6번 회전하면 펑크나게 값지정
	Tire frontRightTire = new Tire("앞 오른쪽", 2);
	Tire backLeftTire = new Tire("뒤 왼쪽", 3);
	Tire backRightTire = new Tire("뒤 오른쪽", 4);
	
	
	int run() {
		//각 타이어의 roll 메소드 호출 -> 정상적으로 돌면 0리턴할거고, 만약 펑크나면 타이어위치순번 리턴
	
		System.out.println("자동차가 달립니다.");
	
		if(frontLeftTire.roll() == false) {
			//펑트가 날때 false 리턴하게 설정해놓음
			stop();
			return 1;	//앞왼쪽이 1번이라서
		} if(frontRightTire.roll() == false) {
			//펑트가 날때 false 리턴하게 설정해놓음
			stop();
			return 2;	//앞왼쪽이 1번이라서
		} if(backLeftTire.roll() == false) {
			//펑트가 날때 false 리턴하게 설정해놓음
			stop();
			return 3;	//앞왼쪽이 1번이라서
		} if(backRightTire.roll() == false) {
			//펑트가 날때 false 리턴하게 설정해놓음
			stop();
			return 4;	//앞왼쪽이 1번이라서
		}
	
		//모두다 true이면(모든타이어정상) 어떠한 if문도 실행하지 않으므로 0값을 리턴하도록 설정
		return 0;
	}
	
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
	
}
