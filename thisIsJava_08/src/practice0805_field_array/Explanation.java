package practice0805_field_array;

public class Explanation {
/*
 * <<타입변환과 다형성>>

 *
 * -------------------------------------------------
 * 
 * [인터페이스 배열로 구현 객체 관리]
 * 
 * 	-> 배열의 항목으로 구현 객체가 대입될 수 있음
 * 	-> 인덱스로 항목을 접근할 수 있음
 * 
 * Tire[] tires {
 * 	new HankookTire(),
 * 	new HankookTire(),
 * 	new HankookTire(),
 * 	new HankookTire(),
 * };
 * 
 * 
 * tires[1] = new KumhoTire();
 * 	-> 두번째항목에 있는 것을 금호타이어로 교체하겠다
 * 
 * 
 * void run(){
 * 	for(Tire tire : tires){
 * 		tire.roll();
 * 	}
 * }
 * 	-> 각 항목의 타이어에 롤 메소드를 호출하고 싶다면, 네번씩 타이어라는 항목을 가져와서
 * 	타이어의 롤을 호출한다
 * 
 */
}
