package java0731;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class MyFileWriter2 {

	public static void main(String[] args) throws IOException{
		File dir = new File("C:/Temp/file");
		if(dir.exists() == false) {
			dir.mkdir();
		}
		Writer writer = new FileWriter("C:/Temp/file/data.txt");
		String str = "뉴 네오 영 빅 프레쉬 신 디플러스 기아";
		writer.write(str);
		writer.flush();
		writer.close();

	}

}
