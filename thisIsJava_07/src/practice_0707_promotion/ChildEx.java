package practice_0707_promotion;

public class ChildEx {

	public static void main(String[] args) {

		Child child = new Child();
		
		Parent parent = child; //패런트 타입으로 차일드 대입-> 부모타입으로 자동변환

		parent.method1();
		//->child라는 객체가 만들어져서 대입이된것이기때문에
		//method1이 차일드에 있는지 먼저가서 보고 없으면 부모로가서 있는것을 호출해옴 
		
		parent.method2();
		//->우선적으로 차일드에 가본다. 패런트에 메서드2있더라도 차일드에 있어서 차일드것을 호출해서 가져온다
		
		//parent.method3();
		//일단 패런트 타입으로 사용하기때문에 패런트 클래스에 메소드3없어서 호출 불가
		
	}

}
