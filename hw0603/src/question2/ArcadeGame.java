package question2;

public class ArcadeGame implements Keypad {

	// 필드
	int mode;

	// 생성자
	ArcadeGame() {
		mode = NORMAL_MODE;
		System.out.println("Arcade game 실행");
	}

	// 메서드 오버라이딩
	@Override
	public void leftUpButton() {
		System.out.println("캐릭터가 앞쪽으로 이동한다");
	}
	@Override
	public void leftDownButton() {
		System.out.println("캐릭터가 뒤쪽으로 이동한다");
	}
	@Override
	public void rightUpButton() {
		if (mode == 0) {
			System.out.println("캐릭터가 일반 공격.");
		} else {
			System.out.println("캐릭터가 연속 공격.");
		}
	}
	@Override
	public void rightDownButton() {
		if(mode == 0) {
			System.out.println("캐릭터가 HIT 공격.");
		} else {	
			System.out.println("캐릭터가 Double HIT 공격.");
		}
	}
	@Override
	public void changeMode() {
		//모드를 바꾸고 현재 모드를 출력하는 기능
		if(mode == 0) {
			mode = 1;
			System.out.println("Mode changes to HARD_MODE");
		} else {
			mode = 0;
			System.out.println("Mode changes to NORMAL_MODE");
		}
			
	}

//	
//	 public abstract void leftUpButton(); // "캐릭터가 앞쪽으로 이동한다"를 출력한다.
//	 public abstract void leftDownButton(); //"캐릭터가 뒤쪽으로 이동한다"를 출력한다.
//	 public abstract void rightUpButton();
//		//- NORMAL_MODE 일경우 : "캐릭터가 일반 공격"를 출력한다.
//		//- HARD_MODE 일경우 : "캐릭터가 연속 공격"를 출력한다.
//	 public abstract void rightDownButton();
//		//NORMAL_MODE 일경우 : "캐릭터가 HIT 공격."를 출력한다.
//		//HARD_MODE 일경우 : "캐릭터가 Double HIT 공격."를 출력한다.
//	 public abstract void changeMode(); // 모드를 바꾸고 현재 모드를 출력하는 기능

}