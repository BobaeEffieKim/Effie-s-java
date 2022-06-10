package com.yedam.java.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StringTest {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		//set.add(new String("Java"))
		set.add("iBATIS");
		
		System.out.println("총 객체 수 : "+set.size());
		System.out.println();
		//Java가 중복저장된다고 인식되어서 총 객체수 4개로 나옴
		
		
		//반복자 -> 하나의 객체이기때문에 타입으로 선언 가능
		//내부에 한번씩 모두 접근할 수 있는 정보
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t"+element); 	// \t -> 들여쓰기
		}
		System.out.println();
		
		//제거
		set.remove("JDBC");
		set.remove("iBATIS");
		
		for(String data : set) {
			System.out.println(data);
		}
		System.out.println();
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비어있음.");
		}
		
		
	}

}
