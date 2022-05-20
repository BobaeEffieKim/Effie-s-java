package baekjun.p10871;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n;
		int x;
		int num;	//입력변수
		int i=1;	//반복횟수
		
		n = scan.nextInt(); //n에 대한 수를 받는다
		x = scan.nextInt(); //x에 대한 수를 받는다
		
		do {
			num = scan.nextInt();
			if(num < x) {
				System.out.print(num + " ");
			}
			i++;    //num한번 입력받고 횟수가 1회씩 늘어난다
			
		} while(i<=n);
		
		
		
	}

}
