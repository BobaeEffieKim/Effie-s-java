package com.yedam.java.question;

public class VIPCard implements Payment{

	private String name;
	private String grade;
	private double saleRatio;
	private int point;
	private double pointRatio;
	double rsult;
	
	VIPCard(){
		this.name = "VIPCard";
		this.grade = "Gold";
		this.saleRatio = 0.1;
		this.point = 0;
		this.pointRatio = 0.03;
	}
	
	
	@Override
	public int offline(int price) {
		point = (int)(price * pointRatio);
		price = (int) ((1-this.saleRatio -OFFLINE_PAYMENT_RATIO) * price);
		return price;
	}

	@Override
	public int online(int price) {
		point = (int)(price * pointRatio);
		price = (int) ((1-this.saleRatio -ONLINE_PAYMENT_RATIO) * price);
		return price;
	}

	@Override
	public int simple(int price) {
		point = (int)(price * pointRatio);
		price = (int) ((1-this.saleRatio -SIMPLE_PAYMENT_RATIO) * price);
		return price;
	}

	@Override
	public void showCardInfo() {
		System.out.println("===========카드정보============");
		System.out.println("카드명          :"+name);
		System.out.println("적용등급         :"+grade);
		System.out.println("할인율          :"+saleRatio);
		System.out.println("포인트 적립율     :"+pointRatio);
		System.out.println("적립율          :"+point);
	
	}

}
