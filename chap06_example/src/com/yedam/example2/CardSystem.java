package com.yedam.example2;

public class CardSystem {

	public static void main(String[] args) {
		
		CardFactory factory = CardFactory.getInstance();
		
		Card first = factory.createCard();
		Card second = factory.createCard();
		Card third = factory.createCard();
		
		System.out.println("first :"+first.getCardNo());
		System.out.println("second :"+second.getCardNo());
		System.out.println("third :"+third.getCardNo());
		
		

		Card Shinhan = new Card("신한카드");
		System.out.println(Card.getSerialNum());
		System.out.println(Shinhan.getName()+"의 카드번호 :"+Shinhan.getCardNo());
		
		Card Kb = new Card("국민카드");
		System.out.println(Card.getSerialNum());
		System.out.println(Kb.getName()+"의 카드번호 :"+Kb.getCardNo());
		
		Card Kakao = new Card("카카오카드");
		System.out.println(Card.getSerialNum());
		System.out.println(Kakao.getName()+"의 카드번호 :"+Kakao.getCardNo());
		
	}

}
