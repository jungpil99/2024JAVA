package java0711;

import java.util.Scanner;

/**
 * *을 n개 출력하되 w개 마다 줄을 바꿔서 출력하는 프로그램을 작성 
 */
public class Prob6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n;
		int w;
		do {
			System.out.print("n값:");
			n = scan.nextInt();
		}while(n <= 0);
		
		do {
			System.out.print("w값:");
			w = scan.nextInt();
		}while(w <= 0 || w > n);
		
		for (int i = 1; i <= n; i++) {
			System.out.print("*");
			if(i % w == 0) {
				System.out.println(); //줄 바꿈
			}
		}
		if (n % w != 0) {
			System.out.println();
		}
		System.out.println("끝");
	}

}
