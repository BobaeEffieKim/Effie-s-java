package com.yedam.java.homeworkComplete;
//교수임 풀이
import java.util.Scanner;

public class BookSystem_professor implements BookProgram {

	private BookAccess dao = BookRepo.getInstance();
	private Scanner sc = new Scanner(System.in);
	
	
	@Override
	public void menuPrint() {
		System.out.println("1.정보입력 | 2.전체조회 | 3.분석 | 4.조회 | 5.종료");
	}

	@Override
	public void inputInfo(BookAccess access) {
		Book data = inputAll();
		dao.insert(data);
	}

	private Book inputAll() {
		System.out.println("도서명 >");
		String title = sc.nextLine();
		System.out.println("가격 >");
		int price = Integer.parseInt(sc.nextLine());
		
		return new Book(title, price);
		}
	
	@Override
	public void printAllInfo(BookAccess access) {
		Book[] list = dao.selectAll();
		for(Book data : list) { //향상된 for문 쓸때 null값이 있으면 안됨
			data.showInfo();
		}
	}

	@Override
	public void printInfo(BookAccess access) {
		//isbn 정보입력
		int keyword = inputOne();
		//DAO에서 검색 -> dao(db에서) keyword로 검색한 값을 Book data에 저장
		Book data = dao.selectOne(keyword);
		//출력
		data.showInfo();
	}

	private int inputOne() {
		System.out.println("isbn >");
		return Integer.parseInt(sc.nextLine());
	}
	
	
	@Override
	public void printRepot(BookAccess access) {
		//가장 비싼 책
		Book maxInfo = selectMaxInfo();
		System.out.println("가장 가격이 높은 책 >");
		maxInfo.showInfo();
		
		//가장 가격이 낮은 책
		Book minInfo = selectMinInfo();
		System.out.println("가장 가격이 낮은 책 >");
		minInfo.showInfo();
		
		//두 가지를 제외한 책들의 정보와 평균값
		calcAvgInfo();
		
	}
	//이 프로그램 안에서만 사용할 메소드라서 private, 외부에서 호출할거면 public으로해도 무방
	private Book selectMaxInfo() {
		//전체 조회
		Book[] list = dao.selectAll();
		//검색
		Book maxInfo = list[0]; //list가 가진 0번째 값 중심으로 해서 하나씩 들고오는 값과 비교
		for(Book data : list) {
			if(maxInfo.getPrice() < data.getPrice()) { //값이 크면 교체 
				maxInfo = data;			//가장 큰 값만 남는다 . 그 값을 그대로 아래 return으로 반환
			}
		}
		//반환
		return maxInfo;
	}
	
	private Book selectMinInfo() {
		//전체 조회
		Book[] list = dao.selectAll();
		//검색
		Book minInfo = list[0]; //list가 가진 0번째 값 중심으로 해서 하나씩 들고오는 값과 비교
		for(Book data : list) {
			if(minInfo.getPrice() > data.getPrice()) { //값이 크면 교체 
				minInfo = data;			//가장 큰 값만 남는다 . 그 값을 그대로 아래 return으로 반환
			}
		}
		//반환
		return minInfo;
	}
	
	private void calcAvgInfo() {
		Book maxInfo = selectMaxInfo();
		Book minInfo = selectMinInfo();
		
		Book[] list = dao.selectAll();
		int sum = 0;
		for(Book data : list) {
			if(data.getPrice() > minInfo.getPrice()
					&& data.getPrice() < maxInfo.getPrice()) {
				//조건에 만족하는 경우의 총합
				sum += data.getPrice();
				//조건에 만족하는 경우의 정보를 출력
				data.showInfo();
			}
		}
		
		double avg = (double)sum / (list.length -2);
		System.out.print("최고 가격과 최저 가격을 제외한 평균 가격 >");
		System.out.printf("%.2f\n", avg);
	}
	
	
}
