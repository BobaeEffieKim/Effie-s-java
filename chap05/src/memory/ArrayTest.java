package memory;

public class ArrayTest {

	public static void main(String[] args) {

		int[] month = new int[] {31,28,31,30,31,31};  //이경우엔 []안에 값넣으면 에러남
		//2월의 마지막날은?
		System.out.println(month[1]);
		
		int[] week = {'월','화', '수'}; //객체배열 생성할때만 {}사용
		
		int[] score = new int[10]; //->변수 선언할 때 초기값도 동시에 줌
		//score = {4,5,6,7,4} -> 오류남. 배열에 값을 하나씩 넣어야함.
		score[0] = 100;
		//score = {4,6,10,3,5}; -> error / 에러 없으려면 아래처럼 new로 바꿔줘야함.
		score = new int[] {4,6,10,3,5};
		
		
	}

}
