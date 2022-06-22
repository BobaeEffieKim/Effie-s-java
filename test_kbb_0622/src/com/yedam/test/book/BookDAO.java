package com.yedam.test.book;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.yedam.test.common.DAO;

public class BookDAO extends DAO{

	//싱글톤
	private static BookDAO bookDAO = null;
	private BookDAO() {}
	
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
			connect();
			
			String sql = "INSERT INTO books(book_name, book_writer, book_content) VALUES (?,?,?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, book.getBookName());
			pstmt.setString(2, book.getBookWriter());
			pstmt.setString(3, book.getBookContent());
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
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
			
			String sql = "UPDATE books SET book_rental = ? WHERE book_name = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, book.getBookRental());
			pstmt.setString(2, book.getBookName());
			
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
		List<Book> bl = new ArrayList<>();
		
		try {
			connect();
			
			String sql = "SELECT * FROM books WHERE book_rental=0";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			
			while(rs.next()) {
				Book book = new Book();
				book.setBookName(rs.getString("book_name"));
				book.setBookWriter(rs.getString("book_writer"));
				book.setBookContent(rs.getString("book_content"));
				book.setBookRental(rs.getInt("book_rental"));
				bl.add(book);
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return bl;
	}
	
	
	
	//단건조회 - 제목으로
	public Book selectOneByName(String bookName) {
		Book book = null;
		
		try {
			connect();
			
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
	
	public Book selectOneByContent(String bookContent) {
		Book book = null;
		
		try {
			connect();
			
		String sql = "SELECT * FROM books WHERE book_content LIKE '%" + bookContent+ "%'";
		
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		
		
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
	
	
	
	//전체조회 
	
	public List<Book> selectAll(){
		List<Book> list = new ArrayList<Book>();
		
		try {
			connect();
			
			String sql = "SELECT * FROM books ORDER BY book_name";
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
		}
		return list;
		
	}
	
	
	
}
