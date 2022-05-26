package com.yedam.java.example1;

public class VIP extends Customer {

	//필드 -> Customer 기준으로 상속받았기때문에 추가해야할 필드가 2개
	double discountRatio;
	String customerService;
	
	public VIP(int customerId, String customerName, String customerService) {
		super(customerId, customerName);
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		this.discountRatio = 0.15;
		this.customerService = customerService;
		
		
	}
	
	@Override
	public int calcPrice(int price) {
		this.bonusPoint += price * this.bonusRatio; //
		return (int)(price*(1-discountRatio));
	}

	@Override
	public String showInfo() {
		return super.showInfo()+"\n"+"담당 상담원은 "+customerService+"입니다.";
	}
	
	
	public double getDiscountRatio() {
		return discountRatio;
	}
	public void setDiscountRatio(double discountRatio) {
		this.discountRatio = discountRatio;
	}
	public String getCustomerService() {
		return customerService;
	}
	public void setCustomerService(String customerService) {
		this.customerService = customerService;
	}
	
	
	
	
	
}

