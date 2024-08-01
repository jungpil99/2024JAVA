package sec01.exam07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class BoardDAO {
	public List<BoardDTO> readBoard() throws Exception{
		List<BoardDTO> list = new ArrayList<BoardDTO>();
		String line = "";
		
		BufferedReader br = new BufferedReader(new FileReader("C:/Temp/board1.csv")); //보조 스트림
		while((line = br.readLine()) != null) {
			String[] data = line.split(", ");
			
			BoardDTO dto = new BoardDTO(
					Integer.parseInt(data[0]),
					data[1],
					data[2],
					data[3],
					data[4],
					Integer.parseInt(data[5])
					);
			list.add(dto);
			System.out.println(dto);
		}
		
		br.close();
		return list;
	}
}
