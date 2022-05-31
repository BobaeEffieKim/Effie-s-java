	//0527숙제
//도서 정보를 입력받고 출력하고 분석하는 프로그램 만들기
//도서 정보 : ISBN, 책제목, 가격
//ISBN이 부여되는 형태로 구현 , 우리가 입력할 것은 이름과 가격 뿐 -> 이제껏 우리가 했던것처럼 id를 입력하는게 아니라, ISBN은 자동부여 되도록
//분석 => 1.가장 비싼 책정보 , 2.가장 싼 책정보 , 3. 최고가와 최저가를 제외한 책 정보를 출력하고 평균 산출


package com.yedam.java.homeworkComplete;
// VO, DTO 클래스 -> 정보를 저장하고 출력하는 역할만 함 . 필드, getter, setter만 가진다. 
//(참고) dao 클래스 -> db에 대응되는 클래스

public class Book {
//책정보 가져야하는 클래스

	//필드
	private int isbn;
	private static int serial=1000; //(수정)'isbn을 위한 시리얼 넘버는 공유하는 것 =>정적인것' 
	private String name;
	private int price;
	
	//생성자 -> Book클래스에 대해서 인스턴스 만들기
	public Book() {}
	
	public Book( String name, int price) {
		this.isbn = ++serial;	//serial은 isbn인스턴스가 생성될때마다 자동으로 추가되도록 할거기때문에 외부에서 받는 값은 필요 없음
		//아래 두줄처럼도 가능
		//++serial;
		//this.isbn = serial;
		this.name = name;
		this.price = price;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void showInfo( ) { //정보를 출력하는 형태 
		System.out.println("ISBN :"+this.isbn+", 도서명 :"+this.name+", 가격 :"+this.price);
	}
	
	
}
