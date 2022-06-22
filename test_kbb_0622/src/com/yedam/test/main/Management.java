package com.yedam.test.main;

import java.util.List;
import java.util.Scanner;

import com.yedam.test.book.Book;
import com.yedam.test.book.BookDAO;

public class Management {

	private Scanner sc = new Scanner(System.in);
	private BookDAO bDAO = BookDAO.getInstance();
	
	public Management() {
	
		while(true) {
			menuPrint();
			
			int menuNo = selectMenu();
			
			if(menuNo == 1) {
				//전체 조회
				allBook();
				
			} else if(menuNo == 2) {
				//단건조회
				searchByName();
				
			} else if(menuNo == 3) {
				//내용검색
				searchByContent();
				
			} else if(menuNo == 4) {
				//대여가능
				rentAvailable();
				
			} else if(menuNo == 5) {
				//책 대여
				rentBook();
				
			} else if(menuNo == 6) {
				//책 반납
				returnBook();
				
			} else if(menuNo == 7) {
				//책 등록
				inputBook();
				
			} else if(menuNo == 9) {
				//종료
				exit();
				break;
				
			} else {
				showInputError();
			}
		}
	
	}
	
	private void menuPrint() {
		System.out.println("=============================================================================");
		System.out.println("1.전체조회 | 2.단건조회 | 3.내용검색 | 4.대여가능 | 5.책 대여 | 6. 책 반납 | 7.책 등록 | 9.종료");
		System.out.println("=============================================================================");
	}
	
	private int selectMenu() {
		int menu = 0;
		try {
			menu = Integer.parseInt(sc.nextLine());
			
		} catch(NumberFormatException e) {
			System.out.println("숫자 형식으로 입력해주세요.");
		}
		return menu;
	}
	
	private void exit() {
		System.out.println("프로그램을 종료합니다.");
	}
	
	private void showInputError() {
		System.out.println("메뉴를 참고하여 입력해주시기 바랍니다.");
	}
	
	//등록
	private void inputBook() {
		Book book = inputAll();
		bDAO.insert(book);
	}
	
	private Book inputAll() {
		Book book = new Book();
		System.out.println("도서명 > ");
		book.setBookName(sc.nextLine());
		System.out.println("저자명 > ");
		book.setBookWriter(sc.nextLine());
		System.out.println("책 내용 > ");
		book.setBookContent(sc.nextLine());
		return book;
	}
	
	//도서명으로 조회
	private void searchByName() {
		String bookName = inputName();
		
		Book book = bDAO.selectOneByName(bookName);
		
		if(book == null) {
			System.out.println("등록된 도서가 아닙니다.");
			return;
		}
		System.out.println(book);
		
	}
	
	
	private String inputName() {
		System.out.println("도서명 > ");
		return sc.nextLine();
	}
	
	//내용으로 조회
	
	private void searchByContent() {
		String bookContent = inputContent();
		
		Book book = bDAO.selectOneByContent(bookContent);
		
		if(book == null) {
			System.out.println("등록된 도서가 아닙니다.");
			return;
		}
		System.out.println(book);
	}
	
	
	
	private String inputContent() {
		
		System.out.println("검색 내용 > ");
		return sc.nextLine();
	}
	
	
	//대여 가능 리스트
	private void rentAvailable() {
		List<Book> list = bDAO.selectRental();
		
		for(Book book : list) {
			System.out.println(book);
		}
		
		//select 이름을 이용하여 해당책의 렌탈값이 0이면 렌탈 진행 가능 , 1이면 끊어버리기
	}
	
	
	//대여
	private void rentBook() {
		//빌릴책 제목 입력 받고
		String bookName = inputName();
		
		Book book = bDAO.selectOneByName(bookName);
		//북테이블에 등록되어있는지 아닌지 확인
		
		if(book == null) {
			System.out.println("등록되지 않은 도서입니다.");
			return;
		} else {
			book.setBookRental(1);
			bDAO.update(book);
		}
			//등록되어 있으면 업데이트문에 책제목 입력받은거 넣어주기
		
		//대여하면 렌탈번호 1로 바뀜
			
		//update문으로 수정
		
	}
	
	//반납
	private void returnBook() {
		//반납하면 렌탈번호가 0으로 바뀜
		String bookName = inputName();
		
		Book book = bDAO.selectOneByName(bookName);
		//북테이블에 등록되어있는지 아닌지 확인
		
		if(book == null) {
			System.out.println("등록되지 않은 도서입니다.");
			return;
		} else {
			book.setBookRental(0);
			bDAO.update(book);
		}
	}
	
	//전체조회
	private void allBook() {
		List<Book> list = bDAO.selectAll();
		
		for(Book book : list) {
			System.out.println(book);
		}
	}
	
	
	
}
