package practice_0704_overriding;

public class Computer extends Calculator{

	
	//메소드 재정의 => 부모클래스한테 물려받는 areaCircle메소드를 정확한 파이값을 주는 내용으로 바꾸기 
	
	@Override	//=> 검증차원에서 꼭 붙여주는게 좋음
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
	
		//메소드 재정의 또다른 방법 
	//ctrl + space -> 현재 클래스가 상속받는 메소드가 자동으로 뜬다.
	
}
