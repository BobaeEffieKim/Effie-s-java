package practice_0703_parent_constructor_call;

public class Student extends People{
//student에 처음에 컴파일 오류남 -> 암시적으로 부모클래스에 기본 생성자가 정의되지않아서 컴파일 할 수 없다
						  //-> 부모 클래스와 같은 생성자 써줘야함
	
//	public Student() {	//문자열값을 직접준것이 부모클래스의 생성자에 전달하여 초기화해줌
//		super("홍길동","123456-1234567");
//	}
//	
	//학생 클래스에서 추가적으로 선언한 필드
	public int studentNo;	//이것도 외부에서 값을 받아서 초기화해주고싶다면 
							//1. 생성자 매개값안에도 같은 형태를 지정해주고
							//2. 생성자 실행블록 내에도 써줘야함(단,부모생성자가 늘 첫줄!)
	
	//생성자에 부모생성자 호출
	public Student(String name, String ssn, int studentNo) {	
	//만약외부에서 값을 받아서 넣고싶다면 자식생성자 메개변수에서 외부에서 값을 받도록 지정해준다
		super(name, ssn); 
		this.studentNo = studentNo;
		System.out.println("자식 객체 생성 완료");
	}

	
	
	
}
