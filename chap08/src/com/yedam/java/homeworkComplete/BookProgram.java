package com.yedam.java.homeworkComplete;

//ex2 Program 클래스를 다시 만든다고 생각하고 만들기
//무엇을 호출하면 되는지

public interface BookProgram {

	//메뉴출력
	public void menuPrint();
	//정보입력
	public void inputInfo(BookAccess access);
	//전체정보 조회
	public void printAllInfo(BookAccess access);
	//특정정보 검색
	public void printInfo(BookAccess access);
	//분석
	public void printRepot(BookAccess access);
}


////교수님 풀이
//public interface BookProgram{
//	//메뉴 출력
//	void menuPrint();
//	//정보 입력
//	void inputInfo();
//	//입력된 전체정보를 출력
//	void printAllInfo();
//	//특정 조건의 정보를 출력
//	void printInfo();
//	//분석
//	void printRepo();
//	
//}