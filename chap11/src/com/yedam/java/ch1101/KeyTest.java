package com.yedam.java.ch1101;

import java.util.HashMap;
import java.util.Map;

public class KeyTest {

	public static void main(String[] args) {

		Map<Key, String> map = new HashMap<Key, String>();
		//Map -> 하나의 키에 하나의 value를 묶어서 세트로 값을 가지는 일종의 배열
		
		map.put(new Key(1), "홍길동");
		
		String value = map.get(new Key(1));
		System.out.println(value);
		
	}

}
