package drive;

import board.BoardDAO;
import board.BoardDTO;

public class Ex2 {

	public static void main(String[] args) {
		BoardDAO dao = new BoardDAO();
		BoardDTO dto = new BoardDTO(0, "황새치", "백반 레시피","내용 없음", null, 0);
		dao.insertBoard(dto);
		System.out.println("입력 완료"); 

	}

}
