package com.yedam.java.ch02;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteEx {

	public static void main(String[] args) throws Exception {
		
			//최상위클래스
		Writer writer = new FileWriter("D:/dev/temp/test7.txt");
			
			//Char 타입
		//1. 각각 내보내기
		char a = 'A';
		char b = 'B';
		char c = 'C';
		
		writer.write(a);
		writer.write(b);
		writer.write(c);
		
		writer.flush(); //출력 스트림이기때문에 닫기전에 반드시 플러쉬해줘야함
		writer.close();
		
		writer = new FileWriter("D:/dev/temp/test8.txt");
		//2. 배열크기로 통째로 내보내기
		char[] array1 = {'A','B','C'};
		
		writer.write(array1);
		
		writer.flush();
		writer.close();
		
		writer = new FileWriter("D:/dev/temp/test9.txt");
		//3. 지정한 위치부터 n개까지 내보내기
		char[] array2 = {'A', 'B', 'C', 'D', 'E'};
		
		writer.write(array2,3,2); //3번째 인덱스부터 2개 더 출력하겠다
		
		writer.flush();
		writer.close();
		
		//////////////////////////////////////////////////
		
		writer = new FileWriter("D:/dev/temp/test10.txt");
			
			//String 타입
		String str1 = "ABCDE\n";	//통째로 보내는 방법
		String str2 = "abcde";		//위치를 잘라서 ~번째부터 보내는 방법
		
		writer.write(str1);
		writer.write(str2,3,2);
		
		writer.flush();
		writer.close();
		
	}
}
