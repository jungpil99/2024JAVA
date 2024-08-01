package account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.JDBUtill;

public class AccountDAO {

	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	
	private String ACCOUNT_LIST = "select * from account";
	private String ACCOUNT_INSERT = "insert into board(name, ssn, tel, balance) "
			+ "values (?, ?, ?, 0)";
	public List<AccountDTO> getAccountList(){
		List<AccountDTO> list = new ArrayList<AccountDTO>();
		
		conn = JDBUtill.getConnection();
		
		try {
			stmt = conn.prepareStatement(ACCOUNT_LIST);
			rs = stmt.executeQuery();
			while(rs.next()) {
				AccountDTO dto = new AccountDTO(rs.getInt("id"), rs.getString("name"),
						rs.getString("ssn"), rs.getString("tel"), rs.getInt("balance"));
				list.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBUtill.close(rs, stmt, conn);
		}
		return list;
	}
	
	public void insertAccount(AccountDTO dto) {
		conn = JDBUtill.getConnection();
		try {
			stmt = conn.prepareStatement(ACCOUNT_INSERT);
			stmt.setString(1, dto.getName());
			stmt.setString(2, dto.getSsn());
			stmt.setString(3, dto.getTel());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBUtill.close(stmt, conn);
		}
	}

}
