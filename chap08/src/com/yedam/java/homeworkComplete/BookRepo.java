package com.yedam.java.homeworkComplete;
//BookAccess를 구현하는 클래스 -> 실제 저장소 역할
public class BookRepo implements BookAccess {

//DAO 클래스 -> 실제 db에 연결할 정보 , 기능에 대한 정보 	
	
	//저장소 싱글톤 -> 생성자를 private으로 만들고, BookRepo instance 부분을 모든 사람이 접속할 수 있는 형태인 static으로 만든다는 것
	private static BookRepo instance = new BookRepo();
	private BookRepo() {
		init();
	}
	
	public static BookRepo getInstance() { //인스턴스를 반환하는 형태
		return instance;
	}
	
	//실제 사용할 필드 및 메소드 
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
			if(dataList[i].getIsbn() == book.getIsbn()) { //dateList i번째에서 넘겨온 isbn이 같으면 그 위치의 데이터를 교체한다.
				dataList[i] = book;
			}
		}
	}

	@Override
	public void delete(int bookIsbn) {
		for(int i=0; i<=listIndex; i++) {
			if(dataList[i].getIsbn() == bookIsbn) {
				dataList[i] = null;	//같다면 데이터를 삭제하기위해 null을 넣음
			}
		}
		//메서드를 분리시켜서 기능을 나누는 것
		cleanDataList();//null값으면 중간중간 비어있으니 듬성듬성 비어있는 데이터를 제거해주는 작업이 필요, 그렇지않으면 insert때 복잡해짐
	}
	
	//dataList 배열 정리하는 것
	private void cleanDataList() {
		//기존 dataList와 listIndex가 가지고 있는 값을 임시변수에 복사
			//기존 필드 -> 임시변수로 값 복사 
		Book[] tempList = dataList; //복사한 변수의 이름 tempList
		int tempIndex = listIndex;
		
		//기존 필드 초기화
		init(); //초기화 메소드
		
		//tempList의 값을 확인하여 값이 있는 곳에 한해서, 값이 있으면 새로운 index 번호를 매겨서 넣어준다.
			//임시변수 -> 기존필드로 값을 옮김
		for(int i=0; i<=tempIndex; i++) {
			if(tempList[i] !=null) {	//tempList에서 빈값이 아니라면 카운트하여 i번째의 값에 번호를 카운트하여 dataList에 넣어준다.
				dataList[++listIndex] = tempList[i];
			}
		}
	}
	
	@Override
	public Book[] selectAll() {
		Book[] list = new Book[listIndex+1]; //임시로 값을 넘겨받은 list정함 <-listIndex가 가지는값+1 /index는0부터 시작하기때문에, 값은 1부터지만 인덱스길이(크기)는 0부터 시작이라 개수 1개 차이 남
		for(int i=0; i<list.length; i++) {
			list[i] = dataList[i];	//dataList는 delete했다하더라도 위의 cleanDate로 정리되어 비어있지않은 꽉찬 데이터이기때문에 index가 같아도 됨
		}
		return list;
	}

//	교수님 풀이	
//	@Override
//	public Book[] selectAll() {
//		for(int i=0; i<=listIndex; i++) {
//			dataList[i].showInfo();
//		}
//	}
//	
	
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

//교수님 풀이	
//	@Override
//	public void selectOne(int isbn) {
//	Book book = null;//내가 원하는 데이터를 찾으면 복사하는 것
//	int index = 0;
//	for(int i=0; i<=listIndex; i++) {
//		if(dataList[i].getIsbn() == isbn) {
//			book = dataList[i];
//			break;
//		}
//	}
//		return book;
}
