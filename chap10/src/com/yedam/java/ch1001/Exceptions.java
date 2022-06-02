package com.yedam.java.ch1001;

public class Exceptions {

	public static void main(String[] args) {

		//실행예외 -> 문법적으로 문제가 없고 실제 실행 시 발생하는 예외
		
		//NullPointerException
		String data = null;	//null값을 가지는것 자체가 문제가 되진 않는다. null:실행하는 인스턴스가 없는 상태 ->실행하는 주체가 없다는 뜻
			if(data != null) {	//if를 사용한 예외처리 -> 다음 오류보려고 나중에 if로 막은 것
		System.out.println(data.toString()); //(10Line참고) 실행하는 인스턴스가 없는데 무언가 실행되도록 요구하는 것이 문제가 된다.
		}
		
		//ArrayIndexOutOfBoundsException
		if(args.length >= 2) {	//나중에 if로 막은 것
		String data1 = args[0];
		String data2 = args[1];
		
		System.out.println("args[0] : "+data1);
		System.out.println("args[1] : "+data2);
		}
		
		
		//NumberFormatException
		/*
		String data1 = "100";
		String data2 = "a100";	//a라는 문자값이 포함되어있어서 오류 발생, 오류메세지에서 어떤부분때문에 오류났는지 알려주는 예외유형
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		
		int result = value1 + value2;
		*/
		
		
		//ClassCastException
			//Cat이라는 클래스를 Dog로는 바꿀 수 없다는 오류 메세지 뜬다.
		changeDog(new Dog());
		changeDog(new Cat());
	}
	public static void changeDog(Animal animal) {
		if(animal instanceof Dog) {	//instanceof로 예외막음
		
		Dog dog = (Dog) animal;	//
		}
	}
}
//ClassCastException 실습 위한 상속관계 클래스 생성
class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}








