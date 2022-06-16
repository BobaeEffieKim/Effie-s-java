package practice_0704_overriding;

public class ComputerEx {

	public static void main(String[] args) {

		int r = 10;	//10이라는 값을 변수 r에 대입
		Calculator calculator = new Calculator();	//Calculator변수 선언하면서 객체 생성
		System.out.println("원면적 : "+calculator.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer();	//Computer객체 생성
		System.out.println("원면적 : "+computer.areaCircle(r));
		System.out.println();
		
		
	}

}
