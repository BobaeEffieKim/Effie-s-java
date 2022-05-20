package control;

public class WhileTest1 {

	public static void main(String[] args) {
		//1부터 10까지 반복
		int count = 1;
		
		do {
			System.out.println(count);
			count++;
			//if(count>=10){}을 써준다면 while(true)로 바꿔주면 됨
		} while(count<=10);  //true->무한반복 혹은 false->한번돌고 나감 =>따라서 조건식걸어야함
		
		
	}

}
