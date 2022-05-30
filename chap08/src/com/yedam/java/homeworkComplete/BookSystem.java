package com.yedam.java.homeworkComplete;

import java.util.Scanner;

public class BookSystem implements BookProgram {

	private Scanner sc = new Scanner(System.in);
	
	@Override
	public void menuPrint() {
		System.out.println("=============================================");
		System.out.println("1.정보입력 | 2.전체 조회 | 3.검색 | 4.분석 | 5.종료");
		System.out.println("=============================================");
	}

	@Override
	public void inputInfo(BookAccess access) {
		//사용자가 정보를 입력
		Book info = inputAll();
		//저장소에 등록
		access.insert(info);
	}
	
	
	
	private Book inputAll() {

		System.out.println("도서명 >");
		String name = sc.nextLine();
		System.out.println("가격 >");
		int price = Integer.parseInt(sc.nextLine());
		
		return new Book( name, price);
	}
	

	@Override
	public void printAllInfo(BookAccess access) {
		Book[] list = access.selectAll();
		for(Book book : list) {
			book.showInfo();
		}
	}

	@Override
	public void printInfo(BookAccess access) {
		//검색 조건 입력
		int isbn = inputIsbn();
		//저장소에 검색
		Book info = access.selectOne(isbn);
		//출력
		info.showInfo();
	}

	private int inputIsbn() {
		System.out.println("ISBN으로 검색 >");
		return Integer.parseInt(sc.nextLine());
	}
	
	@Override
	public void printRepot(BookAccess access) {
	
		//최고가
		System.out.println("최고가 도서 >");
		Book maxInfo = selectMaxPrice(access);
		maxInfo.showInfo();
		
		//최저가
		System.out.println("최저가 도서 >");
		Book minInfo = selectMinPrice(access);
		minInfo.showInfo();
		
		//최고가와 최저가를 제외한 평균 가격
		System.out.println("최고가와 최저가를 제외한 도서들의 평균가 >");
		double avgResult = calAvg(access);
		System.out.println(avgResult);
	}

	//최고가 정보
	private Book selectMaxPrice(BookAccess access) {
		Book[] list = access.selectAll();
		
		Book maxInfo = list[0];
		for(int i=0; i<list.length; i++) {
			if(maxInfo.getPrice() < list[i].getPrice()) {
				maxInfo = list[i];
			}
		}
		return maxInfo;
	}
//	//최고가
//	private Book getMaxPrice(BookAccess access) {
//		Book[] list = access.selectAll();
//		
//		Book max = list[0];
//		for(int i=1; i<list.length; i++) {
//			if(max.getPrice() < list[i].getPrice()) {
//				max = list[i];
//			}
//		}
//		return max;
//	}
	
	//최저가 도서 정보
	private Book selectMinPrice(BookAccess access) {
		Book[] list = access.selectAll();
		
		Book minInfo = list[0];
		for(int i=0; i<list.length; i++) {
			if(minInfo.getPrice() > list[i].getPrice()) {
				minInfo = list[i];
			}
		}
		return minInfo;
	}
	
//	//최저가
//	private Book getMinPrice(BookAccess access) {
//		Book[] list = access.selectAll();
//		
//		Book min = list[0];
//		for(int i=0; i<list.length; i++) {
//			if(min.getPrice() < list[i].getPrice()) {
//				min = list[i];
//			}
//		}
//		return min;
//	}
//	
	//총합 및 최고가와 최저가를 제외한 평균가
	private double calAvg(BookAccess access) {
		Book[] list = access.selectAll();
		
		int sum =0;
		for(Book info : list) {
			sum += info.getPrice();
		}
		
		
		Book max = selectMaxPrice(access);
		Book min = selectMinPrice(access);
		double result = sum - (max.getPrice() + min.getPrice());
		double calAvg = result / (list.length-2);
		
		return calAvg;
	}
	
	
	
}
