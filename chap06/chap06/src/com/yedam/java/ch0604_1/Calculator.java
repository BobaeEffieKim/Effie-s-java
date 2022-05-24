package com.yedam.java.ch0604_1;

public class Calculator {
	
	int[] numList; //1)숫자를 입력받을 배열을 하나 선언한다.
	int index; 	   //2)인덱스 입력
	
	Calculator(){
		index = -1;//3)초기화
	}
	//1. 갯수 입력
	void setArraySize(int size) {
		numList = new int[size];	//4)넘겨받은 사이즈를 이용하여 숫자입력받을준비
	}
	
	//2. 갯수만큼 숫자 입력
	void setNum(int num) {
		if((index+1) < numList.length) { //비교연산자를 사용할때는 비교 두개의 단위가 맞아야한다(ex.index와 length는 단위가 다름)
			numList[++index] = num;
		} else {
			System.out.println("숫자를 더이상 입력할 수 없습니다.");
		}
	}
	
	//3. 더하기
	void plus() {
		if(isExecuted()) {
			int sum = 0;
			for(int i=0; i<= index; i++) { //index<length 
				sum += numList[i];
			}
			System.out.println("모두 더한 결과 : "+sum);
		}
	}
	
	//4. 빼기
	void minus() {
		if(isExecuted()) { //배열이 가지고있는 값이 두개이상인지 체크
			int result = numList[0];	  //배열에서 가장 첫	번째 값을 가져야함
			for(int i=1; i<=index; i++) { //num에 이미 0줬으므로 여기서는 첫번째값 0이후의 첫수인 1부터시작
				result -= numList[i];
			}
			System.out.println("모두 뺀 결과 : "+result);
		}
	}
	
	//5. 곱하기
	void mult() {
		if(isExecuted()) {
			int result = numList[0];
			for(int i=1; i<=index; i++) {
				result *= numList[i];
			}
			System.out.println("모두 곱한 결과 : "+result);
		}
	}
	
	//6. 나누기
	void divide() {
		if(isExecuted()) {
			int result = numList[0];
			for(int i=1; i<=index; i++) {
				result /= numList[i];
			}
			System.out.println("모두 나눈 결과 : "+result);
		}
	}
	
	
	//0. 조건 체크
	boolean isExecuted() { //실행할 수 있냐 묻는 것
		if((index+1)>=2) { //실제 갯수 확인하고 싶어서 index+1하는 것임
			return true;
		} else {
			System.out.println("숫자를 더 입력해주세요.");
			return false;
		}
		
	}
	
	
	
	
}
