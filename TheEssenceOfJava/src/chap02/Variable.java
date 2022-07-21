package chap02;

public class Variable {

	/*
	 * 1. 변수
	 * - 하나의 값을 저장할 수 있는 메모리(ram) 공간
	 * - 메모리 주소는 숫자라서 기억하기 힘듦 -> 특정 메모리 영역에 읽고쓰는데 편리한 이름 붙인다
	 * - 변수에는 하나의 값만 저장 됨
	 * 
	 * 2. 변수 선언
	 * - 값을 저장할 공간 마련
	 * - 변수타입 변수이름;	-> int age;	=> age라는 이름의 저장공간이 생김
	 * 
	 * 3. 변수에 값 저장
	 * - int age;
	 * - age = 25;
	 * => int age = 25;
	 * - 변수의 초기화 -> 선언과 동시에 해주는 것이 좋음
	 * - 같은 타입은 여러줄 가능 -> int x=0. y=5;
	 * - 지역 변수는 읽기 전에 반드시 초기화해줘야함!
	 * 
	 * 4. 변수 값 읽어오기
	 * - 변수 값이 필요한 곳에 변수 이름 적는다
	 * - int year=0, age=14;
	 * - year = age + 2000;	=> 14+2000	=> year=2014;
	 * - age = age +1 => age=14+1;	=> age=15; 	 

	 * 
	 */
		public static void main(String[] args) {
			int x=4, y=2;
			System.out.println(x+y);
			
			
			
		}
	
}
