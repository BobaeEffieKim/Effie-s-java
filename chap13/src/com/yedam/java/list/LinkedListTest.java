package com.yedam.java.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		
		//코드가 실행되는 속도 비교
		long start;
		long end;
		//ArrayList
		start = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		end = System.nanoTime();
		System.out.println("ArrayList 걸린시간 : "+(end - start)+"ns");
		//LinkedList
		start = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		end = System.nanoTime();
		System.out.println("LinkedList 걸린시간 : "+(end - start)+"ns");
		
		
		
		
		}

}
