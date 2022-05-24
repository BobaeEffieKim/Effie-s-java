package com.yedam.homework;

public class ProductSystem { //배열을 구성하는 타입이 달라짐. 내가 사용하고자하는 타입을 먼저쓰고 얘를 배열로 쓰겠다 해주면 됨.
	
	private Product[] list;
	private int index;
	
	public ProductSystem() {
		index = -1;
	}	
	
	//1.상품 수 입력
	public void setListSize(int size) {
		list = new Product[size]; //기존과 다른점은 int타입대신에 지금 product타입 쓰고있음.
	}
	
	//2.상품 및 가격 입력
	public void putProduct(String name, int price) {
		Product product = new Product(); //값을 담기위한 임시변수 만들기
		product.setName(name);
		product.setPrice(price);
		
		list[++index] = product; //위처럼 이렇게 만들어진 배열을 리스트에 넣어준다.
	
	}
	
	//3.제품별 가격 출력
	public void printList() {
		for(int i=0; i<=index; i++) {
			Product product = list[i]; //리스트에있는 i번째 값을 담았다.
			
			//출력 방법이 여러가지 있다.
			System.out.println(product.getName()+":"+product.getPrice()); //첫번째방법
			
			System.out.println(list[i].getName()+":"+list[i].getPrice()); //두번째방법
		
			list[i].showInfo(); //세번째방법
		}
	}
	
	
	//4.분석

	
	
	
}
