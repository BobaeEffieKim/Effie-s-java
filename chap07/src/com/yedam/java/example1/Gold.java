package com.yedam.java.example1;

public class Gold extends Customer{

	//필드
	double discountRatio;	//부모 클래스와 다른 부분 추가해주기 
	
	public Gold(int customerId, String customerName) {
		super(customerId, customerName);
		this.customerGrade = "GOLD";
		this.bonusRatio = 0.02;
		this.discountRatio = 0.1;
	}


	//메소드
	@Override
	public int calcPrice(int price) { //포인트 적립하는 메소드 -> 보너스 포인트 적립할때 그 기준은 가격
		//1. 보너스포인트 적립
		this.bonusPoint += price * this.bonusRatio;
		//2. 할인률이 적용된 가겨
		return (int)(price*(1-discountRatio)); //할인률 적용하여 할인적용된 가격 리턴
							//goldclass에서 처리하는 이유: 가격은 누구에게나 같지만, 할인률은 다르기때문
	}
	
	public String showInfo(){ //정보를 출력하는 스트링
		return customerName + "님의 등급은" + customerGrade + "이며, 보너스 포인트는" + bonusPoint + "이며, 적용받을 수 있는 할인률은"+discountRatio+"퍼센트입니다.";
	}


	public void setDiscountRatio(double discountRatio) {
		this.discountRatio = discountRatio;
	}
	
	public double getDiscountRatio() {
		return discountRatio;
	}


	
}
