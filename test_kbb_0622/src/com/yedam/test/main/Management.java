package com.yedam.test.main;

import java.util.List;
import java.util.Scanner;

import com.yedam.test.book.Book;
import com.yedam.test.book.BookDAO;

public class Management {

	//키보드로 사용자한테 값을 입력받을거니까 스캐너 사용
	private Scanner sc = new Scanner(System.in);
	//싱글톤으로 만들어진 BookDAO에 있는 멤버들을 사용할때 ?
	private BookDAO bDAO = BookDAO.getInstance();
	
	public Management() {
	//Management가 실행되면 아래 while문을 돈다 
		
		while(true) {
			//별다른 이상이 없다면, 첫번째로 메뉴를 출력하겠다.
			menuPrint();
			
			//selectMenu의 메소드실행 결과(입력받은 값 정수로 리턴)를 menuNo라는 변수에 담겠다
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
		System.out.print("메뉴 선택 > ");
		int menu = 0;
		try {
			//입력형을 정수형태로 menu변수에 담겠다
			menu = Integer.parseInt(sc.nextLine());
			
		} catch(NumberFormatException e) {
			System.out.println("숫자 형식으로 입력해주세요.");
		}
		//오류가 없다면 입력받아 정수로 변환된 값을 반환
		return menu;
	}
	
	private void exit() {
		System.out.println("프로그램을 종료합니다.");
	}
	
	private void showInputError() {
		System.out.println("메뉴를 참고하여 입력해주시기 바랍니다.");
	}
	
	
	//도서 등록
	private void inputBook() {
		//inputAll 실행결과(입력받은 값들 리턴)를 book변수에 담겠다
		Book book = inputAll();
		//inputAll 실행결과를 bookDAO에 있는 등록으로 처리하겠다 
		bDAO.insert(book);
	}
	
	private Book inputAll() {
		Book book = new Book();
		System.out.println("도서명 > ");
		//스캐너로 입력받은 값을 세터로 책이름에 넣어서 book에 저장
		book.setBookName(sc.nextLine());
		System.out.println("저자명 > ");
		book.setBookWriter(sc.nextLine());
		System.out.println("책 내용 > ");
		book.setBookContent(sc.nextLine());
		//입력받은 값들 리턴
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
		
		List<Book> list = bDAO.selectOneByContent(bookContent);
		
		for(Book book : list) {
		
//		if(book == null) {
//			System.out.println("등록된 도서가 아닙니다.");
//			return;
//		}
		System.out.println(book);
		}
	}
	
	
	
	private String inputContent() {
		
		System.out.println("검색 내용 > ");
		return sc.nextLine();
	}
	
	
	//대여 가능 리스트
	private void rentAvailable() {
		//bookDAO의 selectRental메소드(렌탈가능상태의 책들보는것)에서 어떤 값들을 리스트로 받아옴
		List<Book> list = bDAO.selectRental();
		
		//그 리스트 수만큼 book정보에 담겨서 반복 
			//리스트에 데이터가 나열되어있을건데, 그 데이터들이 하나씩 book임시변수에 담김
			//첫번째값이 임시변수에 담겨서 for안의 실행블록 실행 -> 그다음 두번째....반복
		for(Book book : list) {
			//그 값을 출력
			System.out.println(book);
		}
		
		//select 이름을 이용하여 해당책의 렌탈값이 0이면 렌탈 진행 가능 , 1이면 끊어버리기
	}
	
	
	//대여
	private void rentBook() {
		//빌릴책 제목 입력 받고
		String bookName = inputName();
		
		Book book = bDAO.selectOneByName(bookName);
		
		//Book테이블에 등록되어있는지 아닌지 확인
		if(book == null) {
			System.out.println("등록되지 않은 도서입니다.");
			return;
		} else {
			//등록되어있는 도서라면 대여가능하니까, 대여해주고 렌탈코드 1로 바꿔줌
			book.setBookRental(1);
			//등록되어 있으면 업데이트문에 책제목 입력받은거 넣어주기
			//위 실행결과를 bookDAO의 업데이트문으로 수정
			bDAO.update(book);
		}
		
	
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
