package com.yedam.java.ch1102;

public class StringTest2 {

	public static void main(String[] args) {

		//toLowerCase & toUpperCase
		String str1 = "JAVA Programing";
		String str2 = "JAVA PROGRAMING";
		
		if(str1.equals(str2)) {			//일단 같은 값인지 비교
			System.out.println("str1과 str2는 같은 값입니다.");
		} else {
			System.out.println("str1과 str2는 다른 값입니다.");
		}
		
		String val1 = str1.toLowerCase();
		String val2 = str2.toLowerCase();
		
		if(val1.equals(val2)) {			//뜻도 같고 대문자 소문자도 같아서 같다고 인식
			System.out.println("val1과 val2는 같은 값입니다.");
		} else {
			System.out.println("val1과 val2는 다른 값입니다.");
		}
		
		
		if(str1.equalsIgnoreCase(str2)){//equlaIgnoreCase는 대소문자구분없이 (뜻이 같은지) 값을 비교 		
			System.out.println("str1과 str2는 같은 값입니다.");
		} else {
			System.out.println("str1과 str2는 다른 값입니다.");
		}
		
		
		//trim -> 앞 뒤 공백 없애주는 메소드, 중간 공백은 없애지 못함
	/*	
		String subject = "         자바    프로그래밍            ";
		String newData = subject.trim();
		System.out.println(newData);
		
		//응용 -> 가운데 공백 없애기 (내풀이)
		String result1 = newData.substring(0,3); //불필요한 부분 정리하려고 위치를 indexOF로 찾아 잘라내는 것 
		String result2 = newData.substring(6);
		
		System.out.println(result1 + result2);
	*/	
		
		//교수님 풀이 
		
		String subject = "         자바    프로그래밍            ";
		String newData = subject.trim();
		String data1 = newData.substring(0, 2);
		String data2 = newData.substring(newData.indexOf("프로그래밍"));
		String result = data1 + " " + data2;
		System.out.println(result);
		
		
		//valueOf
		String value1 = String.valueOf(10);
		String value2 = String.valueOf(10.5);
		String value3 = String.valueOf(true);
		
		String value4 = ""+100;
		
		
	}

}
