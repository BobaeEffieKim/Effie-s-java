package com.yedam.test.book;
/*
*	VO 클래스 -> 한 테이블의 정보를 담는 클래스
* - 객체 : vo클래스에서의 한 객체는 테이블의 데이터 한 행이다
* - 필드 : 이 테이블의 있는 모든 컬럼 -> 테이블의 컬럼명과 타입 참고하여 작성
* - setter : 테이블에 들어갈 데이터를 넣기위해 쓰는 것
* 			developer에서 쿼리문으로 insert into values와 같은 맥락
* 			데이터를 한 행씩 넣어주는 개념
* - getter : 쿼리문 where절로 조건을 주고 선택해서 보는 개념처럼
* 			vo클래스에서의 게터는 데이터를 하나하나 꺼내서 볼때 쓴다.
* - to string : 프로그램을 돌리기 위해서 계속 이 vo클래스를 이용하여 아래 객체들?을 생성할건데
* 				생성 시마다 메모리가 달라진다? 그냥 저 이름으로 출력문에 사용하면 메모리주소가 나온다
* 				그런데 우리가 보고싶은건 문자열이니, 그 주소들을 문자열값으로 바꿔 출력해줌
* 				오버라이딩-> 출력문에 저것들 사용할때마다 써주는 수고를 덜기위해서 사용 
*/
public class Book {

	private String bookName;
	private String bookWriter;
	private String bookContent;
	private int bookRental;
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookWriter() {
		return bookWriter;
	}
	public void setBookWriter(String bookWriter) {
		this.bookWriter = bookWriter;
	}
	public String getBookContent() {
		return bookContent;
	}
	public void setBookContent(String bookContent) {
		this.bookContent = bookContent;
	}
	public int getBookRental() {
		return bookRental;
	}
	public void setBookRental(int bookRental) {
		this.bookRental = bookRental;
	}
	
	@Override
	public String toString() {
		String str = "";
		if(bookRental == 0) {
			str = "대여가능";
		} else {
			str = "대여중";
		}
		
		
		return "책 제목 : " + bookName + ", 저자명 : " + bookWriter + ", 책 내용 : " + bookContent
				+ ", 대여 여부 : " + str ;
	
		
	
	}
	
	
	
	
}
