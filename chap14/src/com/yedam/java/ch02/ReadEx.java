package com.yedam.java.ch02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class ReadEx {

	public static void main(String[] args) throws Exception {

		
		Reader reader = new FileReader("D:/dev/temp/test7.txt");
		//한글자씩 각각읽을때
			//파일의 크기를 모르기때문에 while문 돌린다
		while(true) {
			int data = reader.read();
			if(data == -1) break;
			System.out.println((char)data); 	
			
		}
		reader.close();
		System.out.println();
		
		reader = new FileReader("D:/dev/temp/test8.txt");
		
		char[] buffer = new char[100];	//읽을 수 있는 글자수가 2개
		
		while(true) {
			int readCharNum = reader.read(buffer);
			if(readCharNum == -1) break;
			for(int i=0; i<readCharNum; i++) {
				System.out.println(buffer[i]);
			}
			System.out.println();
		}
		reader.close();
		
		reader = new FileReader("D:/dev/temp/test10.txt");
		
		int readCharNum = reader.read(buffer, 5, 10);	//5번째 인덱스부터 10개 읽어들인다
		for(int i=0; i<(5 + readCharNum); i++) {
			System.out.print(buffer[i]);
		}
		//4,5번째 공백으로 나옴
		
		reader.close();
		
		
		
		
		
		
		
		
	}

}
