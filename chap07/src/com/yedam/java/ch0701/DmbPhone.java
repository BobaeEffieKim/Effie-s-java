package com.yedam.java.ch0701;

public class DmbPhone extends Phone { //상속 -> DmbPhone은 Phone이라는 클래스를 부모로 두는 자식클래스 

//	1. 상속
//	2. 변수 지정
//	3. 필요기능에 따른 메소드 지정
//	4. DmbPhone 설정 -> public DmbPhone(String model, String color)
	
	
	
	int ch;
	
	
	public DmbPhone(String model, String color){
		super(model, color); //new연산자 필요없이 부모클래스에 있는 것 호출해오는것
				 //this.는 부모거인지 내거인지 알수없지만/ 내거는 this, 부모거는 super를 써서 구분하자
		
		
	  //super.model = model; 해도됨
	  //this.model = model; //클래스가 아닌 인스턴스에 접근하기 위해 this를 사용
	  //super.color = color; //부모 클래스의 인스턴스도 this를 통해 접근하여 사용가능
		this.ch = 10; //-> 본인것(ch)은 super로 호출할 수 없음 
	}
	
	
	
	void turnOnDmb() { //dmb기능 시작하는 메소드
		System.out.println("채널"+ch+"번 방송 수신을 시작합니다.");
	}
	
	void turnOffDmb() {
		System.out.println("방송수신을 멈춥니다.");
	}
	
	void changeChannel(int ch) { //채널을 바꾸는 메소드
		this.ch = ch;
		System.out.println("채널"+ch+"번으로 채널을 바꿉니다.");
	}



	@Override
	void bell() {
		// TODO Auto-generated method stub
		super.bell();
	}



	@Override
	void call() {
		// TODO Auto-generated method stub
		super.call();
	}
}
