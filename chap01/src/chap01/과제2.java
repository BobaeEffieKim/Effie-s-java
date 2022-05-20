package chap01;

import java.util.Scanner;

public class 과제2 {

	public static void main(String[] args) {

		double w, h, area;   //변수 선언은 코드 전에 써주는 게 좋다. 다만 중복으로 써주면 안되기때문에 아래 코드에는 'int w'대신 그냥 'w'를 써주고 값을 입력해주는게 좋다.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("가로입력:");
		w = Double.parseDouble(scan.nextLine()); //가로값을 키보드로 입력받아서 w 변수에 저장
		
		System.out.println("세로입력:");
		h = Double.parseDouble(scan.nextLine()); //세로 입력

		area = (w * h)/2; //면적 계산
		System.out.printf("면적=%.2f" , area);  // 실수 표현은 %f ,  소수점자리지정은 %.Nf으로 소수점아래N자리 지정
		
	}

}
