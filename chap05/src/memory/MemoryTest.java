package memory;

public class MemoryTest {

	public static void main(String[] args) {

		int a = 10; //모든 변수는 스택에 선언됨
		int b = 20;
		
		
		test1(a, b);
		
		System.out.println(a + ":" + b);
	
		
		int[] sc = new int[2]; //new로 만들면 힙에 저장되어서 사라지지않음/ 힙에 int값 두개를 저장할 수 있는 공간을 확보
		sc[0] = 100;
		sc[1] = 110;
		
		
		test2(sc);
		System.out.println(sc[0] + ":" + sc[1]);
		
	}
	
	public static void test2(int[] sc) {
		sc[0] = sc[0] + 100;
		sc[1] = sc[1] + 100;
		
	}
	
	public static void test1(int a, int b) {
		a = a + 10;
		b = b + 10;
		
		System.out.println(a + ":" + b);
		
	}
	
	
}
