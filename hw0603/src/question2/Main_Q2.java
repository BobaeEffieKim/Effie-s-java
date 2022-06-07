package question2;

public class Main_Q2 {

	public static void main(String[] args) {

		Keypad rpg = new RPGgame();
		rpg.leftUpButton();
		rpg.rightUpButton();
		rpg.changeMode();
		rpg.rightUpButton();
		rpg.rightDownButton();
		rpg.leftDownButton();
		rpg.changeMode();
		rpg.rightDownButton();
		
		System.out.println("============================");
		
		
		Keypad arc = new ArcadeGame();
		arc.leftUpButton();
		arc.rightUpButton();
		arc.leftDownButton();
		arc.changeMode();
		arc.rightUpButton();
		arc.leftUpButton();
		arc.rightDownButton();
}
}
