package chap01;

import java.util.Scanner;

public class P98 {

	public static void main(String[] args) {

		//문제1
		//문제1();
		
		//문제2
		//문제2();
		
		//문제3
		//문제3();
	}
	
	public static void 문제1() {
		String name = "감자바";
		int age = 25;
		String tel1 = "010", tel2 = "123", tel3 = "4567";
		
		System.out.println("이름:" + name);
		System.out.print("나이:" + age);
		System.out.printf("\n전화:%s-%s-%s", tel1,tel2,tel3);
		
	}
	
	public static void 문제2() {
        Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 수:");
		String strNum1 = scanner.nextLine();
		
		System.out.print("두번째 수:");
		String strNum2 = scanner.nextLine();
		
		int num1 = Integer.parseInt(scanner.nextLine());
		int num2 = Integer.parseInt(scanner.nextLine());
		int result = num1 + num2;
		System.out.println("덧셈 결과:" + result);
	}

	public static void 문제3() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("[필수 정보 입력]");
		
		System.out.println("이름:");
		String name = scanner.nextLine();
		
		System.out.println("주민번호 앞 6자리:");
		String id = scanner.nextLine();
		
		System.out.println("전화번호:");
		String tel = scanner.nextLine();
		
		System.out.println("[입력한 내용]");
		
		
		
		
		
		
		
		
		
		
	}
	
}
