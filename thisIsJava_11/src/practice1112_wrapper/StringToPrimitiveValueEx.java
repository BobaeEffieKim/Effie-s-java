package practice1112_wrapper;
//문자열을 기본 타입으로 변환
public class StringToPrimitiveValueEx {

	public static void main(String[] args) {

		int value1 = Integer.parseInt("10");	//문자열 10이 정수화되어서 변수에 대입	됨
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("vale1 : "+value1);
		System.out.println("vale2 : "+value2);
		System.out.println("vale3 : "+value3);
	}

}
