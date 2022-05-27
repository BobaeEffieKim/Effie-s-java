package com.yedam.java.example2;

public class StudentRepo implements Access {
	//저장소는 싱글톤으로 만들어야 함
	private static StudentRepo instance = new StudentRepo(); //반드시 static이어야함 
	private StudentRepo() {         //외부에서 나를 사용할 수 없게 private으로 필드를 막아서 클래스명으로 메소드를 호출하는 것 밖에 없음 
		init();						//쉽게 생각하면 도서관의 책대여시스템 -> 책을 함게 사용할수있게 '대여만' 가능 (싱글톤의 개념과 같음)
	}
	
	public static StudentRepo getInstance() {
		return instance;
	}
	
	//실제 사용 필드 및 메소드
	private Student[] dataList;			//필드 선언
	private int listIndex;
	
	private void init() {				//필드 초기화
		dataList = new Student[100];
		listIndex = -1;
		
	}
	
	
	@Override
	public void insert(Student student) {
		dataList[++listIndex]= student;
	}

	@Override
	public void update(Student student) {
		for(int i=0; i<=listIndex; i++) {
			if(dataList[i].getId() == student.getId()) {
				dataList[i] = student;
			}
		}
	}

	@Override
	public void delete(int studentId) {
		for(int i=0; i<=listIndex; i++){
			if(dataList[i].getId() == studentId) {
				dataList[i] = null;
			}
		}
		cleanDataList();		//중간에 비어있는 공간을 없게하여 압축시키기 위함
	}
	private void cleanDataList() {
		
		//기존 데이터 -> 임시변수에 복사
		Student[] tempList = dataList;
		int tempIndex = listIndex;
		
		//기존 필드 초기화
		init();
		
		//임시변수에서 데이터만 기존 필드로 복사 ->복사해놓은 templist의 값이 비었는지 안비었는지 확인
		for(int i=0; i<=tempIndex; i++) {
			if(tempList[i] != null) {   //안비었다면 데이터리스트에 하나씩 다시 넣는다
				dataList[++listIndex] = tempList[i];
			}
		}
	}

	@Override
	public Student[] selectAll() {
		Student[] list = new Student[listIndex+1];
		for(int i=0; i<list.length; i++) {
			list[i] = dataList[i];
		}
		
		return list;
	}

	@Override
	public Student selectOne(int studentId) {
		Student selected = null;
		for(int i=0; i <= listIndex; i++) {
			if(dataList[i].getId() == studentId) {
				selected = dataList[i];
			}
		}
		
		return selected;
	}

}
