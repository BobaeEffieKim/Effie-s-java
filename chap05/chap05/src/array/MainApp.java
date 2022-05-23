package array;

import java.util.Scanner;

public class MainApp {

	//배열선언 -> {}밖에 빼면 전체에서 쓸수있음
	static int[] scores; //밖에 빼서 쓰려면 앞에 static 붙여야 함  
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		//배열생성과 초기화
		init();
		
		int menu;
		String result="";
		
		
		System.out.println("메뉴 \n 1.전체출력 2.최솟값 3.최대값 4.평균 5.종료");
		System.out.print("선택 >");
		menu = scan.nextInt();
		//반복문
		switch(menu) {
		
		case 1:
			//메뉴가 1이면
			printAll();
			break;
		case 2:
			//메뉴가 2면
			findMin();
			break;
		case 3:
			//메뉴가 3이면
			findMax();
			break;
		case 4:
			//메뉴가 4면
			findAvg();
			break;
		case 5:
			//메뉴가 5면 종료
			System.out.println("종료");
			break;
			
		default:
			System.out.print("1~5를 입력하세요.");
			
			
		} while(menu != 5);
		
		//반복문
		//메뉴출력    입력 1.전체출력 2.최솟값 3.최댓값 4.평균 5.종료
		//printAll();
		//findMin();
		//findMax();
		//findAvg();
			
		}

	public static void init() {
		System.out.println("값입력");
		//배열생성 -> 배열 몇개 담을건지 실제방 생성하여 할당 / 힙을 생성
		scores = new int[10]; //모든 요소가 0으로 초기화되어있음 -> 값을 안넣거나 없는 수 넣어도 0으로 값이 출력됨
		
		//배열초기화 -> 배열값 입력 
		//ex. scores[i] =0;
		//for문 -> 일일히 다 써주기 힘드니 for문을 같이 자주 씀
		for(int i=0; i<10 ; i++) {			
			scores[i] = scan.nextInt(); //(숫자맞추기게임)배열에 값을 넣는 것, [i]에 count값넣기
		}
		
		
	}
	
	public static void printAll() {
		
		//배열값전체조회 -> 배열값 보고싶을때
		
		for(int i=0; i<10 ; i++) {
			System.out.println(scores[i]); //없는 값을 입력하면 0으로 초기화되어 나타남
		}
		//두번째 학생의 성정조회
		System.out.printf("두번째 학생은 %d 점입니다.\n",scores[1]);
		
		
	}
	
	public static void findMin() {
		
		//최솟값
		int min = scores[0];
		for(int i=1; i<10 ; i++) {
			if(min>scores[i]) {
				min=scores[i];
			}
		}
		System.out.printf("최솟값은 %d 점입니다.\n", min);
		
		
	}
	
	public static void findMax() {
		
		//최댓값
		int max = scores[0];
		for(int i=1; i<10 ; i++) {
			if(max<scores[i]) {
				max=scores[i];
			}
		}		
		System.out.printf("최댓값은 %d 점입니다.\n", max);
		
	}
	
	public static void findAvg() {
		
		//합계
		int sum = 0;
		for(int i=1; i<10 ; i++) {
			sum +=scores[i];
			
		}
		System.out.printf("합계는 %d 점입니다.\n", sum);
		
		//평균
		int avg =0;
		for(int i=1; i<10 ; i++) {
			avg = sum/10; //개수모르면 배열길이 알아보는 코드 넣어주기 
		}
		System.out.printf("평균은 %d 점입니다.\n",avg);
		
		
	}	
	
	
	
}
