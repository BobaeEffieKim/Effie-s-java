package question2;

import java.util.Scanner;

public class Main_Q3 {

	static int random;
	static Keypad game;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		randomGameStart();
		
		while(true) {
			menu();
			System.out.println("choice >> ");
			int num = sc.nextInt();
			
			if(num == 1) {
				game.leftUpButton();
			} else if(num == 2) {
				game.leftDownButton();
			} else if(num == 3) {
				game.rightUpButton();
			} else if(num == 4) {
				game.rightDownButton();
			} else if(num == 5) {
				game.changeMode();
			} else if(num ==0) {
				gameChange();
			} else if(num ==9) {
				System.out.println("EXIT");
				break;
			} else {
				System.out.println("없는 메뉴입니다.");
			}
			
		}
		
	}

	
	public static void randomGameStart() {
		random = (int)(Math.random()*2)+1;
		
		if(random == 1) {
			game = new RPGgame();
		} else {
			game = new ArcadeGame();
		}
	}
	
	public static void menu() {
		System.out.println("=============================================================================================");
		System.out.println("<< 1.LeftUp | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT >> ");
		System.out.println("=============================================================================================");
	}
	
	public static void gameChange() {
		if(game instanceof RPGgame) {
			game = new ArcadeGame();
		} else {
			game = new RPGgame();
		}
	}
	
}
