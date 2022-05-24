// 문제) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
		// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
		// 1) 메뉴는 다음과 같이 구성하세요.
		// 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
		// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
		// 3) 제품별 가격을 출력하세요.
		//	출력예시, "상품명 : 가격"
		// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
		// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.


package com.yedam.homework;

public class ProductSystem { //배열을 구성하는 타입이 달라짐. 내가 사용하고자하는 타입을 먼저쓰고 얘를 배열로 쓰겠다 해주면 됨.
	
	private Product[] list;
	private int index;
	
	public ProductSystem() {
		index = -1;
	}	
	
	while(run) {
		System.out.println("======================================================");
		System.out.println("1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
		System.out.println("======================================================");
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
	//4-1.최고가
	Product getMaxPrice() {
		product.maxPrice(price);
		Product max = [0];
	}
	
	}
	
	//죄송합니다.. 집에서 해보려니 도저히 하나도 이해가 안돼서 차라리 책보면서 예제 복습했습니다ㅠㅠ..
	
}

