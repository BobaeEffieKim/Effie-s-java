package memory;

public class ArrayTest2 {

	public static void main(String[] args) {

		String[] arr = {"hello", "hi", "good"};
		
		//배열값을 모두 출력
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println("글자길이\n" + arr[i].length());
			System.out.println("인삿말\n" + arr[i]);
		}
		
		
		
	}

}
