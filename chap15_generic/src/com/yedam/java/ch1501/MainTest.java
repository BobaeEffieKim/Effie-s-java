package com.yedam.java.ch1501;

public class MainTest {

	public static void main(String[] args) {

		Bag bag = new Bag();
		
		bag.set(new Note());
		Note note = (Note)bag.get();
		
		bag.set("신운하");
		String name = (String)bag.get();
		
		//사용 전, 제네릭타입을 뭐로 대체해줄건지 정해서 쓰기, 그 변수는 결정된 타입만 담을 수 있음
		Box<Note, String, Integer> box = new Box<>();
		
		box.setT(new Note());
		box.setK(500);
		box.setV("홍길동");
		
		Note memo = box.getT();
		int num = box.getK();
		String str = box.getV();
		
		//다른 타입담고싶을때 새로운 변수로 선언하기
		Box<Car, Bus, Taxi> vehicle = new Box<>();
		vehicle.setT(new Car());
		vehicle.setK(new Taxi());
		vehicle.setV(new Bus());
		
		Car car = vehicle.getT();
		Bus bus = vehicle.getV();
		Taxi taxi = vehicle.getK();
	}

}


class Car{}
class Bus{}
class Taxi{}