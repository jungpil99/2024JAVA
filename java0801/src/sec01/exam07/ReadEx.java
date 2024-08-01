package sec01.exam07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class ReadEx {

	public static void main(String[] args) throws Exception{
//		FileReader reader = new FileReader("C:/Temp/board1.csv");
		String line = "";
		
		BufferedReader br = new BufferedReader(new FileReader("C:/Temp/board1.csv")); //보조 스트림
		while((line = br.readLine()) != null) {
			String[] data = line.split(", ");
			
			BoardDTO dto = new BoardDTO(0, data[0], data[1], data[2], null, 0);
			System.out.println(dto);
			for(String element : data) {
				System.out.println(element + "");
			}
			System.out.println();
		}
		
		br.close();
	}

}
