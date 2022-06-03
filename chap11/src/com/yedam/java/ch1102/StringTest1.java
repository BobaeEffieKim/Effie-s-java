package com.yedam.java.ch1102;

import java.io.UnsupportedEncodingException;

public class StringTest1 {

	public static void main(String[] args) {

		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74,97, 118, 97};
		
		String str1 = new String(bytes);	//생성자를 통해서 byte타입을 문장형태로 만들기
		System.out.println(str1);
		
		String str2= new String(bytes, 6, 4);
		//bytes타입을 기준으로 인덱스 위치 6에서 4개를 가지고 오겠다는 뜻
		System.out.println(str2);
	
		
		System.out.println();
		
		//String-> byte -> String
		String str ="안녕하세요";
		
		byte[] bytes1 = str.getBytes();
		System.out.println(bytes1);
		String strs1 = new String(bytes1);
		System.out.println(strs1);
		
		System.out.println();
		
		try {
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println(bytes2);
			String strs2 = new String(bytes2,"EUC-KR");
			System.out.println(strs1);
			} catch(UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		System.out.println();
		
	
		//charAt -> String 안에서 특정한 글자 하나만 가지고 올때
		String ssn = "123456-2020202";
		char gender = ssn.charAt(7); //인덱스 7번째에 있는 글자 하나를 복사해오는 것
		switch(gender) {
		case '1' :
		case '3' :
			System.out.println("남자입니다.");
			break;
		case '2' :
		case '4' :
			System.out.println("여자입니다.");
			break;
		}
		
		//응용하여 for문 돌리기
		for(int i=0; i < ssn.length(); i++) {
			System.out.println(ssn.charAt(i));
		}
		
		
		//equals -> String 타입은 =사용 말고 equals 쓰기
		System.out.println();
		//여기서 equals는 object클래스 override해서 만든 것
		String val1 ="김보배";	//프로젝트 내에서 새로운 인스턴스 생성
		String val2 ="김보배";	//새로운 인스턴스를 생성하지 않고 위의 인스턴스를 공유(new연산자 사용하지 않았기때문에)
		String val3 =new String("김보배"); //새로운 인스턴스 생성

		if(val1.equals(val2)) {	//첫번재값과 두번째값에 대해서 내부값이 같은지 확인
			System.out.println("val1과 val2는 값이 같습니다.");
		} else {
			System.out.println("val1과 val2는 값이 다릅니다.");
		}
		
		if(val1.equals(val3)) {	//첫번재값과 두번째값에 대해서 내부값이 같은지 확인
			System.out.println("val1과 val3는 값이 같습니다.");
		} else {
			System.out.println("val1과 val3는 값이 다릅니다.");
		}
		
		if(val1 == val2) {
			System.out.println("val1과 val2는 같은 인스턴스입니다.");
		} else {
			System.out.println("val1과 val2는 다른 인스턴스입니다.");
		}
		
		if(val1 == val3) {
			System.out.println("val1과 val3는 같은 인스턴스입니다.");
		} else {
			System.out.println("val1과 val3는 다른 인스턴스입니다.");
		}
		
		
		System.out.println();
		//indexOf -> 그 문장안에 내가 찾고자하는 문자가 있는지 여부확인하는데 많이 씀
		String subject = "자바 프로그래밍 & 스프링 정석";
		int location = subject.indexOf("프로그래밍");	//해당되는 단어가 어느위치에서 시작되는지 0부터
		System.out.println(location);
	
		if(subject.indexOf("자바")!= -1) { //찾고자하는 단어가 없으면 indexOf는 -1이라는 고정된 값을 가지는 특징을 이용
			System.out.println("자바와 관련된 책");
		} else {
			System.out.println("자바와 관련없는 책");
		}
	
	//substring -> 위치에 따라 잘라냄
	String result1 = subject.substring(subject.indexOf("프로그래밍")); //불필요한 부분 정리하려고 위치를 indexOF로 찾아 잘라내는 것 
	System.out.println(result1);
	
	
	
	String ssn1 = "880815-1234567";
	System.out.println("생년월일 : "+ssn1.substring(0, 6)); //(중요) 0번째부터 6번째인덱스 앞까지 , (첫번째값)시작하는 인덱스순번부터 (두번째값)에서 지정하는 값 전까지 끊음
	System.out.println("개별정보 : "+ssn1.substring(7));	 //7번째부터 시작

	
	
	
	//length -> 배열의 length와 비슷하지만 배열에서 랭쓰는 필드이고, 여기서는 메서드임
	String[] temp = {"1","2"};	
	int val = temp.length;
	System.out.println(ssn1.length());
	
	
	//replace
	String oldStr = "Java 프로그래밍";
	String newStr = oldStr.replace("Java", "자바");
	System.out.println(oldStr + " -> " + newStr);
	
	
	
	}
	
}
