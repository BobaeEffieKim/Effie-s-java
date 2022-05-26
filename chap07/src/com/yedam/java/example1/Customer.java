package com.yedam.java.example1;

public class Customer {

	//필드
	int customerId; 	 //고객아이디
	String customerName; //고객 이름
	String customerGrade;//고객 등급
	int bonusPoint;		 //보너스 포인트
	double bonusRatio;	 //보너스 적립율
	
	//생성자
	/*새롭게 추가한 내용 
	 * public Customer(); { 
	 * this.customerGrade = "SILVER"; 
	 * this.bonusRatio = 0.01; }
	 */
	
	public Customer(int customerId, String customerName){//고객이 정해줘야하는 부분
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerGrade = "SILVER";
		this.bonusRatio = 0.01;
	}
	//메소드
	public int calcPrice(int price) { //포인트 적립하는 메소드 -> 보너스 포인트 적립할때 그 기준은 가격
		this.bonusPoint += price * this.bonusRatio;
		return price;
	}
	
	public String showInfo(){ //정보를 출력하는 스트링
		return customerName + "님의 등급은" + customerGrade + "이며, 보너스 포인트는" + bonusPoint + "입니다.";
	}
	
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getCustomerId() {
		return customerId;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public  String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	public  String getCustomerGrade() {
		return customerGrade;
	}
	
	
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public  int getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
	public double getBonusRatio() {
		return bonusRatio;
	}
	
	
	
}
