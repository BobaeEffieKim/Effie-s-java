package practice06_10_singleton;

public class SingletonEx {

	public static void main(String[] args) {

			//싱글톤객체를 얻을 수 있는 유일한 방법 -> 정적 메소드 호출해야하니 클래스이름인 singleton으로 접근
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if (obj1 == obj2) { // -> obj1과 obj2참조변수가 참조하는 객체가 동일한지 묻는것
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다.");
		}
	}

}
