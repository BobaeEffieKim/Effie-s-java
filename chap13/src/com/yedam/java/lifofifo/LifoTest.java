package com.yedam.java.lifofifo;

import java.util.Stack;

public class LifoTest {

	public static void main(String[] args) {

		Stack<Integer> box = new Stack<>();
		
		box.push(100);
		box.push(50);
		box.push(500);
		box.push(10);
		
		while(!box.isEmpty()) {
			int value = box.pop();
			//pop => get() + remove()의 개념
			//끄집어낸 값을 재사용할 수 없다.
			System.out.println("\t box 값 : "+ box.size());
				//pop한번 할때마다 사이즈의 수가 줄어든다
			
			System.out.println("꺼내온 값 : "+value);
			//push로 입력한 순서의 정반대로 나옴 => last in first out
		}
		
	}

}
