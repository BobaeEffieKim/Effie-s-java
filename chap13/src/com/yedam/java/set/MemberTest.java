package com.yedam.java.set;

import java.util.HashSet;
import java.util.Set;

public class MemberTest {

	public static void main(String[] args) {

		Set<Member> set = new HashSet<>();
		
		set.add(new Member("홍길동",30));
		set.add(new Member("홍길동",30));
		
		System.out.println("총 객체 수 : "+set.size());
		//동일한 값을 중복으로 보지않고 각각으로 인식해서 총 객체 수 2개로 나옴
		
		//equals 실행 후엔 1개로 나옴
	}

}
