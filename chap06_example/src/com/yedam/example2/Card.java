package com.yedam.example2;

public class Card { //카드가 인스턴스가 생길때마다 자동으로 번호가 부여되도록

	//필드
	private static int serialNum = 1100; //기준이되는 시리얼넘버
	private int cardNo;
	private String name;
	
	//생성자
	
	public Card(String name) {
		serialNum++;
		this.cardNo = serialNum;
		this.name = name;
	}
	
	//메소드
	public static int getSerialNum() {
		return serialNum;
	}
	public String getName() {
		return name;
	}
	public int getCardNo() {
		return cardNo;
	}
	
}
