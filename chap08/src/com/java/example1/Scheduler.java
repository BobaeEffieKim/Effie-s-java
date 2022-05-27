package com.java.example1;

public interface Scheduler { //동일한 메소드를 호출하지만 값을 다르게 하는거니 인터페이스 사용
	
	//직원이 고객을 할당받는 방식
	public void getNextcall();
	//관리자가 직접 대기열을 관리
	public void sendCallToAgent();
	

}
