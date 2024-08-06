package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.JDBUtill;

public class MemberDAO {
	
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	
	private String MEMBER_LOGIN = "select * from member where id= ?  and pw= ? ";
	private String MEMBER_REG = "insert into member (id, pw, name) values(?,?,?)";
	
	public MemberDTO getlogin(String id, String pw) {
		MemberDTO dto = null;
		conn = JDBUtill.getConnection();
		try {
			stmt = conn.prepareStatement(MEMBER_LOGIN);
			stmt.setString(1, id);
			stmt.setString(2, pw);
			rs = stmt.executeQuery();
			if(rs.next()) {
				dto = new MemberDTO(rs.getString("id"),rs.getString("pw")
						,rs.getString("name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBUtill.close(rs, stmt, conn);
		}
		return dto;
	}
	
	public MemberDTO joinMember(String id, String pw, String name) {
		MemberDTO dto = null;
		conn = JDBUtill.getConnection();
		try {
			stmt = conn.prepareStatement(MEMBER_REG);
			stmt.setString(1, id);
			stmt.setString(2, pw);
			stmt.setString(3, name);
			stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBUtill.close(stmt, conn);
		} 
		return dto;
	}
}
