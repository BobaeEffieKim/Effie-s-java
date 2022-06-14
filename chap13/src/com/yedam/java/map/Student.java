package com.yedam.java.map;

public class Student {

	public int sno;
	public String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return sno + name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {	//내부의 모든 값이 같은지 봄
		if(obj instanceof Student) {	//obj가 Student타입인지 확인
			Student s = (Student)obj;	//강제 타입 변환
			return name.equals(s.name) && (sno == s.sno);
		}
		return false;
	}
}
