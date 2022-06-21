package com.yedam.app.deal;

import java.sql.Date;

//공용으로 사용할 하나의 vo클래스
public class DealInfo {

	private Date dealDate;
	private int productId;
	private String productName;
	private int productAmount;
	
	

	
	
	public Date getDealDate() {
		return dealDate;
	}





	public void setDealDate(Date dealDate) {
		this.dealDate = dealDate;
	}





	public int getProductId() {
		return productId;
	}





	public void setProductId(int productId) {
		this.productId = productId;
	}





	public String getProductName() {
		return productName;
	}





	public void setProductName(String productName) {
		this.productName = productName;
	}





	public int getProductAmount() {
		return productAmount;
	}





	public void setProductAmount(int productAmount) {
		this.productAmount = productAmount;
	}




	//원래 vo 클래스에는 name값이 없지만, 문장에 따라서 name을 추가하려고?
		//if절 이용하여 값이 있을때만 result 출력 => 값이 있는 경우란, 
	@Override
	public String toString() {
		String result = "거래 일자 : "+ dealDate
				+ ", 제품 번호 : " + productId;
		
		if(productName != null) {
			result += ", 제품 이름 : " + productName;
		}
		
		result += ", 수량 : " + productAmount;
		
		return result;
	}
	
}
