package question2;
//RPGgame 구현하는 클래스



public class RPGgame implements Keypad{

	

	//필드
	int mode;
	
	//생성자
	RPGgame(){
		mode = NORMAL_MODE;
		System.out.println("RPG game 실행");
	}
	
	//메서드 오버라이딩
	@Override
	public void leftUpButton() {
		// "캐릭터가 위쪽으로 이동한다"를 출력한다.
		System.out.println("캐릭터가 위쪽으로 이동한다");
	}
	@Override
	public void leftDownButton() {
		// "캐릭터가 아래쪽으로 이동한다"를 출력한다.
		System.out.println("캐릭터가 아래쪽으로 이동한다");
	}
	@Override
	public void rightUpButton() {
		//- NORMAL_MODE 일경우 : "캐릭터가 일반 공격"를 출력한다.
		if(mode == 0) {
			System.out.println("캐릭터가 한칸 단위로 점프한다.");
		} else {
		//- HARD_MODE 일경우 : "캐릭터가 연속 공격"를 출력한다.
			System.out.println("캐릭터가 두칸 단위로 점프한다.");
		}
	}	
	@Override
	public void rightDownButton() {
		//- NORMAL_MODE 일경우 : "캐릭터가 HIT 공격."를 출력한다.
		if(mode == 0) {	//
			System.out.println("캐릭터가 HIT 공격.");
		} else {	
		//- HARD_MODE 일경우 : "캐릭터가 Double HIT 공격."를 출력한다.
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
}
