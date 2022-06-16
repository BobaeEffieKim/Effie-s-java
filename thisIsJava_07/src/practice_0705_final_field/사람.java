package practice_0705_final_field;
// final 필드 학습
public class 사람 {

	final String nation = "Korea";
	final String ssn;	// 필드 선언 시 값을 안주면 '생성자'에서 초기값 줄 수 있다
	String name;
	
	public 사람(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
