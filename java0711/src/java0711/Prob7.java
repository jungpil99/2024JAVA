package java0711;

import java.util.Scanner;

/**
 * 2자리 양수를 입력받는 프로그램
 */
public class Prob7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("n의 값:");
		    n = scan.nextInt();
		}while(n < 10 || n > 99);
		
		System.out.print("변수n값은" + n + "입니다");
	}

}
