package chap01;

public class Hello {

	public static void main(String[] args) {
		//영어로 인사
		greetEn();
		
		//한글로 인사
		greet();
		
		//자기이름
		info();
	}

	public static void greet() {
		System.out.println("안녕");
	}
	public static void info() {
		System.out.println("김보배");
	}
	
	public static void greetEn() {
		System.out.println("Hello");
	}
}
