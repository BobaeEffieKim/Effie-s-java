package com.yedam.jave.ch0902;

public class PersonTest {

	public static void main(String[] args) {

		Anonymous anony = new Anonymous(); //변수선언
		
		//'필드가 익명 객체'인 경우
		anony.field.wake();
		
		System.out.println();
		
		//'로컬 변수가 익명 객체'인 경우
		anony.method1();
		
		System.out.println();
		//'매개 변수가 익명 객체'인 경우
		anony.method2(new Person() {
			//필드
			String job = "학생";
			//메소드
			void study() {
				System.out.println("공부합니다.");
			}
			@Override
			void wake() {
				System.out.println("8시에 일어납니다.");
				study();
			}
		});
	}

}
