package com.yedam.java.homeworkComplete;
//BookAccess를 구현하는 클래스 -> 실제 저장소 역할
public class BookRepo implements BookAccess {

	//저장소 싱글톤
	private static BookRepo instance = new BookRepo();
	private BookRepo() {
		init();
	}
	
	public static BookRepo getInstance() {
		return instance;
	}
	
	//필드 선언
	private Book[] dataList;
	private int listIndex;
	//필드 초기화
	private void init() {
		dataList = new Book[100];
		listIndex = -1;
	}
	
	
	@Override
	public void insert(Book book) {
		dataList[++listIndex] = book;
	}

	@Override
	public void update(Book book) {
		for(int i=0; i<=listIndex; i++) {
			if(dataList[i].getIsbn() == book.getIsbn()) {
				dataList[i] = book;
			}
		}
	}

	@Override
	public void delete(int bookIsbn) {
		for(int i=0; i<=listIndex; i++) {
			if(dataList[i].getIsbn() == bookIsbn) {
				dataList[i] = null;
			}
		}
		cleanDataList();
	}

	private void cleanDataList() {
		//기존 데이터 임시변수에 복사
		Book[] tempList = dataList;
		int tempIndex = listIndex;
		
		//기존 필드 초기화
		init();
		
		//임시변수에서 데이터만 기존 필드로 복사하여, 복사해놓은 tempList값 비었는지 확인
		for(int i=0; i<=tempIndex; i++) {
			if(tempList[i] !=null) {
				dataList[++listIndex] = tempList[i];
			}
		}
	}
	
	@Override
	public Book[] selectAll() {
		Book[] list = new Book[listIndex+1];
		for(int i=0; i<list.length; i++) {
			list[i] = dataList[i];
		}
		return list;
	}

	@Override
	public Book selectOne(int bookIsbn) {
		Book selected = null;
		for(int i=0; i<=listIndex; i++) {
			if(dataList[i].getIsbn() == bookIsbn) {
				selected = dataList[i];
			}
		}
		return selected;
	}

}
