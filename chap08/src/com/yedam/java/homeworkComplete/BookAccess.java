package com.yedam.java.homeworkComplete;
//Book 저장소의 사용방법을 정의하는 인터페이스
public interface BookAccess {

//db를 연결했을 때 사용하는 메소드들
	//등록
	public void insert(Book book);
	//수정
	public void update(Book book);
	//삭제
	public void delete(int bookIsbn);
	//전체조회
	public Book[] selectAll();			//전체조회나 단건 조회는 반드시 데이터반환이 필요함
	//단건조회
	public Book selectOne(int bookIsbn);
}


//교수님과 풀이
//public interface BookAccess {
//
//	//db를 연결했을 때 사용하는 메소드들
//		//등록
//		void insert(Book book);
//		//수정
//		void update(Book book);
//		//삭제
//		void delete(int bookIsbn);
//		//전체조회
//		Book[] selectAll();
//		//단건조회
//		Book selectOne(int bookIsbn);
//	}