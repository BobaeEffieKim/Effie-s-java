package com.yedam.app.members;

import java.sql.SQLException;

import com.yedam.app.common.DAO;

public class MemberDAO extends DAO{

	//싱글톤
	private static MemberDAO dao = null;
	private MemberDAO() {}
	public static MemberDAO getInstance() {
		if(dao == null) {
			dao = new MemberDAO();
		}
		return dao;
	}
	
	//CRUD
	
	public Member selectOne(Member member) {
		Member loginInfo = null;
		
		try {
			connect();
			
			String sql = "SELECT* FROM members WHERE member_id = '"+ member.getMemberId()+"'";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				//rs.next가 실행된다는건, 아이디는 존재한다는 뜻
				//아이디가 존재할 경우에, 다시 한번 패스워드와 입력된 패스워드가 같은지 확인 
				if(rs.getString("member_password").equals(member.getMemberPassword())){
					//비밀번호 일치 -> 로그인 성공
					loginInfo = new Member();
					loginInfo.setMemberId(rs.getString("member_id"));
					loginInfo.setMemberPassword(rs.getString("member_password"));
					loginInfo.setMemberRole(rs.getInt("member_role"));
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			} else {
				System.out.println("아이디가 존재하지 않습니다.");
			}
			
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return loginInfo;
		
	}
	
	
}
