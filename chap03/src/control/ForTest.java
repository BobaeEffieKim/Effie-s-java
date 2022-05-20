package control;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ForTest {

	public static void main(String[] args) throws FileNotFoundException {

		
		//while1();
		//for1();
		//for2();
		//gugudan1();
		//findMax();	//최댓값
		//findMin(); //최솟값
		findMinMax();
		
	}	
		
		//최대,최소값
	public static void findMinMax() throws FileNotFoundException {
		Scanner scan = new Scanner(new File("score.txt"));
		
		int min = scan.nextInt();
		int max = min;
		for(int i = 0 ; i < 9 ; i++);
			int num = scan.nextInt();
			if(num > max) {
				max = num;
			} if(num < min) {
				min = num;
			}
			System.out.println("최솟값=" + min);
			System.out.println("최댓값" + max);
	}
	
	
		//최솟값
	public static void findMin() throws FileNotFoundException { //File 밑줄뜨면 import 후 throw해준다. 위의출력 이름에도 같게해준다.
		Scanner scan = new Scanner(new File("score.txt"));
		
		int min = scan.nextInt(); //'=100'일때 최솟값일때는 큰수를 넣어야 충분히 비교가능, 'scan.~'일때는 첫번째 값만 받아서 비교하고 다음부턴 자동으로 비교돌게하는 것, 이때 i의 횟수도 한번 줄여줘야함
	
		for(int i =1 ; i<=9 ; i++) { //몇번 돌건지 정하는 자리
			int num = scan.nextInt();
			if(num < min) {
				min = num;
			}
		}
		System.out.println("최솟값=" + min);
	}
	
		//최댓값
	public static void findMax() throws FileNotFoundException {
		Scanner scan = new Scanner(new File("score.txt")); //File("파일명")텍스트파일불러오기 
		
		int max = 0; //비교해야하기때문에 초기값 필요
		
		//10번 반복. 1~10까지 for
		for(int i =1 ; i <=10 ; i++) { //i는 첫시작값
			//숫자를 입력. 숫자 복사해와서 입력 ->스캐너 필요함
			int num = scan.nextInt();
			//큰수보다 크면 출력. print
			if(num > max) {
				max = num;
			}
		}
		System.out.println("최댓값=" + max);		
	}
	
	
		//구구단 5단 출력
	public static void gugudan1() {
		Scanner scan = new Scanner(System.in);
		
		int dan = scan.nextInt();
		for(int i=1 ; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan*i  );
		}
		
	}
	
	
		//10~1출력
	public static void for2() {
		for(int i=10 ; i >= 1 ; i=i-1) {
			System.out.println(i + "반복");
		}
		
		
		
	}
	
	
		//1부터 10까지 반복
	public static void for1() {
			//count가 길기때문에 보통 반복변수는 i로 쓴다.
		for( int i =1 ; i <= 10 ; i=i+2 ) { //i+=2와 i=i+2는 같음
			System.out.println(i + "반복");
		}
		
	}
	
	
	
		//1부터 10까지 반복
	public static void while1() {	
		int count = 1;
		do {
			System.out.println(count);
			count++;
			
		} while(count <= 10);
		
		
	}

}
