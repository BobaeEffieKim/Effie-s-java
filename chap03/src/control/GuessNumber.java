package control;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rand = (int)(Math.random()*6) + 1;	//1~6까지 랜덤으로 난수가 실행때마다 바뀐다
		int num;		//유저가 입력하는 값
		String result="";	//result의 초기값
		int count = 1;  //시도횟수: 입력할때마다 1증가
		//<숫자맞추기 숙제>배열은 count가 0으로 시작함으로 바꿔주기!
		do {//반복   <숫자맞추기 숙제> num을 배열로 바꾸기!
			num = Integer.parseInt(scan.nextLine());	//키보드 정수값을 읽어서 num 변수에 저장
			
			if(rand>num){ //rand>num "크다"출력
				result = "크다";
			} else if(rand<num) { //rand<num "작다"출력
				result = "작다";
			} else if(rand==num) { //rand==num ->break
				System.out.println("정답"); 
				break;
			} 
			
			if(count>=5) {//count(시도횟수)가 5회이상이면 게임 종료
				break; //조건이 여러개일때 break조건만큼 써도 됨
			} 
			System.out.println(result);
		} while(true);
		System.out.println("프로그램 종료");
	}

}
