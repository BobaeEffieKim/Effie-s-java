package chap01;

import java.util.Scanner;

public class 사각형면적 {

	public static void main(String[] args) {

		int w, h, area;   //변수 선언은 코드 전에 써주는 게 좋다. 다만 중복으로 써주면 안되기때문에 아래 코드에는 'int w'대신 그냥 'w'를 써주고 값을 입력해주는게 좋다.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("가로입력:");
		w = Integer.parseInt(scan.nextLine()); //가로값을 키보드로 입력받아서 w 변수에 저장
		
		System.out.println("세로입력:");
		h = Integer.parseInt(scan.nextLine()); //세로 입력

		area = w * h; //면적 계산
		System.out.println("면적=" + area);  //면적 출력
		
		
		
	}

}
