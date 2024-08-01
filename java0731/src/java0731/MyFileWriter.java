package java0731;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class MyFileWriter {

	public static void main(String[] args) throws IOException{
		File dir = new File("C:/Temp/text");
//		File file1 = new File("C:/Temp/text/file.txt");
		if(dir.exists() == false) {
			dir.mkdir();
		}
//		if(file1.exists() == false) {
//			file1.createNewFile();
//		}
		Writer writer = new FileWriter("C:/Temp/text/file2.txt");
		
		String str = "뉴 네오 신 디플러스 기아";
		
		writer.write(str);
		
		writer.flush();
		writer.close();

	}

}
