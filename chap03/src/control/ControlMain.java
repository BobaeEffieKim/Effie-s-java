package control;

import java.util.Scanner;

public class ControlMain {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		int score;	 //점수 입력받아 저장할 변수//자바에서는 같은블럭 내에서만 변수가 적용되기때문에 초반에 하는게 낫다.
		String grade;//등급
		
		do {  //조건이 맞을 동안은 계속 실행하라 명령문 (do와 while)
			
			//점수를 키보드로부터 입력받아 score변수에 저장하라
			score = Integer.parseInt(scan.nextLine());
			if(score==0) {
				break; //조건이 맞으면 반복문을 빠져나간다는 뜻
			}
			//등급계산 조건문
			
			if( score>= 90 ) {
				grade = "A등급";
			} else if( score>=80) {
				grade = "B등급";
			} else if( score>=70) {
				grade = "C등급";
			} else  {	//마지막은 else로 마무리
				grade = "D등급";
			}
			//등급 결과 출력
			System.out.printf("%d점은 %s입니다.", score, grade);
		} while(true); //결과는 score가 0이 되면 끝난다는 의미
		System.out.println("프로그램 종료");
		
	}	

}
