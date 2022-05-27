package com.yedam.java.example2;

public interface Access { //db에 접근할때 얘들을 통해서 접근하겠다는 말 

	//저장소에 대해 사용방법을 정의하는 인터페이스
	//등록
	public void insert(Student student);
	//수정
	public void update(Student student);
	//삭제
	public void delete(int studentId);
	//전체조회
	public Student[] selectAll();
	//단건조회
	public Student selectOne(int studentId);
}
