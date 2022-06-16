package practice06_09_instance_member;

public class Car {

	
	//필드 선언
	String model;
	int speed;
	
	//생성자
	Car(String model){
		//외부에서 model이라는 값을 받아 위의 인스턴스필드에 추가할거다 라는 의미
		this.model = model;
	}
	
	//메소드
	void setSpeed(int speed) {
		//외부에서 받은 speed값을 위의 인스턴스필드에 저장할것이다는 의미
		this.speed = speed;
	}
	
	void run() {
		for(int i=10; i<=50; i+=10) {
			//위의 setSpeed메소드 호출, 메소드 매개값을 보면 int값으로 speed가 들어감->for문에 i로 10단위씩 정수값들어가게함
				//한 번 for문이 돌때마다 새로운 스피드로 제일 위 speed필드의 값을 설정하겠다는 뜻
			//Car객체의 인스턴스멤버임을 확실하게 하기 위해 메소드명앞에도 this붙임
			this.setSpeed(i);
			System.out.println(this.model +"가 달립니다. (시속 : "+this.speed+"km/h)");
			//MODEL이라는 가장위의필드를 읽고 값을 출력하라는 의미 
		}
	}
}
