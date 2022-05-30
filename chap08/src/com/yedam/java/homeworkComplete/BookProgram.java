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
