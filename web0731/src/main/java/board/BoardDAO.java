package board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.JDBUtill;

public class BoardDAO {
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	
	private String BOARD_LIST = "select * from board";
	private String BOARD_INSERT = "insert into board(writer, title, content, regtime, hits) "
			+ "values (?, ?, ?, now(), 0)";
	private String BOARD_GETONE = "select * from board where num =?";
	private String BOARD_UPDATE = "update board set writer=?, title=?, content=? where num = ?";
	//게시판 등록
	public void insertBoard(BoardDTO dto) {
		conn = JDBUtill.getConnection();
		try {
			stmt = conn.prepareStatement(BOARD_INSERT);
			stmt.setString(1, dto.getWriter());
			stmt.setString(2, dto.getTitle());
			stmt.setString(3, dto.getContent());
			stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBUtill.close(stmt, conn);
		}
	}
	
	public void updateBoard(BoardDTO dto) {
		conn = JDBUtill.getConnection();
		try {
			stmt = conn.prepareStatement(BOARD_UPDATE);
			stmt.setString(1, dto.getWriter());
			stmt.setString(2, dto.getTitle());
			stmt.setString(3, dto.getContent());
			stmt.setInt(4, dto.getNum());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBUtill.close(stmt, conn);
		}
	}
	
	public BoardDTO getOne(int num) {
		BoardDTO dto = null;
		List<BoardDTO> list = new ArrayList<BoardDTO>();
		
		conn = JDBUtill.getConnection();
		try {
			stmt = conn.prepareStatement(BOARD_GETONE);
			stmt.setInt(1, num);
			rs = stmt.executeQuery();
			if(rs.next()) {
				dto = new BoardDTO(rs.getInt("num"),rs.getString("writer"),
						rs.getString("title"),rs.getString("content"),
						rs.getString("regtime"),rs.getInt("hits"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBUtill.close(rs, stmt, conn);
		}
		
		return dto;
	}
	
	public List<BoardDTO> getBoardList(){
		List<BoardDTO> list = new ArrayList<BoardDTO>();
		
		conn = JDBUtill.getConnection();
		try {
			stmt = conn.prepareStatement(BOARD_LIST);
			rs = stmt.executeQuery();
			while(rs.next()) {
				BoardDTO dto = new BoardDTO(rs.getInt("num"),rs.getString("writer"),
						rs.getString("title"),rs.getString("content"),
						rs.getString("regtime"),rs.getInt("hits"));
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBUtill.close(rs, stmt, conn);
		}
		
		return list;
	}
}
