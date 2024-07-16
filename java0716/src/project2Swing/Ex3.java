package project2Swing;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member[] list = {new Member("강하나", "991124", "010-1234-1234"),
				         new Member("고하나", "970608", "010-5467-7789"),
				         new Member("상하나", "890604", "010-5544-6875")};
		try(FileOutputStream fos = new FileOutputStream("c:\\temp\\members.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			oos.writeObject(list);
		System.out.println("객체를 파일에 저장했습니다");
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
