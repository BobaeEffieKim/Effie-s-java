package practice_0707_poly;
//부품클래스
public class Tire {

	public int maxRotation; //타이어의 최대 회전수 -> 최대에 도달할 시 교체
	public int accumulatedRotation; //누적 회전수
	public String location; //어느 타이어인지의 위치
	
	//생성자-> 외부에서 값받아 초기값으로 제공하도록 매개변수 설정
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//메소드
	public boolean roll() {
		//이 타이어의 누적회전수가 최대회전수가 아직 안되었다면 더 구를 수 있다-> 트루
		++accumulatedRotation;
			//한번 구를때마다 누적회전수 추가
		
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "Tire 수명 : "
					+ (maxRotation-accumulatedRotation));
			
			return true;
		} else {
			System.out.println("***"+location+"Tire 펑크 ***");
			return false;
		}
	
	}
	
}
