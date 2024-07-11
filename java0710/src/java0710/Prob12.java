package java0710;

import java.util.Scanner;

/**
 * 구구단을 출력하는데 입력받은 단만 출력
 */
public class Prob12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prod = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("단 입력:");
		int x = scan.nextInt();
		System.out.printf("--%d단--\n", x);
		
		for(int y = 1; y < 10; y++) {
			prod = x * y;
			System.out.printf(x + "x" + y + "=" + "%d\n", prod);
		}
	}

}
