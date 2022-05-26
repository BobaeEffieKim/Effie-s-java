package com.yedam.java.ch0703;

public class PhoneTest {

	public static void main(String[] args) {
//
//		Phone phone = new Phone("Z플립","블랙"); //Phone 클래스에 abstract설정하면 바로 오류뜸 , new연산자 사용불가
//		phone.powerOn();
//		
		DmbPhone dmbPhone = new DmbPhone("Z플립","블랙");
		dmbPhone.powerOn();
		dmbPhone.showDmb();
		
	}

}
