package question1;
//상속과 구현 관련 클래스
public class Question {
/*
	Question 1]
			1) Human 클래스를 정의한다.
				- 이름과 키, 몸무게를 필드로 가지며 생성자를 이용하여 값을 초기화한다.
				- 메소드는 다음과 같이 정의한다.
				(1) public void getInformation() : 이름, 키와 몸무게를 출력하는 기능
				
			2) StandardWeightInfo 클래스를 정의한다.
				- Human 클래스를 상속한다.
				- 메소드는 다음과 같이 정의한다.
				(1) public void getInformation() : 이름, 키, 몸무게와 표준체중을 출력하는 기능
				(2) public double getStandardWeight() : 표준체중을 구하는 기능
				( * 표준 체중 : (Height - 100) * 0.9 )
			
			3) ObesityInfo 클래스를 정의한다.
				- StandardWeightInfo 클래스를 상속한다.
				- 메소드는 다음과 같이 정의한다.
				(1) public void getInformation() : 이름, 키, 몸무게와 비만도를 출력하는 기능
				(2) public double getObesity() : 비만도를 구하는 기능
				( * 비만도 : (Weight - 표준 체중)/표준체중 * 100 )
				
			4) 아래와 같은 출력결과가 나오도록 실행코드를 구현하다.
			- 출력결과
				홍길동님의 신장 168, 몸무게 45, 표준체중 61.2 입니다.
				박둘이님의 신장 168, 몸무게 90, 비만입니다.
			- 조건
				변수는 Human 클래스 타입으로 선언하여 하나만 사용한다.

		Question 2]
			1) Keypad 인터페이스를 정의한다.
			- 다음과 같이 상수 필드를 정의한다.
			(1) public static final int NORMAL_MODE = 0;
			(2) public static final int HARD_MODE = 1;
			- 다음과 같이 추상 메서드를 정의한다.
			(1) public abstract void leftUpButton() : 왼쪽에서 위쪽 버튼을 눌렀을 때 동작하는 기능
			(2) public abstract void leftDownButton() : 왼쪽에서 아래쪽 버튼을 눌렀을 때 동작하는 기능
			(3) public abstract void rightUpButton() : 오른쪽에서 위쪽 버튼을 눌렀을 때 동작하는 기능
			(4) public abstract void rightDownButton() : 오른쪽에서 아래쪽 버튼을 눌렀을 때 동작하는 기능
			(5) public abstract void changeMode() : 모드를 바꾸고 현재 모드를 출력하는 기능 ( 예를 들어, NORMAL_MODE -> HARD_MODE / HARD_MODE -> NORMAL_MODE)
			
			2) RPGgame 클래스를 정의한다.
			- Keypad를 구현하는 클래스.
			- 현재 모드를 값으로 가지는 필드를 가지며 생성자를 이용하여 값을 초기화한후 "RPGgmae 실행"을 출력한다.
			  ( 단, 매개변수를 이용하지 않으며 최초의 값은 NORMAL_MODE 이다. )
			- Keypad 인터페이스에 정의된 추상 메서드를 다음과 같이 오버라이딩한다.
			(1) public abstract void leftUpButton() : "캐릭터가 위쪽으로 이동한다"를 출력한다.
			(2) public abstract void leftDownButton() : "캐릭터가 아래쪽으로 이동한다"를 출력한다.
			(3) public abstract void rightUpButton()
				- NORMAL_MODE 일경우 : "캐릭터가 한칸단위로 점프한다."를 출력한다.
				- HARD_MODE 일경우 : "캐릭터가 두칸단위로 점프한다."를 출력한다.
			(4) public abstract void rightDownButton()
				- NORMAL_MODE 일경우 : "캐릭터가 일반 공격."를 출력한다.
				- HARD_MODE 일경우 : "캐릭터가 HIT 공격."를 출력한다.
			(5) public abstract void changeMode() : 모드를 바꾸고 현재 모드를 출력하는 기능 ( 예를 들어, NORMAL_MODE -> HARD_MODE / HARD_MODE -> NORMAL_MODE)
			
			3) ArcadeGame 클래스를 정의한다.
			- Keypad를 구현하는 클래스.
			- 현재 모드를 값으로 가지는 필드를 가지며 생성자를 이용하여 값을 초기화한후 "ArcadeGame 실행"을 출력한다.
			  ( 단, 매개변수를 이용하지 않으며 최초의 값은 NORMAL_MODE 이다. )
			- Keypad 인터페이스에 정의된 추상 메서드를 다음과 같이 오버라이딩한다.
			(1) public abstract void leftUpButton() : "캐릭터가 앞쪽으로 이동한다"를 출력한다.
			(2) public abstract void leftDownButton() : "캐릭터가 뒤쪽으로 이동한다"를 출력한다.
			(3) public abstract void rightUpButton()
				- NORMAL_MODE 일경우 : "캐릭터가 일반 공격"를 출력한다.
				- HARD_MODE 일경우 : "캐릭터가 연속 공격"를 출력한다.
			(4) public abstract void rightDownButton()
				- NORMAL_MODE 일경우 : "캐릭터가 HIT 공격."를 출력한다.
				- HARD_MODE 일경우 : "캐릭터가 Double HIT 공격."를 출력한다.
			(5) public abstract void changeMode() : 모드를 바꾸고 현재 모드를 출력하는 기능 ( 예를 들어, NORMAL_MODE -> HARD_MODE / HARD_MODE -> NORMAL_MODE)
			
			4)  아래와 같은 출력결과가 나오도록 실행코드를 구현한다.
			- 출력결과
				RPGgame 실행
				캐릭터가 위쪽으로 이동한다.
				캐릭터가 한칸단위로 점프한다.
				현재 모드 : HARD_MODE
				캐릭터가 두칸단위로 점프한다.
				캐릭터가 HIT 공격.
				캐릭터가 아래쪽으로 이동한다.
				현재 모드 : NORMAL_MODE
				캐릭터가 일반 공격.
				======================
				ArcadeGame 실행
				캐릭터가 앞쪽으로 이동한다.
				캐릭터가 일반 공격
				캐릭터가 뒤쪽으로 이동한다.
				현재 모드 : HARD_MODE
				캐릭터가 연속 공격.
				캐릭터가 앞쪽으로 이동한다.
				캐릭터가 Double HIT 공격.
					
		Question 3]
			Question 2]을 이용하여 랜덤게임 프로그램을 구현하라.
			1) 프로그램을 실행할 경우 50% 확률로 두 개의 게임 중 하나가 셋팅된다.
				( RPGgame or ArcadeGame )
			2) 다음과 같이 메뉴를 구성한다.
				<< 1.LeftUP | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT >>
			3) 아래와 같이 출력결과가 나오도록 실행코드를 구현한다.
			- 출력결과
				PRGgame 실행
				============================================================================================
				<< 1.LeftUP | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT >>
				============================================================================================
				choice>>1
				캐릭터가 위쪽으로 이동한다.
				============================================================================================
				<< 1.LeftUP | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT >>
				============================================================================================
				choice>>3
				캐릭터가 한칸단위로 점프한다.
				============================================================================================
				<< 1.LeftUP | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT >>
				============================================================================================
				choice>>5
				현재 모드 : HARD_MODE
				============================================================================================
				<< 1.LeftUP | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT >>
				============================================================================================
				choice>>3
				캐릭터가 두칸단위로 점프한다.
				============================================================================================
				<< 1.LeftUP | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT >>
				============================================================================================
				choice>>4
				캐릭터가 HIT 공격.
				============================================================================================
				<< 1.LeftUP | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT >>
				============================================================================================
				choice>>2
				캐릭터가 아래쪽으로 이동한다.
				============================================================================================
				<< 1.LeftUP | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT >>
				============================================================================================
				choice>>5
				현재 모드 : NORMAL_MODE
				============================================================================================
				<< 1.LeftUP | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT >>
				============================================================================================
				choice>>4
				캐릭터가 일반 공격.
				============================================================================================
				<< 1.LeftUP | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT >>
				============================================================================================
				choice>>9
				EXIT
				
			- 조건
				랜덤게임으로 출력결과는 실행 시 설정되는 게임에 따라 달라질 수 있다.
*/				
	
}
