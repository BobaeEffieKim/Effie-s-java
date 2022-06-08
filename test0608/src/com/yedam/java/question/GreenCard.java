package com.yedam.java.question;

public class GreenCard implements Payment{

	private String name;
	private String grade;
	private int point;
	private double pointRatio;
	
	GreenCard(){
		this.name = "GreenCard";
		this.grade = "Silver";
		this.point = 0;
		this.pointRatio = 0.05;
	}
	
	
	@Override
	public int offline(int price) {
		point = (int)(price * pointRatio);
		price = (int) ((1-OFFLINE_PAYMENT_RATIO) * price);
		return price;
	}

	@Override
	public int online(int price) {
		point = (int)(price * pointRatio);
		price = (int) ((1-ONLINE_PAYMENT_RATIO) * price);
		return price;
	}

	@Override
	public int simple(int price) {
		point = (int)(price * pointRatio);
		price = (int) ((1-SIMPLE_PAYMENT_RATIO) * price);
		return price;
	}

	@Override
	public void showCardInfo() {
		System.out.println("===========카드정보============");
		System.out.println("카드명          :"+name);
		System.out.println("적용등급         :"+grade);
		System.out.println("포인트 적립율     :"+pointRatio);
		System.out.println("적립율          :"+point);
	}

}
