package com.yedam.example1;

public class Student { //학생이 대중교통을 타는 상황을 코드로 구현 -> '학생'과 '대중교통'은 여기서 객체 / 그리고 여기서 필요한 데이터는 학생식별을 위한 '이름'과 '잔액'

	//필드
	private String name;
	private int money;
	
	//생성자 -> private이라도 생성자통해서 선언했기때문에 getter, setter 안받아도 됨.
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	//메서드
	public void take(Subway subway) { //->뭘 탈건지 매개변수로 받음. 내가 타는 대중교통에대한 정보를 가져와야함.
		int pay = subway.getPay(); //얼마가 필요한지 체크
		this.money -= pay;	 	   //그리고 거기서 내가 가진돈만큼 뺀다
		subway.take(pay);		   //지하철 타기 (그 마이너스 된 만큼 지하철에 지불)
	}
	
	public void take(Bus bus) {
		int pay = bus.getPay();
		this.money -= pay;
		bus.take(pay);
	}
	
	public void showInfo() {
		System.out.println(name + "님의 잔액은" + money + "입니다.");
	}
	
}
