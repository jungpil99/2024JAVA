package java0709;

import java.util.Scanner;

/**
 * 입력받은 숫자가 양수일때 양수로 음수일때 양수로 출력
 */
public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하시오:");
		int a = scan.nextInt();
		
		if( a > 0) {
			System.out.printf("%d", a);
		}else {
			int abs = Math.abs(a);
			System.out.printf("%d", abs);
		}
		
	}

}
