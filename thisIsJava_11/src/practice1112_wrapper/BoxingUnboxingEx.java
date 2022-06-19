package practice1112_wrapper;

public class BoxingUnboxingEx {

	public static void main(String[] args) {

		//Boxing
			//생성자를 이용한 박싱
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("100");
			//valueOf 이용한 박싱
		Integer obj3 = Integer.valueOf(100);
		Integer obj4 = Integer.valueOf("100");
		
		
		//Unboxing
		int value1 = obj1.intValue(); //100이라는 값이 언박싱되어서 변수에 대입
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		int value4 = obj4.intValue();
		
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		
	}

}
