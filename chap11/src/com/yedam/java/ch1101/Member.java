package com.yedam.java.ch1101;

public class Member {

	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		//논리적으로 동등한지
		
		//1.동일한 타입인지 확인
		if(obj instanceof Member) {
			//2.내부필드값이 같은지 확인
			Member member = (Member) obj; //같을 경우에만 타입변환 시킴
			if(id.equals(member.id)) {	  //필드 아이디 비교
				return true;			  //두개 다 일치한다면 true, 하나라도 일치하지않는다면 false
			}
		}
		return false;
		
	}
	
	
}
