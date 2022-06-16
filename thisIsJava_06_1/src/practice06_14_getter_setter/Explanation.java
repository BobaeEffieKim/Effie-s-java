package practice06_14_getter_setter;

public class Explanation {
/*
 * [Getter & Setter]
 * 필드값을 보호하면서, 외부에서도 필드값을 읽거나 변경할 수 있는 방법을 제공
 * 
 * -클래스 선언할때 필드는 일반적으로 private 접근제한을 한다
 * 	-> 읽기 전용 필드가 있을 수 있다 (getter의 필요성)
 * 		외부에서 읽기는 할 수 있고 변경은 못하도록 할때 필요한 것이 getter!
 * 		일단 private으로 접근제한을 한다 -> 이 필드값을 읽어서 리턴해주는 메소드 하나 작성(getter)
 * 		getter가 public으로 선언되어서 외부에서 호출할 수 있도록 함 
			->getter가 내부의 필드를 읽어서 리턴해줌
 * 			-> 외부에서는 이 필드의 값을 간접적으로 얻을 수 있음
 * 	-> 외부에서 엉뚱한 값으로 변경할 수 없도록 한다. (setter의 필요성)
 * 		Ex.
 * 		public class Car{
 * 			public int speed;
 * 		}
 * 			=> public이기때문에 외부에서 speed에 읽고 변경하는것이 자유로움
 * 			=> 누군가 speed에 -10이라는 값을 외부에서 줘버리면 엉뚱한 값이 되어버림
 * 			=> 그래서 private으로 막아서 외부에서 변경도 못하고 읽게도 못하게 해줌
 * 			=> 하지만 getter사용하면 외부에서 speed를 읽을 수는 있게 해줌
 * 	-> Setter : 외부에서 값을 줄때 엉뚱한 값인지 아닌지 검사하여 올바른 값만 필드에 저장할 수 있게 해줌
 * 			=> 	간접적으로 speed를 변경할 수 있도록 만들어주는데, 올바른 값만 저장할 수 있도록 검사해줌
 * 
 * 
 * 
 * 
 * -Getter
 * 	-> private 필드의 값을 리턴하는 역할을 한다
 * 		=> 필요할 경우 필드의 값을 가공해서 리턴한다.
 * 	-> getter 이름 : getFieldName() 또는 isFieldName()메소드를 말한다.
 * 		=> 필드 타입이 boolean일 경우 isFieldName() 이다.
 * 		=> 그 외에는 모두 get으로 시작
 * 	-> '읽기전용'으로만 만들고 싶으면 setter없이 getter만 만들면 된다!!
 * 
		 * 
		 * EX.
		 * class Car{
		 * 	private double speed;
		 * 	public double getSpeed(){	//public 뒤에 변수와 같은 타입 써줌
		 * 		return speed;			//필드값 읽고 리턴
		 * }
		 * 
		 * 
		 * Ex. field값을 가공해서 리터한 경우
		 * double getSpeed(){
		 * 	double km = speed*1.6; (마일을 km로 환산)
		 * 	return km;
		 * }	
		 * 
		 * Ex. boolean 타입
		 * class Car{
		 * 	private boolean stop;
		 * 	public boolean isStop(){
		 * 		return stop;
		 * 	}
		 * 
		 * }
		 * 
		 * 
		 * 
 * 
 * -Setter
 * 	-> 외부에서 주어진 값을 필드값으로 수정한다.
 * 		=> 필요할 경우 외부의 값을 유효성(외부에서 들어온값이 올바른지 검사후 올바를 경우에만 수정)을 검사한다.
 * 	-> setter이름 : setFieldName(타입 변수) 메소드를 말한다.
 * 		=> 매개변수타입은 필드의 타입과 동일하다.
 * 	-> 유효성 검사가 필요한 경우에 주로 사용한다!!!!
 * 
		 * Ex.
		 * class Car{
		 * 	private double speed;				
		 * 	public void setSpeed(double speed){
		 * 		this.speed = speed;
		 * }
		 * 
		 * Ex. 올바른 값만 speed 필드에 저장될 수 있도록하는 예시
		 * void setSpeed(double speed) {	//속도는 음수가 될 수 없기때문에 '음수검사'하는 코드
		 * 	if(speed < 0) {
		 * 		this.speed = 0;				//음수가 들어오면 0으로 리턴해주고
		 * 		return
		 * 	} else {
		 * 		this.speed = speed;			//올바른 값이 들어오면 매개변수 speed에 받은 값을 필드 speed에 저장해줌
		 * 	}
		 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
}
