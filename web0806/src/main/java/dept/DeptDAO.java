package dept;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.JDBUtill;

public class DeptDAO {
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	
	private String DEPT_LIST = "select * from dept";
	private String DEPT_ADD = "insert into dept values (?, ?, ?)";
	public List<DeptDTO> getDeptList(){
		List<DeptDTO> list = new ArrayList<DeptDTO>();
		
		conn = JDBUtill.getConnection();
		
		try {
			stmt = conn.prepareStatement(DEPT_LIST);
			rs = stmt.executeQuery();
			while(rs.next()) {
				DeptDTO dto = new DeptDTO(rs.getInt("deptno"), rs.getString("dname"), rs.getString("loc"));
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
	
	public void insertDto(DeptDTO dto) {
		conn = JDBUtill.getConnection();
		try {
			stmt = conn.prepareStatement(DEPT_ADD);
			stmt.setInt(1, dto.getDeptno());
			stmt.setString(2, dto.getDname());
			stmt.setString(3, dto.getLoc());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBUtill.close(stmt, conn);
		}
	} 
}
