package practice1112_wrapper;

public class AutoBoxingUnBoxingEx {

	public static void main(String[] args) {
		
		//자동 박싱
		Integer obj = 100;	//new Integer로하지않아도 자동 박싱됨
		System.out.println("value : "+obj.intValue());
		
		//대입 시 자동 언박싱
		int value = obj;
		//-> 사실 객체가 기본타입에 대입된다는 것은 원래 문법상ㄹ 말이 안됨
		//하지만, 이 객체가 인티저 객체라면. 인티저 객체에 박싱된 값이 자동으로 튀어나와 대입됨
		System.out.println("value : "+value);
		
		//연산 시 자동 언박싱
		int result = obj + 100;
		System.out.println("result : "+result);
	}
	
}
