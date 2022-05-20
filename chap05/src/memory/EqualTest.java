package memory;

public class EqualTest {

	public static void main(String[] args) {

		int[] a = new int[5];  //배열은 모든 값이 0으로 초기화 (힙의 특성)
		int[] b = a;  //a가 참조하는 값을 b에도 참조해라 -> a와 b는 같은 객체를 참조하고 있음. 따라서 a[0]=b[0]으로 나올것이다. 
					  //같은 객체를 참조하는 얕은 복사 , 즉 주소만 복사하는 것 
		int[] c = new int[a.length]; //a배열의 길이만큼 
		System.arraycopy(a,0,c,0,a.length); //별개의 객체가 만들어지는 깊은복사 
		
		b[0] = 100;
		
		System.out.println(a[0]);
		
		System.out.println(a == b); //정말 같은지 객체 비교
		
		
		//스트링
		String s1 = new String("hello"); 
		String s2 = new String("hello"); //각각 new를 달아줘서 힙에 객체가 각각 참조하므로 다른 주소임. 결국 같은 값이 아님.
		System.out.println(s1 == s2); //참조객체 주소를 비교하는 것
		System.out.println(s1.equals(s2)); // 안의 값을 비교하는 것 
		
		String s3 = "h1"; 
		String s4 = "h1"; // 그냥 String이면 힙은 안만들지만 문자열 상수를 어느 공간에 저장한다. 같은 문자열을 참조하므로 값은 같다.
		System.out.println(s3 == s4);
		
		
		s1 = null; //null은 아무것도 참조하지 않는다 라는 의미 -> null을 쓰면 참조를 끊어버림
		s2 = null;
		
	}

}
