package com.yedam.java.ch0603;
//1.학생수 입력
//2.점수 입력
//3.점수리스트 출력
//4.분석 -> 최고점수, 평균점수 출력
//5.종료


public class Program {
	//필드 필요
	int[] scores;
	int index;
	
	//생성자
	Program(){
		index = -1; //index가 -1이라는건 인덱스로서의 역할을 못하고 있다는 뜻
	}
	
	//메소드
	//1.학생수 입력
	void setStudentNum(int student) {
		scores = new int[student];
	}
	
	void setStudentScore(int score) {
		scores[++index] =score;
	}
	
	//3.점수리스트 출력(값 반환 필요X)
	void printScores() {
		for(int i=0;i<scores.length;i++) {
			System.out.println("scores["+i+"]>"+scores[i]);
		}
	}
	
	//4-1. 최고점수
	int getMaxScore() {
		int max = scores[0]; //배열안에서 하나를 기준 삼아 비교하기 위해
		for(int i=0; i<scores.length; i++) {
			int temp = scores[i]; //배열이 헷갈리면 임시적인 변수 사용하여 선언하기
			if(max < temp) {
				max = temp;
			}
			
		}
		return max;
		
	}
	
	//4-2. 평균점수
	double getAvgScore() {
		int sum = 0;  //0으로 초기화
		for(int i=0; i<scores[i]; i++) {
			sum += scores[i]; //(누적)왼쪽에 있는 변수값에 오른쪽에 있는 변수값을 증감하여 결과값을 다시 왼쪽 변수에 넣는다. 
			//위의 식은 sum = sum + scores[i]; 와 같다 
			
		}
		return (double)sum / scores.length; //둘다 int여서 나머지없이 몫만 남겨지고나서 return이 실행됨, 그래서 더블로 강제변환함
		//타입변환 괄호가 연산우선순위가 더 높음 => 1.(타입변환) 2.나누기 연산 (큰쪽으로 변환되기때문에 double로 전부 강제 변환)
	}
	
	
	//4. 분석
	void printResult() {
		System.out.println("최고 점수:"+getMaxScore());
		System.out.println("평균 점수:"+getAvgScore());
		
	}
		
	
}
