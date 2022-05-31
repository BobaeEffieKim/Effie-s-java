package com.yedam.jave.ch0902;

public class Product {

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
	void method1() {
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
			}

			@Override
			public void turnOff() {
				print();
				System.out.println("전원을 끕니다.");
			}
			
		};
		
		var.turnOn();
		var.turnOff();
	}
	
		void method2(RemoteControl rc) {
			rc.turnOn();
			rc.turnOff();
		}
	
}
