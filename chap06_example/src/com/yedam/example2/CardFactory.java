package com.yedam.example2;

public class CardFactory { //singleton

	//필드
	private static CardFactory instance = new CardFactory();//내가 만들어놓은 메서드를 통해서만 공유할 수 있도록 static
	
	//생성자
	private CardFactory() { //카드생성은 외부에서 만들지 않음, 따라서 private으로 막아야함.
		
	} 
	
	//메소드
	public static CardFactory getInstance() {
		return instance;
	}
	
	public Card creatCard() {
		return new Card("name"); //생성자를 호출한다는 것, 즉 같은 형태의 값을 가져야함(Card class참고)
	}
	
}
