package memory;

import java.util.Scanner;

public class HwGuessNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] record = {1,2,3,4,5,6}; //삽입
		
		int rand = (int)(Math.random()*6) +1;
		int num;
		String result = "";
		int count = 0;
		
		
			for(int i=0; i<record.length; i++) { //삽입
				record[count] = Integer.parseInt(scanner.nextLine());
			}
		
		
		do {
			num = Integer.parseInt(scanner.nextLine());
			
			if(rand>num) {
				result = "크다";
			} else if(rand<num) {
				result = "작다";
			} else if(rand==num) {
				System.out.println("정답");
				break;
			}
			if(count>=5) {
				break;
			}
			System.out.println(result);
			
			
		} while(true);
		System.out.println("프로그램 종료");
	}

}
