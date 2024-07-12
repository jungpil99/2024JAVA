package projcet1_1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member[] list = { //객체
				new Member("강하나", "990611", "010-1234-1234"),
				new Member("나하나", "990712", "010-1234-1236"),
				new Member("오하나", "990616", "010-1234-1235"),
		};
		
		try(FileOutputStream fos = new FileOutputStream("c:\\temp\\members.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){ //직렬
			
			oos.writeObject(list);
			System.out.println("객체를 파일에 저장했습니다.");
			
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
