package java0711;

import java.util.Scanner;

/**
 * 1부터 n 까지의 숫자의 합 
 */
public class Prob2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int n;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("n의 값: ");
			n = scan.nextInt();
		}while(n <= 0);
		
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
