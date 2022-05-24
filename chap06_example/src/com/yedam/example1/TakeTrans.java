package com.yedam.example1;

public class TakeTrans {

	public static void main(String[] args) {
		Student Kim = new Student("Kim",5000); //최초의 값을 가지는 두 객체를 만ㄴ들었음
		Subway green = new Subway("지하철 2호선",1500);
		
		 
		Bus bus = new Bus("급행2번",1250);
		
		
		Kim.take(green); //Kim이라는 를 이용해서 지하철을 탄다.
		Kim.take(bus);
		
		Kim.showInfo();
		green.showInfo();
		
		bus.showInfo();
	}

}
