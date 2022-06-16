package practice_0708_abstract;
//추상메소드가진 클래스
public abstract class Animal {

	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound(); 
		//동물마다 소리가 있긴있는데 아직 무슨 내용을 해야할지 모를때 추상메소드로 전환
}
