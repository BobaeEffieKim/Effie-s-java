package com.yedam.java.ch0702;

public class ChildTest2 {

	public static void main(String[] args) {

		Grandpa pa = new Father();
		pa.method(); //pa변수, .연산자
		
		//pa가 Father로 생성되었지만 Uncle 값으로 변경되지만 문법상으로오류가 안뜸
		//자바입장에서는 둘다 grandpa의 상속관계여서 문법적으로는 오류안뜨지만, 실제로 둘사이에 관계가 없어 실행에서 오류남
		//pa = new Uncle();
		
		
		
		
		System.out.println();
		if(pa instanceof Father) { //pa가 인스턴스인가요 내가 바꾸고자하는 Father에
		Father fa = (Father) pa; //father가 가진 고유 메소드 원할때 , 강제로 캐스팅괄호로 변환
		fa.method(); //본인거
		fa.method2();//Father거
		} else {
			System.out.println("pa 변수가 가지고 있는 인스턴스는 Father이 아닙니다.");
		}
		//결국 이 메소드를 실행하는 주체는 new연산자로 만든 Father하나뿐 , 메소드를 오버라이딩 했기때문에 무조건 자식메소드가 출력됨.
	}

}
