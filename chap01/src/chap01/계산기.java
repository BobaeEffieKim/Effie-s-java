package chap01;
/*
 * 작성자 : 김보배
 * 작성일자 : 2022-05-18
 * 기능 : 숫자 계산기
 * 
 */
public class 계산기 {

	public static void main(String[] args) {
		//두 수의 합을 출력
		//add();  						//메소드 실행(호출)
		//두 수의 뺄셈
		//sub();
		//국어, 영어, 수학의 합계와 평균 출력
		totalAvg();
	}
	
	public static void totalAvg() {
		//국어 변수 선언
		int kor;
		//국어 변수 초기화
		kor = 60;
		//수학 변수 선언 + 초기화
		int math = 60;
		//영어 변수 선언 + 초기화
		int eng = 50;
		//세과목의 합 계산하여 변수에 담고
		int Sum = kor + math + eng;
		//합을 3으로 나누어 평균 계산하여 변수에 담고
		double Avg = (double)Sum/3;  //강제형 변환 (double이 껴있어도 int끼리 연산하면 int가 나오므로 double값으로 출력되어야하는 값은 강제 변환)
		//합계 출력
		System.out.println("합계=" + Sum);
		//평균 출력
		System.out.println("평균=" + Avg);
	}
	
	public static void add() {  		//메소드 선언
		
	
	int num1 = 1;               //변수 NUM1을 선언하고 1을 저장
	int num2 = 2;				//변수 NUM2를 선언하고 2를 저장
	num1 = 10;	    			//변수에는 값을 바꿔서 저장할 수 있다.
	int result = num1 + num2;  	//변수 RESULT를 선언하고 x와 y를 더한 값을 저장
	System.out.println(result); //모니터에 결과를 출력
	}
	
	public static void sub() {
	int x = 1;					//실행문 (회색은 주석)
	int y = 2;
	int result = x - y;
	System.out.println(result);
	}	
	
}
