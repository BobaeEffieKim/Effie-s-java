package practice_0707_poly;

public class KumhoTire extends Tire{

	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
		//매개값 받아서 수퍼 안의 생성자 호출되면서 타이어 객체 생성됨
		
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		//한번 구를때마다 누적회전수 추가
	
	if(accumulatedRotation < maxRotation) {
		System.out.println(location + "HankookTire 수명 : "
				+ (maxRotation-accumulatedRotation));
		
		return true;
	} else {
		System.out.println("***"+location+"HankookTire 펑크 ***");
		return false;
	}
	}

}
