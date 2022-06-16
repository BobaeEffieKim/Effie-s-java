package practice06_09_instance_member;
/*
 * [인스턴스 멤버]
 * - 객체(인스턴스) 마다 가지고 있는 필드와 메소드
 * - 인스턴스 멤버는 객체에 소속된 멤버이므로 객체없이 사용 불가
 * - 객체를 생성해서 사용해야하는 필드와 메소드
 */

//클래스이름이 원래 Car였는데 이름을 바꿔서 이상해진걸 감안하고 설명보기!! 
public class Explanation_Car {
	// 즉, 여기서 만든 필드와 메소드는 Car라는 객체를 생성하지않고는 사용할 수 없다

//	// 필드
//	int gas;
//	private String model;
//
//	// 메소드
//	void setSpeed(int speed) {
//
//		/////////////////////////////////////////////////
//
//		Explanation_Car myCar = new Explanation_Car();
//		// Car객체 생성 -> ㅡmyCar라는 변수로 Car객체 참조하도록함
//		myCar.gas = 10;
//		// 위의 gas필드에 10이라는 값을 저장 함. => 참조변수.변수명 = 값;
//		myCar.setSpeed(60);
//		// 참조변수를 통해서 객체에 접근 후 객체에 setSpeed라는 메소드를 호출, 그리고 값을 넣어줌
//
//		Explanation_Car yourCar = new Explanation_Car();
//		yourCar.gas = 20;
//		yourCar.setSpeed(80);
//
//
//	}
	//////////////////////////////////////////////////

//		//this 학습
//		- 객체 내부에서 자신의 번지를 가지고 있는 키워드
//			- this는 힙영역 객체 내부에 생성 됨 => this라는 키워드에 값을 저장하고 있음
//		- 객체 내부에서 인스턴스 멤버임을 명확히 하기 위해 this.을 붙일 수 있음
//		- 주로 매개변수와 필드명이 동일할 경우 인스턴스 필드임을 명확히하기위해 붙임
//		
		//생성자
/*			아래 생성자의 매개변수와 필드명이 동일 함
 * 			외부로받은 값을 필드에 저장하고 싶은데 이름이 동일할 경우에는 필드명앞에 this.붙여 필드임을 확인해줌
 * 			그래서 필드 model앞에 this.을 붙이면 '객체가 가지고 있는 model이라는 필드라는 뜻'
 * 			아래에서 그냥 model은 매개변수임 -> {}내에서는 매개변수가 우선순위가지기때문에 this로 구분 짓는 것
 */
//			Explanation_Car(String model) {
//				this.model = model;
//			}
//			
		//메소드	
/*			메소드의 매개변수명과 필드명이 동일 할 경우 this붙여줌
 * 			메소드의 매개값을 필드값으로 대입하려면 정확하게 필드임을 명시해줘야함
 * 			this가없으면 마찬가지고 매개변수가 우선순위가 되어버리니 this사용하여 명시해줘야함
 */
//			void setModel(String model) {
//				this.model = model;
//		}
			
			
			
			
			
}