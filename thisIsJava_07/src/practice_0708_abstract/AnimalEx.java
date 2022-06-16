package practice_0708_abstract;

public class AnimalEx {

	public static void main(String[] args) {

		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		System.out.println("--------------------------");
		
		Animal animal = null;
		animal = new Dog();
		animal.sound();
			//자식객체Dog이 animal로 타입변환이 된다하더라도 
			//메소드가 재정의되면 그 메소드는 자식쪽메소드가 호출된다
		
		animal = new Cat();
		animal.sound();
		
		System.out.println("==========================");
		animalSound(new Dog());
		animalSound(new Cat());
	}

	//추가로 추상클래스의 추상메소드인 sound호출하도록 실습
	public static void animalSound(Animal animal) {
		animal.sound();
	}
		//매개변수가 클래스 타입일경우, 모든 자식객체든 다 올 수 있음
		//그럼 여기서 개와 고양이 중에 누구의 사운드가 올 것인가
		//넣어주는 객체에따라 다른 소리가 출력됨 -> 메인 끝쪽
	
}
