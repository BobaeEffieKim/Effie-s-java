	//0527숙제
//도서 정보를 입력받고 출력하고 분석하는 프로그램 만들기
//도서 정보 : ISBN, 책제목, 가격
//ISBN이 부여되는 형태로 구현 , 우리가 입력할 것은 이름과 가격 뿐 -> 이제껏 우리가 했던것처럼 id를 입력하는게 아니라, ISBN은 자동부여 되도록
//분석 => 1.가장 비싼 책정보 , 2.가장 싼 책정보 , 3. 최고가와 최저가를 제외한 책 정보를 출력하고 평균 산출

package com.yedam.java.homeworkComplete;
//책정보 가져야하는 클래스
public class Book {

	//필드
	private int isbn;
	private static int serial=1000;
	private String name;
	private int price;
	
	//생성자
	public Book() {}
	
	public Book( String name, int price) {
		this.isbn = ++serial;
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
	
	public void showInfo( ) {
		System.out.println("ISBN :"+isbn+", 도서명 :"+name+", 가격 :"+price);
	}
	
	
}
