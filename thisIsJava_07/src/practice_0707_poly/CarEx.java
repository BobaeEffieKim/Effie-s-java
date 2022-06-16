package practice_0707_poly;

public class CarEx {

	public static void main(String[] args) {

		Car car = new Car();
		
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();
			//런이 리턴하는 타입이 0,1,2,3,4 중 하나인 메소드
			
			switch(problemLocation) {
			//0은 문제없는 상황이므로 제외
				case 1:
					System.out.println("앞 왼쪽을 HankookTire로 교체");
					car.frontLeftTire = new HankookTire("앞 왼쪽", 15);
						//-> 카의 앞왼쪽 타이어에 새로운 한국타이어객체를 만들어 대입하겠다
						//자동 타입변환
					break;
					
				case 2:
					System.out.println("앞 오른쪽을 KumhoTire로 교체");
					car.frontRightTire = new KumhoTire("앞 오른쪽", 13);
						
					break;
					
				case 3:
					System.out.println("뒤 왼쪽을 HankookTire로 교체");
					car.backLeftTire = new HankookTire("뒤 왼쪽", 14);
						
					break;
					
				case 4:
					System.out.println("뒤 오른쪽을 KumhoTire로 교체");
					car.backRightTire = new KumhoTire("뒤 오른쪽", 17);
						
					break;
			}
			System.out.println("----------------------------------");
			//한번 구를때마다 구분선
		}
		
	}

}
