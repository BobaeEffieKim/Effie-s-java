package com.yedam.java.ch1003;
//잔액부족 예외 클래스 만들기
//예외 클래스는 이름에 예외가 구체적으로 들어가게 해줘야함
//1.예외 클래스는 반드시 최상위 예외클래스 상속받아야함
//2.생성자 2개 만들기
public class BalanceInsufficientException extends Exception {

	public BalanceInsufficientException() {}
	public BalanceInsufficientException(String message) {
		super(message);	
	}
	
}
