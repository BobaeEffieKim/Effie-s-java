package practice_0707_promotion;

public class PromotionEx {

	public static void main(String[] args) {

		//객체 생성
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		//대입	-> 다 A상속받은 객체라서 타입변환 가능
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		//각 상속 관계에 있어서 자동타입변환 가능
		B b1 = d;
		C c1 = e;
		
		//상속관계에 있지않아서 자동타입 불가
		//B b2 = e;
		//C c2 = d;
		
	}

}
