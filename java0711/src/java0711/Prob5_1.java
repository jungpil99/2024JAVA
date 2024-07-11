package java0711;

import java.util.Scanner;

/**
 *+-기호를 번갈아 출력하는 프로그램을 작성하세요 
 */
public class Prob5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("n의 값:");
			n = scan.nextInt();
		}while(n <= 0);
		
		for (int i = 1; i <= n/2; i++) { //n/2는 몫을 계산
			System.out.print("+-");
		}
		if(n % 2 != 0) { //홀수이면 + 하나를 더찍는조건
			System.out.print("+");
		}
	}

}
