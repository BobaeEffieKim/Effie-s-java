package com.yedam.java.ch1003;
//실제로 예외 어떻게 사용되는지
//new연산자앞에 throw를 사용하면 예외클래스인걸 인지함
//메소드시그니처에도 throws 적용
	//내부적으로 try-catch로 예외처리하는 것 없이, 
//예외를 강제적으로 발생시키는것은 문법적 문제가 있어서라기보다 논리적으로 봤을때 외부에서 메소드를 호출하는곳에 예외를 처리할수있다고 보고 throws를 연결시킴
public class Account {

	private long balance;
	
	//입금
	public long getBalance() {
		return balance;
	}
	
	//조회
	public void deposit(int money) {
		balance += money;
	}
	
	//출금
	public void withDraw(int money) throws BalanceInsufficientException{
		if(balance < money){ //money가 요청한 금액보다 작을때 예외를 일으키려한다(예외클래스를 생성시킨다)
			throw new BalanceInsufficientException("잔고부족 : "+(money-balance)+"원이 모자랍니다.");
		}	
		balance -= money;
	}
	
}
