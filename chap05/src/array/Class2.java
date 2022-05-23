package array;

public class Class2 {

	public static void main(String[] args) {

		int[] intAry = new int[2]; //일차원배열
		for(int i=0; i<intAry.length; i++) { //배열은 for문을 통해 값에 접근
			System.out.println("intAry[" + i + "]:" + intAry[i]);
		}
		
		System.out.println();
		
		int[][] intAry2 = new int[3][2]; //앞:int값을가진 배열의 배열 몇개 가지느냐 , 뒤: (1차원배열로 몇개값을 가지는 배열이냐)그럼 그 int배열은 몇개의 값을 가지느냐
		// int[2]인 배열이 총 3개 존재하는 2차원 배열 -> 2차원배열은 반드시 2중으로for문 사용해야 값에 접근가능
		for(int i=0; i<intAry2.length; i++) {
			int[] tempAry = intAry2[i];
			for(int j=0; j<tempAry.length; j++) { //1차원배열에 대한 for문
				System.out.println("tempAry[" + j +"]:" + tempAry);
			}
		}
		
		
		//2차원배열 2중 for문 합친것 -> 1차원,2차원 배열 크기가 동일할때
		for(int i=0; i<intAry2.length; i++) { 
			for(int j=0; j<intAry2[i].length; j++) {
				System.out.println("intAry2["+i+"]["+j+"]:"+intAry2[i][j]);
			}
		}
		
		//크기가 다를때
		System.out.println();
		int[][] intAry3 = new int[2][];
		intAry3[0]=new int[3]; //첫번째행에 배열을 3개 만들어라
		intAry3[1]=new int[5];
		
		for(int i=0; i<intAry3.length;i++) {
			for(int j=0;j<intAry3[i].length;j++) {
				System.out.println("intAry3["+i+"]["+j+"]:"+intAry3[i][j]);
			}
		}
		
		System.out.println();
		int[][] javaScores = {{95,80},     //{}->행, {안 값의 갯수}->열
				              {92,96,80}}; //엑셀표(2*3) 처럼 생각하면 도움이 될 수 있음 
		//첫번째[]->행의갯수 , 두번째[]->열의갯수
		
		
		
		for(int i=0; i<javaScores.length; i++) {
			for(int j=0; j<javaScores[i].length; j++) { //i번째에 접근했을때 걔가 가진 길이를 땡겨오는것
				
			
			System.out.println("javaScores["+i+"]["+j+"]:"+javaScores[i][j]); //i번째 에서 그중에서도 j번째인 값을 출력
																			  //i번째 방을 찾아간다 그 중에서도 j번째 서랍에 있는 값을 찾는다
			}
		}
		
		
		//향상된 for문 -> i를 이용하지 않음, 그 배열의 처음부터끝까지 하나하나 끄집어 내는것 ->단순히 순서대로 출력할때는 용이
		for(int[] tempAry : javaScores) { 
			for(int temp : tempAry) {
				System.out.println(temp);
			}
		}
		
		
		
	}

}
