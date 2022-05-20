package control;

public class ForTest1 {

	public static void main(String[] args) {

		
		test1();
		
		
	}

	public static void test1() {
		//10번 실행
		
		for(int i=0 ; i<10 ; i++) { //별프린트가 반복되는 라인수
			
			
			for(int j=0 ; j<i*2 ; j++) { //별 개수/ 10번실행하는 것을 10번 실행
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
	}
	
	
	
	
}
