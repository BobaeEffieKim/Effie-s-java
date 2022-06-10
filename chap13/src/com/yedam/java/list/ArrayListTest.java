package com.yedam.java.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		
		System.out.println("총 객체 수 : "+list.size());
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2 : "+skill);
		System.out.println();
		//순차적으로 들어갔다면 2번째 인덱스에는 Servlet이 들어가있어야하지만,
		//2번째 인덱스에 지정한 Database라는 값이 나옴
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}
		
		System.out.println();
		list.remove(2);	// 2번째 있는 값(Database) 삭제
		list.remove(2);	// 그 이후 2번째 자리로 땡겨진 값(Servelet) 삭제
		list.remove("iBATIS");
		
		System.out.println();
		for(String data : list) {
			System.out.println(data);
		}
		
		
		
		
		
		
		
		
		
	}

}
