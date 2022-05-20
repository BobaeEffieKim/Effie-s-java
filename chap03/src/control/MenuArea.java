package control;
/*
 * 1.사각형 2.삼각형 0.종료
 * 
 * 
 * 
 */

import java.util.Scanner;

public class MenuArea {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); //스캐너 사용하겠다
		int menu;			//입력값 선언
		String result ="";	//결과값 선언

		// 반복
		do {
			menu = Integer.parseInt(scan.nextLine());
			
			if (menu == 0) {		 // 0이면 break
				break;
			} else	if (menu == 1) { // 1이면 "사각형"출력
				result = "사각형";
			} else if (menu == 2) {	 // 2이면 "삼격형"출력
				result = "삼각형";
			} else {				 // 다 아니면 "다시입력" 출력
				result= "다시입력";
			}
			System.out.println(result); //결과값 출력

		} while (true);
		System.out.println("프로그램 종료");//마지막에 "프로그램 종료"출력
	}
}
