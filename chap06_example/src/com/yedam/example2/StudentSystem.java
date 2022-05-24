package com.yedam.example2;

public class StudentSystem {

	public static void main(String[] args) {

		Student Gong = new Student("공유");
		System.out.println(Student.getSerialNum());
		System.out.println(Gong.getName() + "의 학번 :"+Gong.getStudentId());

		Student Gang = new Student("강동원");
		System.out.println(Student.getSerialNum());
		System.out.println(Gang.getName() + "의 학번 :" + Gang.getStudentId());
	}

}
