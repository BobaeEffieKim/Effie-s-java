package com.yedam.java.ch01;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadEx {

	public static void main(String[] args) throws Exception {

		InputStream is = new FileInputStream("D:/dev/temp/test1.db");
		
		//파일에 있는 모든 값을 읽어들일것이기때문에
		while(true) {
			int data = is.read();
			if(data == -1) break;	//값이 -1이면 읽어들일 값이 없음
			System.out.println(data);	//값이 -1이 아니면 data출력
		}
		is.close();
		
		System.out.println("============================");
		is = new FileInputStream("D:/dev/temp/test2.db");
		byte[] buffer = new byte[100];
		while(true) {
			int readByteNum = is.read(buffer);
			if(readByteNum == -1) break;
			for(int i=0; i<readByteNum; i++) {
				System.out.println(buffer[i]);
			}
			System.out.println();
		}
		is.close();
		
		System.out.println("============================");
		is = new FileInputStream("D:/dev/temp/test3.db");
		
		
		int readByteNum = is.read(buffer,3,2);
		for(int i=0; i < (3+readByteNum); i++) {
			System.out.println(buffer[i]);
		}
		is.close();
		System.out.println("test3.db===");
		is = new FileInputStream("D:/dev/temp/test3.db");
		while(true) {
			int data = is.read();
			if(data == -1) break;
			System.out.println(data);
		}
		is.close();
		}
	}


