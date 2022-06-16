package practice_0705_final_field;

public class 사람Ex {

	public static void main(String[] args) {

		사람 p1 = new 사람("123456-1234567","개복치");
		
		System.out.println(p1.nation);
		System.out.println(p1.name);
		System.out.println(p1.ssn);
		
		//수정
		//p1.nation = "USA";		->final이라 못바꿈
		//p1.ssn = "23456-234567";	->final이라 못바꿈
		p1.name = "자바";
	}

}
