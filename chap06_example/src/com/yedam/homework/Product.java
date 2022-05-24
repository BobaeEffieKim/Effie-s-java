package com.yedam.homework;

public class Product {
	//상품에 대한 정보를 가지는 클래스 
	
	//필드 -> 상품명, 가격이 필요 / 어떻게 값을 초기화할건지 정해서 해보기
	private String name;
	private int price;
	
	//생성자
	public Product() {}
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	//메소드
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void showInfo() {				//간단하게 호출하는 방법 -> productSystem에서 showinfo만 출력하면 됨.
		System.out.println(name+":"+price);
	}
	
}
