package com.yedam.example1;

public class Bus {

	//필드
		private String busNumber;
		private int money;
		private int passengerCount;
		private int pay;
		
		//생성자 -> 생성자는 항상 클래스와 이름이 같아야함
		public Bus(String busNumber, int pay) { //인스턴스가 생성될때 반드시 기초값이 필요하기때문에
			this.busNumber = busNumber;
			this.pay = pay;
		} 
		
		//메소드
		public int getPay() {//승객에게 요금을 고지하는 것. 
			return pay;		 //값을 반환
		}
		
		public void take(int money) { //승객에게 요금을 받는 것
			this.money += money;
			this.passengerCount++; //돈을 냈다는건 승객이 타서 승객수가 늘었다는거니까
		}
		
		public void showInfo() {
			System.out.println(busNumber + "의 승객은");
			System.out.println(passengerCount + "명이고, 수입은");
			System.out.println(money + "원입니다.");
		}
}
