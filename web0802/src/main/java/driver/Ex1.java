package driver;

import board.BoardDAO;
import board.BoardDTO;

public class Ex1 {
	
	public static void main(String[] ar) {
		BoardDAO dao = new BoardDAO();
		BoardDTO dto = new BoardDTO(9, "고순조", "백반 레시피","내용 있음", null, 0);
		dao.updateBoard(dto);
		System.out.println("수정완료");
	}
}
