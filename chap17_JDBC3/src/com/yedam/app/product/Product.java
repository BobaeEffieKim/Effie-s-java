package com.yedam.app.product;
//1번
//Vo class -> 보통 단수형으로 만듦
//
public class Product {
	//필드는 컬럼명, 타입 참고하여 만듦
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
	
	//계속 이 클래스를 이용해서 생성할거니가 그 객체마다 가지고있는 메모리 주소가 다른데
	//원래 그 메모리 주소들이 투스트링에 담긴다
	
	//그 메모리 주소들을 오버라이딩하여 문자열로 출력하겠다
	//오버라이딩하는 이유는 출력문 사용할때마다 써주는 수고 덜려고 
	@Override
	public String toString() {
		return "제품 번호 : " + productId
				+ "제품 이름 : " + productName
				+ "제품 가격 : " + productPrice;
	}
	
}
/*
 * 
 * dao -> db와의 연결 정보가 들어있는 클래스
 * 		-> db 연결하고 
 * 		-> stmt pstmt rs 여기서 선언 먼저 해서 쿼리문을 쓰고 db로 연결되게 함 
 * 
 * vo -> db 에 테이블이 여러개 있으면 , 한 테이블의 정보를 담는 클래스 
 * 		-> 필드 : 이 테이블에 있는 모든 컬럼 선언 
 * 		-> 세터 => 원래 자바에서ㅢ 세터는 값 초기화 
 * 			데이터를 테이블에 집어넣으면 한 행씩 들어갈때 
 * 			-> 디벨로퍼에서는 쿼리문쓸때 values해서 넣는데
 * 				자바에서는 세터로 데이터 하나하나 넣어주는 것
 * 				-> 보에서는 데이터 입력하기 위해서 쓴느것
 * 		-> vo 클래스의 객체 하나가 테이블의 데이터 한 행이다
 * 		-> 게터 쓰는 이유는 => 쿼리문에서 웨얼절해서 보는것 처럼 
 * 			보에서는 데이터를 하나하나 꺼내서 볼때 쓴다
 * 
 * 

 * 
*/
