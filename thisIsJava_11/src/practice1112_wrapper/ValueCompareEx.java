package practice1112_wrapper;
//포장값 비교
public class ValueCompareEx {


	public static void main(String[] args) {

		System.out.println("[-128~127 초과값일 경우]");
		Integer obj1 = 300;	//자동박싱
		Integer obj2 = 300;
		//1.
		System.out.println("==결과 : "+(obj1 == obj2));
		//두 객체의 ==연산은 기본적으로 번지 비교이다!
			//이 방법은 어떨때는 번지를 비교하고 어떨때는 값을 비교해서 결과가 일정치않다
		
		//2.
		//그러니 ==연산자만으로 비교는 좋은 방법이 아니다-> 언박싱후 비교하기가 적절함
		System.out.println("언박싱 후==결과 : "+(obj1.intValue() == obj2.intValue()));
		
		//3.equls사용
		System.out.println("equls() 결과 : "+ (obj1.equals(obj2)));
			//obj1내부의값과 obj2내부의값 비교
		

		System.out.println("[-128~127 범위값일 경우]");
		Integer obj3 = 10;	//자동박싱
		Integer obj4 = 10;
		
		System.out.println("==결과 : "+(obj3 == obj4));
		//결과는 true -> 범위내에 해당되는 인티저 객체는 하나만 생성되어 공유된다
		
		System.out.println("언박싱 후==결과 : "+(obj3.intValue() == obj4.intValue()));
	
		System.out.println("equls() 결과 : "+ (obj3.equals(obj4)));
	
	}

}
