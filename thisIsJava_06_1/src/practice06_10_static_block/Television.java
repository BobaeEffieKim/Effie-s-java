package practice06_10_static_block;

public class Television {

	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	static int from1To10Sum; //이 경우에 식이 길어지므로 식을 스태틱블럭static{}안에 작성한다
	
	//!!!!정적필드의 복잡한 식은 정적블록내에서 해줘야한다!!!!
	static {
		info = company + "-" + model;
		
		//from1To10Sum 식 작성
		int sum =0;
		for(int i=1; i<=10; i++) {
			sum +=i;
		}
		from1To10Sum = sum;
	}
	
	//Television클래스가 메모리로 로딩되는 순간 static{}이 자동으로 실행되므로 info에 값이 들어감
}
