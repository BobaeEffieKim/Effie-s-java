package practice_0708_abstract;

public class SmartPhone extends Phone{

	public SmartPhone(String owner) {
		super(owner);	//smartphone객체 생성하면 내부적으로phone도 생성됨
	}

	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
	
	
}
