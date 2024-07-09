package java0709;

import java.util.Scanner;

/**
 * 3개의 정수값을 받아서 최대값을 구하여 출력
 */
public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 값:");
		int a = scan.nextInt();
		
		System.out.print("두번째 값:");
		int b = scan.nextInt();
		
		System.out.print("세번째 값:");
		int c = scan.nextInt();
		
		int max = 0;
		
		if(a > b) {
			max = a;
		}else if (b > c) {
			max = b;
		}else if (c > a) {
			max = c;
		}
		System.out.printf("최대값은:%d\n", max);
		
	}

}
