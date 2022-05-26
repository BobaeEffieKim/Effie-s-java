package com.yedam.java.ch0702;

public class ChildTest {

	public static void main(String[] args) {

		//인스턴스 생성
		Father father = new Father();
		Uncle uncle = new Uncle();
		Child child = new Child();
		Cousin cousin = new Cousin();
		
		Grandpa pa = father;
		pa.method();
		pa = uncle;
		pa.method();
		pa = child;
		pa.method();
		pa = cousin;
		pa.method();
		pa = father;
		
		//타입변환
		Father fa = child; //uncle과 cousin은 타입변환이 일어나지 않음 ->father는 uncle을 담아줄 수 없음
		//fa = uncle;
		//fa = cousin;
		fa.method(); //fa에 담겨있는게 child이다보니 child가 가지고있는 메소드를 실행한다.
		
		
		//현재 fa에 담겨있는것이 child. 값을 변경하고싶을때 캐스팅괄호를 이용하여 값 변경 가능
		Child ch = (Child)fa;
		//Cousin co = (Cousin)fa; //강제 타입변환 불가능 -> 관계가 있는것 내부에서만 타입변환가능
		
		System.out.println();
		Uncle un = cousin; //위와 같은 맥락으로 father와 child는 오류가 남 
		//un = father;
		//un = child;
		un.method();
		
	}

}
