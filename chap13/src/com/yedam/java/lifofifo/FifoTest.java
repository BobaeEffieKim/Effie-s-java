package com.yedam.java.lifofifo;

import java.util.LinkedList;
import java.util.Queue;

public class FifoTest {

	public static void main(String[] args) {

		Queue<Integer> que = new LinkedList<>();
		
		que.offer(100); //stack 의 push와 같은 기능
		que.offer(50);
		que.offer(500);
		que.offer(10);
		
		while(!que.isEmpty()) {
			int value = que.poll();	//stack의 pop과 같은 기능
			System.out.println("\t Queue 수 :"+que.size());
			System.out.println("꺼내온 값 : "+value);
		}
		
		
	}

}
