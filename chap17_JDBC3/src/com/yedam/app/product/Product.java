package com.yedam.app.product;
//Vo class
public class Product {

	private int productId;
	private String productName;
	private int productPrice;
	
	
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
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	
	@Override
	public String toString() {
		return "제품 번호 : " + productId
				+ "제품 이름 : " + productName
				+ "제품 가격 : " + productPrice;
	}
	
}