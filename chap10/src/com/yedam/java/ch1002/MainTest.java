package com.yedam.java.ch1002;

public class MainTest {

	public static void main(String[] args) {

		try {
			//원래 실행하고자 한 코드
		} catch(Exception e) {
			//예외가 발생한 경우 처리코드
		} finally {
			//정상적으로 실행하든 예외가 발생했든 반드시 실행되어야하는 코드
			//때에따라 생락가능
		}
		
		String data1 = null;
		String data2 = null;
		
		try {
				int value1 = Integer.parseInt(data1); //-> catch 구문에서 예외처리해준 타입이 아니라 예외처리 안됨. 맞는 타입으로 catch구문에 예외처리 해줘야함(다중 catch)
				
				data1 = args[0];
				data2 = args[1];
			}catch(ArrayIndexOutOfBoundsException e) {
				//e.printStackTrace();	오류나서 나중에 주석처리함
				System.out.println("실행 매개값의 수가 부족합니다.");
				return;	//때에따라 예외가 발생할때 그냥 메소드 종료시키고싶으면 return구문 넣기
			}catch(NumberFormatException e) {
				System.out.println("숫자 형식에 맞춰 입력해주세요.");
			}catch(Exception e) {	//*자주 발생하는 타입의 예외는 맞는 catch구문으로 처리해놓고, 그 외에 발생할 수 있는 예외에 대해서는 최상위 예외 클래스 Exception으로 강제 타입변환으로 상속할 수 있도록 처리
									//*Exception은 항상 마지막에 들어가야함!
				System.out.println("기타");
				return; 	//예외를 만나면 마지막 문구"메인메소드종료"나오지않고 종료됨.
			}finally {		//반드시 실행되어야하는 문구가 있으면 return이 있더라도 실행됨 ->자원(Ram,통신 등등)을 정리하거나 반환하거나 할때 많이 쓰임
				System.out.println("필수 구문");
			}
			System.out.println("메인 메소드 종료");
		
			
			
			try {
				findClass();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}	//아래 throws 때문에 메소드 호출한 곳에서 오류남 
		}
		
	//예외처리를 메소드로 
	public static void findClass() throws ClassNotFoundException{ 
		//이 메소드 내에서 날 수 있는 예외에대해서 메소드 내에서 처리하지않고 호출하는 곳에서 처리하도록 throws사용해서 떠넘기기(보류)
		/*클래스의 메타정보를 가진 클래스*/
		Class clazz = Class.forName("java.lang.String"); //ex.String클래스 자체에대한 정보를 가짐
		//문법적으로 오류가 나는 건 아님
	
	}
	
	}


