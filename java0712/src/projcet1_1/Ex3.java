package projcet1_1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member[] list = null;
		try (FileInputStream fis = new FileInputStream("c:\\temp\\members.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)){
			list = (Member[]) ois.readObject();
			System.out.println("파일에서 객체를 가져왔습니다");
			
		}catch (IOException | ClassNotFoundException e) { //input output 예외상황
			e.printStackTrace();
		}
		for (Member member : list) {
			System.out.println(member);
		}
	}

}
