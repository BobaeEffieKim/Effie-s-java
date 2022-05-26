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
			//System.out.println(product.getName()+":"+product.getPrice()); //첫번째방법
			
			//System.out.println(list[i].getName()+":"+list[i].getPrice()); //두번째방법
		
			list[i].showInfo(); //세번째방법
		}
	}
	
	
	//4.분석
	
	
	
	//4-1. 최고가격을 가지고있는 제품정보
	public Product getMaxPriceInfo() {
		Product maxInfo = list[0]; //첫번째가격을 빼서 변수에 선언
		for(int i=1; i<=index;i++) { //0번째는 위에서 들고왔기때문에 0번째 하나 뒤부터 시작해야함
			if(maxInfo.getPrice() < list[i].getPrice()) {
				maxInfo = list[i];
			
			}
			}
			return maxInfo;
		}
	//4-2. 최고가격을 제외한 제품들의 총합
	
	public int getTotalPrice() {
		int sum =0;
		for(Product temp : list) {
			sum += temp.getPrice();
		}
		Product maxInfo = getMaxPriceInfo();
		int result = sum - maxInfo.getPrice();
		
		//위의 두줄 합친 것
		//int result = sum - getMaxPriceInfo().getPrice(); //getMaxPriceinfo호출의 결과값(최고가 제품)의 가격을 호출
		
		
		result =0;
		for(Product temp : list) {
			if(temp.getPrice() == maxInfo.getPrice()) {
				continue; //반복문 안에서 컨티뉴를 만나면 빠져나가지않고, 다시 위로 올라간다음 다음으로 넘어감
				//break는 끝내고 반복문 벗어남, continue는 지금 조건에 해당하지않으면 실행하지않고 다음 조건으로 넘어감
			}
			result += temp.getPrice();
			/*
			 * if(temp.getPrice() < maxInfo.getPrice()){
			 *  result += temp.gerPrice();}      -> 컨티뉴 없다면 ㅠ 
			 * 
			 */
		}
		return result;
	}
	
	
//	
//	public void getMaxScore() { //메소드를 호출하여 아래 다 실행되도록
//		int max = list[0].getPrice();
//		int maxList = 0;
//		for(int i=0;i<=index;i++) {
//			if(max<list[i].getPrice()) {
//				max = list[i].getPrice();
//				maxList = i;
//				
//			}
//		}
//	} int sum = 0;
//		for(int i=0; i<=index; i++) {
//			sum += list[i].getPrice();
//		} return (double)sum / ;
//	
//	
		
}
