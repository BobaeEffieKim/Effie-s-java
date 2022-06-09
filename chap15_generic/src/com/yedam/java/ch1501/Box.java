package com.yedam.java.ch1501;


//generic type=> 클래스나 인터페이스등을 정의할때 '타입'을 대체하는 것
//clas Bag<T>{ 클래스 이름 옆에 <대문자하나>만 넣는다 

//}

public class Box<T, V, K> {	//사용할 갯수만큼의 제네릭타입을 붙여준다.

	T t;
	V v;
	K k;
	
	public void setT(T t) {
		this.t = t;
	}
	
	public T getT() {
		return t;
	}
	
	public void setV(V v) {
		this.v = v;
	}
	
	public V getV() {
		return v;
	}
	
	public void setK(K k) {
		this.k = k;
	}
	
	public K getK() {
		return k;
	}
	
	
}
