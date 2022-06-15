package com.yedam.java.ch03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class CharacterConvertExample {
//입출력은 바이트기반으로 전달되지만, 실제 사용자가 문자를 입출력하고싶을때 사용
	//->바이트기반은 1바이트 기준으로 읽어들임, but 자바는 글자를 2바이트를 기준이르 잡음
		//그래서 끊어서 하나씩 읽다보니 문제가 생김 -> 이를 해결하기위해 문자기반 스트림 만든이유
	
	
	public static void main(String[] args) throws Exception {

		System.out.println("입력 문장 > ");
		String data = new Scanner(System.in).nextLine();
		write(data);
		read();
		
	}

	
	public static void write(String str) throws Exception{
		//1.내가 사용하고자하는 스트림 만들기 2. 보조스트림 만들기
		
		//바이트 기반의 출력스트림
		OutputStream os = new FileOutputStream("D:/dev/temp/text1.txt");
	
		//os.write(str); -> 오류, 직접적으로 못바꿔줌. 그래서 보조스트림 사용	
		
		
		//문자기반 writer스트림이 아웃풋스트림과 연결됨
		Writer writer = new OutputStreamWriter(os);
	
		writer.write(str);
		writer.flush();
		writer.close();
		
	}
	public static void read() throws Exception {
		InputStream is = new FileInputStream("D:/dev/temp/text1.txt");
	
		//보조스트림으로 대체
		Reader reader = new InputStreamReader(is);
		
		
		char[] buffer = new char[100];
		int readCharNum = reader.read(buffer);
		
		reader.close();
		
		String data = new String(buffer, 0, readCharNum);
		
		System.out.println(data);
	
	}
}
