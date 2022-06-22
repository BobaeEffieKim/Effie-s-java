package com.yedam.test.book;
//dao를 상속받은 book테이블에 대한 dao클래스
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.yedam.test.common.DAO;

public class BookDAO extends DAO{

	//싱글톤
	private static BookDAO bookDAO = null;
	private BookDAO() {}
	
	//필드가 널이면 객체가 없다는거니까 생성하고, 널이 아니면 객체가 있다는 거니까 처음 생성했던 객체를 리턴해줘라
	public static BookDAO getInstance() {
		if(bookDAO == null) {
			bookDAO = new BookDAO();
		}
		return bookDAO;
	}
	
	
	//CRUD
	
	//등록
	public void insert(Book book) {
		try {
			//db연결
			connect();
			//쿼리문
			String sql = "INSERT INTO books(book_name, book_writer, book_content) VALUES (?,?,?)";
			
			//dao상속 받았으니 아래애들 필드선언 안해줘도 사용할 수 있음
				//pstmt는 연결하면서 바로 쿼리문을 넣어줌 -> 그래서 매개값에 sql
				//stmt는 바로 쿼리문 넣어주는게 아니라서 매개값에 sql이 안들어감
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, book.getBookName());
			pstmt.setString(2, book.getBookWriter());
			pstmt.setString(3, book.getBookContent());
			
			//developer에서 쿼리문적고 실행버튼 누르는 역할 
				//등록이나 수정에서는 데이터 하나씩만 해주니까 rs로 전체로 볼 필요없다
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				//결과가 1개 이상이면 등록
				System.out.println("정상적으로 등록되었습니다.");
			} else {
				System.out.println("정상적으로 등록되지 않았습니다.");
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
	
	
	//수정 - 렌탈여부
	public void update(Book book) {
		try {
			connect();
			
			//책이름이 ~인 것을 찾아 렌탈여부값을 ...로 업뎃하라
			String sql = "UPDATE books SET book_rental = ? WHERE book_name = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, book.getBookRental());
			pstmt.setString(2, book.getBookName());
			
			
			//쿼리문 실행
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println("정상적으로 수정되었습니다.");
			} else {
				System.out.println("정상적으로 수정되지 않았습니다.");
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
	}
	
	
	//단건조회 - 렌탈여부
	public List<Book> selectRental() {
		List<Book> list = new ArrayList<>();
		
		//조회할때 제품이 몇개나올지 모르니까 list타입(배열크기 안정해도됨) 사용
		//원래 배열 int arr[3] = {3,6,9} 식으로 생각할때 {3,6,9}여기값에 <Book>이 들어감
		//리스트라는 배열에 Book 객체(Book테이블의 한 행)들이 순서대로 담긴다
		//근데 그 프로덕트가 클래스타입이니까 그 객체들이 그 클래스가 가지고있는 예를 들면 name,writer..을 다 가지고 있음
		//디벨로퍼로 치면 Book객체 하나가 테이블의 한 행이나 다름없다
		
		try {
			connect();
			
			//렌탈 가능 상태의 책들만 보겠다
			String sql = "SELECT * FROM books WHERE book_rental=0";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			//위의 결과로 쿼리문 생성
			//커서가 생겨서 쿼리문 결과의 첫불부터 한행씩 읽어들여서 값 저장(rs.nextLn) -> 첫 줄의 정보로 (리스트에 담길)Book1 만들어짐
			//한줄 읽고 다음줄로 넘어가서 Book2만듦 (new 생성자가 있기때문)
			//이제 더이상 읽을 줄이 없으면 false를 반환하고 while문을 종료하고 나옴
			while(rs.next()) {
				Book book = new Book();
				//새로 객체를 생성하여 가져오면 처음엔 다 빈값임->setter로 데이터 넣어줌
				//getter로 불러온 정보를 vo클래스 객체의 setter에 저장한다?
				book.setBookName(rs.getString("book_name"));
				book.setBookWriter(rs.getString("book_writer"));
				book.setBookContent(rs.getString("book_content"));
				book.setBookRental(rs.getInt("book_rental"));
				
				//위의 Book객체에서 생성된 Book1,2,,,들을 리스트배열에 담음
				list.add(book);
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		//결과적으로, 전체 데이터를 한줄씩 읽었을때 렌탈가능상태인 값들만 담아서 반환하겠다
		return list;
	}
	
	
	
	//단건조회 - 제목으로
	public Book selectOneByName(String bookName) {
							  //보고싶은 책제목 입력받으면 아래 실행되도록 
		Book book = null;
		
		try {
			connect();
		
		//책제목이~인 책만 선택해서 조회하겠다
		String sql = "SELECT * FROM books WHERE book_name = ?";
		
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, bookName);
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			book = new Book();
			book.setBookName(rs.getString("book_name"));
			book.setBookWriter(rs.getString("book_writer"));
			book.setBookContent(rs.getString("book_content"));
			book.setBookRental(rs.getInt("book_rental"));
		}
		
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		} return book;
	}
	
	
	//단건조회 - 내용으로
	
	public List<Book> selectOneByContent(String bookContent) {
		List<Book> list = new ArrayList<>();
		
		
		try {
			connect();
		
		//'책내용'이 포함된 단어가 들어가는 책을 선택하여 보겠다 
		String sql = "SELECT * FROM books WHERE book_content LIKE '%" + bookContent+ "%'";
		
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		
		
		while(rs.next()) {
			Book book = new Book();
			book.setBookName(rs.getString("book_name"));
			book.setBookWriter(rs.getString("book_writer"));
			book.setBookContent(rs.getString("book_content"));
			book.setBookRental(rs.getInt("book_rental"));
			
			list.add(book);
		}
		
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		} return list;
	}
	
	
	
	//전체조회 
	
	public List<Book> selectAll(){
		List<Book> list = new ArrayList<Book>();
		
		try {
			connect();
			
			//모든 책의 정보를 책이름을 기준으로 정렬하여 보겠다 
			String sql = "SELECT * FROM books ORDER BY book_name";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				Book book = new Book();
				
				book.setBookName(rs.getString("book_name"));
				book.setBookWriter(rs.getString("book_writer"));
				book.setBookContent(rs.getString("book_content"));
				book.setBookRental(rs.getInt("book_rental"));
				
				//데이터의 한줄씩 읽었을때 조건에 해당하는 값들을 리스트배열에 담겠다
				list.add(book);
			}
			
			
			
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		//값들을 가진 리스트로 결과를 출력하겠다
		return list;
		
	}
	
	
	
}
