package java0711;

import java.util.Scanner;

/**
 *1부터 n까지의 합과 그 합을 구하는 과정을 출력하는 프로그램 
 */
public class Prob4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int n;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("n의 값 : ");
			n = scan.nextInt();
		}while(n <= 0);
		
		for (int i = 1; i <= n; i++) {
			if(i < n) {
				System.out.println(i + "+");
			}else {
				System.out.println(i + "=");
			}
			
			sum += i;
		}
		
		System.out.println(sum);
	}

}
