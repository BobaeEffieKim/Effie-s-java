package com.yedam.jave.ch0902;
//자식 객체
public class Anonymous {

	//필드
	//익명 자식객체 선언하고 사용하는 방법
	Person field = new Person(){//인스턴스 필요해서 new쓰긴하지만 본인 이름이 없기때문에 대신해서 부모클래스 호출
		//필드
		String job = "회사원";
		//메소드
		void work() {
			System.out.println("출근합니다.");
		}
		@Override 
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	};
	
	//생성자
	
	//메소드
	
	void method1() {
		//로컬변수
		Person var = new Person() {
			//익명자식객체에 대한
			//필드
			String job = "취준생";
			//메소드
			void walk() {
				System.out.println("면접봅니다.");
			}
			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
		};
		var.wake(); //var이라는 객체가 가지고 있는 익명 자식객체와 필드에 연결되어있는 익명 자식객체는 다름. 각각 생기는 것임. 
	}
	
	void method2(Person person) {
		person.wake();
	}
	
}
