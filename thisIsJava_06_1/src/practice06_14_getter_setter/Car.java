package practice06_14_getter_setter;

public class Car {

	//필드선언	-> private으로 선언했기때문에  일단 외부에서 읽거나 값 변경 불가
	private int speed;
	private boolean stop;
	
	//외부에서 읽기가 가능하도록 해주기 -> getter
		//getter는 외부에서 접근할 수 있어야하기때문에 public으로 해준다
		//리턴타입이 필드와 동일하도록 해주기
		//그리고 필드값(여기서는 speed) 읽어서 리턴시켜줌
	public int getSpeed() {
		return speed;
	}
	
	public boolean isStop() {
		return stop;
	}
	
	
	//setter
		//setter는 값만 변경하고 끝내면 되니까 리턴타입이 모두 void임
		//필드와 동일한 타입과 변수명으로 매개변수안에 써줌
	public void setSpeed(int speed) {	
		if(speed <0) {
			this.speed =0;	//매개값으로 음수가 들어오면 speed필드에 0으로 리턴해줘라 
			return;
		} else {
			this.speed = speed;			//매개변수를 통해 들어오는 값을 필드에 저장하도록 작성
		}
		
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		if(stop == true) {
			speed = 0;
		}
	}
}
