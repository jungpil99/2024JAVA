package java0712;

import java.util.Random;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		for (int i = 0; i < 6; i++) {
			//System.out.println(rd.nextInt(10)); //10을 쓰면 0~9까지만 출력
			//System.out.println(rd.nextInt(10)+1); //1~10 사이로 랜덤한 값 출력
			System.out.println(rd.nextInt(45)+1); //1~45
		}
	}

}
