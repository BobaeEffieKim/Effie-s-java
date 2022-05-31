package com.yedam.jave.ch0902;

//주의할점 실습 클래스
public class Product2 {

	//필드
	RemoteControl field = new RemoteControl(){	//익명 자식 객체
		//필드
		String message = "스마트TV";
		//메소드
		void print() {
			System.out.println("제품 종류 : "+message);
		}
		@Override
		public void turnOn() {
			print();
			System.out.println("전원을 켭니다.");
		}
		@Override
		public void turnOff() {
			print();
			System.out.println("전원을 끕니다.");
		}
	};
	
	//생성자
	
	
	//메소드
	RemoteControl method1() {	//수정
		
		int volume=0;	//추가
		
		RemoteControl var = new RemoteControl() {

			//필드
			String message = "Audio";
			//메소드
			void print() {
				System.out.println("제품 종류 : "+message);
			}
			@Override
			public void turnOn() {
				print();
				System.out.println("전원을 켭니다.");
				System.out.println("현재 볼륨 : "+volume);	//추가
			}

			@Override
			public void turnOff() {
				print();
				System.out.println("전원을 끕니다.");
			}
			
		};
		
		var.turnOn();
		var.turnOff();
		
		return var;		//추가
	}
	
		void method2(RemoteControl rc) {
			rc.turnOn();
			rc.turnOff();
		}
	
}
