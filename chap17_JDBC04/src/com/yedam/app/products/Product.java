package com.yedam.app.products;
//VO 클래스 -> 필요한 정보를 저장하는 클래스이기때문에, 보통 필드와 게터세터로만 구성되는 경우가 많음
//때에 따라 필요한 정보를 출력할때는 toString 오버라이딩 할 때도 있음, 이를 이용하여 간단한 연산도 가능
public class Product {

	private int productId;
	private String productName;
	private int productPrice;
	private int productStock;
	
	
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
	public int getProductStock() {
		return productStock;
	}
	public void setProductStock(int productStock) {
		this.productStock = productStock;
	}
	
	
	@Override
	public String toString() {
		return "제품번호 : " + productId
				+ ", 제품이름 : " +productName
				+ ", 제품가격 : " +productPrice
				+ ", 제품재고 : " +productStock
				+ ", 현 재고기반 가치 : " + (productPrice * productStock);
	}
	
}
