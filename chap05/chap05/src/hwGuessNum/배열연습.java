package hwGuessNum;

public class 배열연습 {

	public static void main(String[] args) {

		int scores[] = {200,100,150,65,78};
		System.out.println("점수는=" + scores[0]);
		System.out.println("점수는=" + scores[1]);
		System.out.println("점수는=" + scores[2]);
		System.out.println("점수는=" + scores[3]);
		System.out.println("점수는=" + scores[4]);
		
		int sum=0;
			for(int i=0; i<scores.length;i++) {
				sum += scores[i];
				
			}
			System.out.println("합계는=" +  sum);
			double avg=0.0;
			System.out.println("평균은=" + sum/scores.length);
			
		
		
	}

}
