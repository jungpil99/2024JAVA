package java0711;

import java.util.Scanner;

/**
 * 정수 a, b를 포함하여 그사이의 모든 정수의 합을 구하여 반환하는 메서드 
 */
public class Prob3 {
	public static int sumOf(int a, int b) {
		int sum = 0;
		int max = 0;
		int min = 0;
		
		if(a < b) {
			max = a; min = b;
		}else {
			min = b; max = a;
		}
		
		for (int i = min; i <= max; i++) {
			sum += i;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumOf;
		Scanner scan = new Scanner(System.in);
		System.out.println("a:");
		int a = scan.nextInt();
		System.out.println("b:");
		int b = scan.nextInt();
		
		System.out.println(sumOf(a,b));
	}

}
