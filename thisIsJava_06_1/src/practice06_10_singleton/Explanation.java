package practice06_10_singleton;

public class Explanation {

}
/*
* [Singleton]
* -하나의 애플리케이션 내에서 단 하나만 생성되는 객체
* 	-> 일반적으로는 만약 Car클래스라면 Car참조타입으로 객체를 5개든 몇개든 new연산자로 만들 수 있지만 ,
* 		어떤 클래스는 new연산자로 무한정 만들 수 없고 하나만 만들어야하는 클래스가 있다. 이때 싱글톤을 쓴다.
* 
* 	/싱글톤을 만드는 방법
* -외부에서 new연산자로 생성자를 호출할 수 없도록 만든다
* 	-> private 접근제한자를 생성자 앞에 붙인다.
* 	-> private 은 클래스 내부에서만 사용할 수 있음 -> 즉, 외부에서 new로 만들어서 생성자를 호출할 수 없도록 막겠다는뜻
* -클래스 자신의 타입으로 정적필드를 선언하고, 자신의 객체를 생성해 초기화한다.
* 	-> private 접근 제한자를 붙여 외부에서 필드값을 변경할 수 없도록 막는다.
* -외부에서 호출할 수 있는 정적 메소드인 getInstance()를 선언한다.
* -> 정적필드에서 참조하고있는 자신의 객체를 리턴하도록 한다. (아래에서는 singleton)
* -> getInstatnce()는 자기자신의 객체를 리턴하는 역할을 함, 그래서 리턴타입으로 자기자신의 클래스타입을 넣어줌
* 		이 필드에 대입된(참조하는) 객체를 리턴해줌
* -> 외부에서는 이 클래스의 객체를 얻고자할때는 new를 통해서 생성할 수 없기때문에 getInstance()를 통해서만 값을 리턴으로 얻음
* 		 getInstance()는 늘 하나의 객체(아래에서는 singleton)만 리턴하게 됨
* 
* 
* 
* public class 클래스{
* 
* 	/정적 필드
* private static 클래스 singleton = new 클래스();
* 	-> 자기자신의 객체 '클래스'를 필드에다 대입시킴-> private으로 막음
* 
* 	/생성자
* private 클래스(){}
* 
* 	/정적 메소드
* static 클래스 getInstance(){
* 	return singleton;
* }
*} 
* 
*[싱글톤 얻는법]
*
*		/getInstance()는 static 메소드이기때문에 클래스명으로 접근해서 객체를 얻은 후 '변수'가 참조하도록해야함
		/getInstance()에서 리턴되는 객체를 '변수'에 대입
* 		/getInstance()를 아무리 많이 호출해도 하나의 객체만 리턴되어 나옴 -> 모두 같은 번지 참조함 
* 클래스 변수1 = 클래스.getInstance();
* 클래스 변수2 = 클래스.getInstance();
* 
* 	/Singleton obj1 = new Singleton();	-> 컴파일 에러 -> 생성자앞에 private이 붙어있는것은 외부에서 new로 생성해서 호출할 수 없음
* 	/Singleton obj2 = new Singleton();	-> 컴파일 에러
* 
* Singleton obj1 = Singleton.getInstance();	-> getInstance()메소드로 리턴되는 객체의 참조(obj1)는 아래 같은 메소드로 리턴되는 참조(obj2)와 결국 같다
* Singleton obj2 = Singleton.getInstance();
* 
* if(obj1 == obj2){		-> obj1과 obj2참조변수가 참조하는 객체가 동일한지 묻는것
* 	System.out.println("같은 Singleton 객체입니다.");
* } else{	
* 	System.out.println("다른 Singleton 객체입니다.");
* }
*}
*/