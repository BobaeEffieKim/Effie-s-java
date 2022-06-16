package practice06_10_static_member;

public class CalculatorEx {

	public static void main(String[] args) {
	//!!!!!!!정적멤버들은 반드시 클래스 이름으로 접근하여 사용한다!!!!!!!!	
		
		
		//반지름 10인 원의넓이(반지름*반지름*파이)를 구할때
		double result1 = 10 * 10 * Calculator.pi;
			//파이의 정확한 값을 가진 상수 쓰기
			//double result1 = 10 * 10 * Math.PI;
		
		// 메소드 호출
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		//실행
		System.out.println("result1 : "+result1);
		System.out.println("result2 : "+result2);
		System.out.println("result3 : "+result3);
	}

}
