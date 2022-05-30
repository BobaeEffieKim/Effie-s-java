package com.yedam.java.homeworkComplete;
//Book 저장소의 사용방법을 정의하는 인터페이스
public interface BookAccess {

	//등록
	public void insert(Book book);
	//수정
	public void update(Book book);
	//삭제
	public void delete(int bookIsbn);
	//전체조회
	public Book[] selectAll();
	//단건조회
	public Book selectOne(int bookIsbn);
}
