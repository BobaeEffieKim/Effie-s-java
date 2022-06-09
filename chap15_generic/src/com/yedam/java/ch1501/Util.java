package com.yedam.java.ch1501;

public class Util {

	
	//리턴타입 앞에 <>로 제네릭타입쓰겠다고 선언 -> 그 다음 보통 매개변수안에 제네릭타입을 씀
	public static <T> BoxA<T> boxing(T t){
		BoxA<T> box = new BoxA<>();
		box.set(t);
		return box;
	}
	
	public static <K, V> boolean compare(Pair<K,V> p1, Pair<K,V> p2) {
		//equals -> 같은지 아닌지 확인
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		return keyCompare && valueCompare;
	}
	
	public static <K, V> V printInfo(K key) {
		V v = null;
		
		return v;
		
	}
	
}
