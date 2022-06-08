package com.yedam.java.question;

public abstract class Member {

	static final int GRADE_STANDARD=1000000; //등급의 기준 상수필드
	int record;
	String grade;
	
	
	Member(int record){
		this.record = record;
	
	}
	
	void showMemberInfo() {
	System.out.println("현재 실적은"+record+
			"원이며, 회원등급은 "+ grade +"등급입니다.");}
	
	public static Member getMemebrship(int record) {
		Member member = null;
		
		if(record > Member.GRADE_STANDARD ) {
			member = new Gold(record);
		} else {
			member = new Silver(record);
		}
		
		return member;
		
	}	//멤버를 기반으로 생성되는 클래스 두개
}
