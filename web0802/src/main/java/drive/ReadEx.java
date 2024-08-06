package drive;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

import board.BoardDAO;
import board.BoardDTO;

public class ReadEx {

	public static void main(String[] args) throws Exception{
//		FileReader reader = new FileReader("C:/Temp/board1.csv");
		String line = "";
		BoardDAO dao = new BoardDAO();
		
		BufferedReader br = new BufferedReader(new FileReader("C:/Temp/board1.csv")); //보조 스트림
		while((line = br.readLine()) != null) { //한 라인씩 읽어온다
			String[] data = line.split(", ");
			
			BoardDTO dto = new BoardDTO(0, data[0], data[1], data[2], null, 0);
			dao.insertBoard(dto);
			System.out.println("입력 완료");
//			for(String element : data) {
//				System.out.println(element + "");
//			}
//			System.out.println();
		}
		
		br.close();
	}

}
