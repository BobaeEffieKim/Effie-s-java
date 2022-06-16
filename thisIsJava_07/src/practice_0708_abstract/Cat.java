package practice_0708_abstract;

public class Cat extends Animal{	
	//추상클래스에 추상메소드있으면 반드시 자식클래스에서 재정의 해줘야함

	
	public Cat() {
		this.kind = "포유류";
	}
	
	
	
	@Override
	public void sound() {
		System.out.println("야옹");
		
	}

}
