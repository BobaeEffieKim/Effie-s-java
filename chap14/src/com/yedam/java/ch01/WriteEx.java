package com.yedam.java.ch01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteEx {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("D:/dev/temp/test1.db");
		
		
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		os.write(a);
		os.write(b);
		os.write(c);
		
		os.flush();	//출력스트림에서는 flush해줘야함
		os.close();
		
		os = new FileOutputStream("D:/dev/temp/test2.db");
		
		byte[] array1 = { 10, 20, 30 };
		
		os.write(array1);	//배열에 있는 값을 모두 보낸다
		
		os.flush();
		os.close();
		
		os = new FileOutputStream("D:/dev/temp/test3.db");
		
		byte[] array2 = { 10, 20, 30, 40, 50 };
		
		os.write(array2, 3, 2);	//현재배열3개 외의 2개의인덱스를 더 넘길건데, 
			//3번째 인덱스부터 2개의 값을 더 출력하겠다
		
		os.flush();
		os.close();
		
		
	}
	
	
	
}
