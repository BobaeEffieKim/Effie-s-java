package com.yedam.java.example1;

//고객정보를 저장하는 저장소
public class Repo {

	//필드
	private Customer[] dataList;
	private int listIndex;
	
	//생성자
	public Repo() {
		dataList = new Customer[100];
		listIndex = -1;
	}
	
		//메소드
	//등록
	public void insert(Customer customer) {
		dataList[++listIndex] = customer;
	}
	//수정
	public void update(Customer customer) {
		for(int i=0; i<=listIndex; i++) {
			if(dataList[i].getCustomerId() == customer.getCustomerId()) {
				dataList[i] = customer; //데이터리스트에 커스터머를 넣는다.
			}
		}
	}
	//삭제
	public void delete(int customerId) {
		//데이터 삭제
		for(int i=0; i<=listIndex; i++) {
			if(dataList[i].getCustomerId() == customerId) {
				dataList[i] = null; //
			}
		}
		//데이터 정리
		cleanDataList();
		
	}
	
	private void cleanDataList() {
		//기존 데이터, 임시 변수에 복사
		Customer[] temp = dataList;
		int tempIndex = listIndex; //인덱스 복사
		
		//기존 데이터를 초기화
		this.dataList = new Customer[100];
		this.listIndex = -1;
		for(int i=0; i<tempIndex; i++) {
			if(temp[i] == null) {
				continue;
			}
			dataList[++listIndex] = temp[i];
		}
	}
	
	//조회
	
	public Customer[] selectAll() { //여기에 저장된 모든 정보를 보고싶으면, 모든 배열을 넘겨줘서 볼 수 있도록 해줌
		return dataList;
	}
	
	public Customer selectOne(int customerId) { //delete:그 값을 삭제하는 것./ selectedOne:그 값을 다시 반환해주는 것.
		Customer selected = null;
		for(int i=0; i<=listIndex;i++) {
			if(dataList[i].getCustomerId() == customerId) {
				selected = dataList[i];
				break; 		//찾았으니 더이상 돌릴필요가 없으니 브레이크 넣어준다.
			}
		}
		return selected;
	}
	
	
	
}
