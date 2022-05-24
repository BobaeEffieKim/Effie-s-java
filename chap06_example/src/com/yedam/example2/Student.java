package com.yedam.example2;

public class Student {

	//필드 ->최고 3개가 되어야함 (우선 적정필드 1개 필요)
	private static int serialNum = 1000; //적정필드 , 누적되도록 둔다
	
	private int studentId;	//학번
	private String name;
	
	//생성자
	public Student(String name) {
		serialNum++;		//계속 누적되는 값이라서 ++
		this.studentId = serialNum; //시리얼 넘버를 일시적으로 복사
		this.name = name;
	}
	
	//메소드 
	public static int getSerialNum() { //-> 여기서는 생성자를 제외하고는 값을 넣을 필요가 없어서 setter가 필요없고 getter만
		return serialNum;
	} 
	
	public String getName() {
		return name;
	}
	
	public int getStudentId() {
		return studentId;
	}
	
}
