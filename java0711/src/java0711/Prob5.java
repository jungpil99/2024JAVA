package java0711;

import java.util.Scanner;

/**
 *+-기호를 번갈아 출력하는 프로그램을 작성하세요 
 */
public class Prob5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("n의 값:");
			n = scan.nextInt();
		}while(n <= 0);
		
		for (int i = 1; i <= n; i++) {
			if(i % 2 == 0) {
				System.out.print("-");
			}else {
				System.out.print("+");
			}
		}
		
	}

}
