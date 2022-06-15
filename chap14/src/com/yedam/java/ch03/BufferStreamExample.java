package com.yedam.java.ch03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferStreamExample {

	public static void main(String[] args) throws Exception {

		//buffer스트림이 없는경우
		String originalFilePath1
		= BufferStreamExample.class.getResource("originalFile1.jpg").getPath();
			//getResource => 내가 찾고자하는 파일의 정보 요청
			//getPath => 파일의 위치
			
			//복사
		String targetFilePath1 = "D:/dev/temp/targetFile1.jpg";
			//입력스트림
		InputStream fis1 = new FileInputStream(originalFilePath1);
			//출력스트림
		OutputStream fos1 = new FileOutputStream(targetFilePath1);
		
			//버퍼사용하지않을경우에 타임 확인
		long nonBufferTime = copy(fis1, fos1);
		System.out.println("버퍼를 사용하지 않았을 때 : "+nonBufferTime+"ns");
		
		fis1.close();
		fos1.close();
		
		
		
		//buffer스트림이 있는경우
		String originalFilePath2
		= BufferStreamExample.class.getResource("originalFile2.jpg").getPath();
			//getResource => 내가 찾고자하는 파일의 정보 요청
			//getPath => 파일의 위치
			
			//복사
		String targetFilePath2 = "D:/dev/temp/targetFile2.jpg";
			//입력스트림
		InputStream fis2 = new FileInputStream(originalFilePath2);
			//출력스트림
		OutputStream fos2 = new FileOutputStream(targetFilePath2);
		
			//리더 만들기
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
			//버퍼사용하지않을경우에 타임 확인
		long BufferTime = copy(bis, bos);
		System.out.println("버퍼를 사용했을 때 : "+BufferTime+"ns");
		
		
		fis2.close();
		fos2.close();
		
	}

	
	static int data = -1;
	public static long copy(InputStream is, OutputStream os) throws Exception{
		
		long start = System.nanoTime();
		while(true) {
			data = is.read();
			if(data == -1) break;
			os.write(data);
		}
		
		
		
		long end = System.nanoTime();
		return (end - start);
	}
	
}
