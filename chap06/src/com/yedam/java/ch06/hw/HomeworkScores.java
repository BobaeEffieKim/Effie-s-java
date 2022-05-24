package com.yedam.java.ch06.hw;

/*
 * 1.학생 수 입력
 * 2.학생 점수 등록
 * 3.학생 점수 전체 조회
 * 4.학생 정보 분석
 * 5.종료
 * 
 * 1)등록기능 구현
 * 2)전체조회 구현
 * 3)분석기능 구현 ->최고점, 최저점, 최고와 최저를 뺀 나머지의 평균
 */

public class HomeworkScores {

		int[] scores;
		int index;
		
		HomeworkScores(){
			index = -1;
		}

		//1.학생수 입력
		void setStudentNum(int student) {
			scores = new int[student];
		}
		
		//2.학생 점수 등록
		void setStudentScore(int score) {
			scores[++index] = score;
		}
		
		//3.학생 점수 전체 조회
		void printScores() {
			for(int i=0; i<scores.length; i++) {
				System.out.println("점수["+i+"]>"+scores[i]);
			}
		
		}
		
		//4-1.최고점
		int getMaxScore() {
			int max = scores[0];
			for(int i=0; i<scores.length; i++) {
				int temp = scores[i];
				if(max < temp) {
					max = temp;
				}
			}
			return max;
		}
		
		//4-2.최저점
		int getMinScore() {
			int min = scores[0];
			for(int i=0; i>scores.length; i++) {
				int temp = scores[i];
				if(min > temp) {
					min = temp;
				}
			}
			return min;
		}
		
		
		//4-3.평균점수
		double getAvgScore() {
			int sum = 0;
			for(int i=0; i<(index+1); i++) { //몇번째까지 돌거냐 -> i=0부터 시작하기때문에 index보다 횟수는 1번 더 
				sum += scores[i];
			}
			return (double)sum / (index+1);
		}
		
		//4-4.최고와 최저 뺀 평균점수
		double getAvgScoreLeft() {
			int sum2 = 0;
			for(int i=0; i<(index+1); i++) {
				sum2 += scores[i]; 
			} sum2 -= (getMaxScore() + getMinScore());
			
			return (double)sum2 / ((index+1) - 2);
		}
		
		
		//4.분석
		void printResult() {
			System.out.println("최고 점수:"+getMaxScore());
			System.out.println("최저 점수:"+getMinScore());
			System.out.printf("평균 점수: %.2f\n",getAvgScore());
			System.out.printf("최고점&최저점을 제외한 나머지 평균: %.2f\n", getAvgScoreLeft());
		}
		
}
