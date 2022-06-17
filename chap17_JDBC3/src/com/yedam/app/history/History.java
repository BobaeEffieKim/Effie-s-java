package com.yedam.app.history;

public class History {

	private int productId;
	//프로덕트카테고리는 두개의 값만 입력되도록 설정 
	//각 컬럼의 제약조건 있음(check) -> 오라클은 boolean타입이 없어서 0,1을 사용하여 구분	
		// 1 : 입고 , 2 : 출고
	private int productCategory;
	private int productAmount;
	
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(int productCategory) {
		this.productCategory = productCategory;
	}
	public int getProductAmount() {
		return productAmount;
	}
	public void setProductAmount(int productAmount) {
		this.productAmount = productAmount;
	}
	
	
	
	
}
