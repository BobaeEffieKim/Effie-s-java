package practice_0704_super;

public class Explanation {
/* 
* 
 * [부모 메소드 사용(super)]
 * - 메소드 재정의는 부모 메소드를 숨기는 효과
 * 	-> 자식 클래스에서는 재정의된 메소드만 호출된다.
 * - 자식 클래스에서 수정되기 전의 부모 메소드를 호출하고자 하는 경우 super를 사용
 * 	-> super 든 this든 자식객체 안에서만 사용할 수 있다. 외부에서는 사용불가
 * 	-> super는 부모 객체를 참조 (cf. this는 자신의 객체를 참조) => super.부모메소드();
 * 	-> super는 상속을 할 경우에 자식객체가 부모객체의 참조를 얻을 때 사용함
 * 		-> cf. 부모 생성자 호출 => super();
 * 
 * class Parent {
 * 	void method1(){}
 * 	void method2(){}
 * }
 * ↑(상속)
 * class Child extends Parent{
 * 	void method2(){} 		//Overriding 메소드 재정의
 * 	void method3(){}	//메소드3내에서 호출
 * 		method2();			//앞에 아무것도 없기때문에 방금 위에서 재정의된 메소드2가 실행
 * 		super.method2();	//부모클래스에 있는 메소드2가 호출됨
 * 	-> 흔치않은 코드. 부모쪽에 실행되어야하는 코드 5개있고 자식쪽에 5줄 있는데 함께 실행되어야할때 이런코드 사용
 
 *
 * 
 */
}
