package java0709;

import java.util.Scanner;

/**
 * 두개의 값을 받아서 큰수를 출력
 */
public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 값:");
		String input = scan.nextLine();
		int x = Integer.parseInt(input);
		
		System.out.print("두번째 값:");
		input = scan.nextLine();
		int y = Integer.parseInt(input);
		
		if(x > y) {
			System.out.printf("%d\n", x);
		}else if(x == y) {
			System.out.printf("0");
		}else {
			System.out.printf("%d\n", y);
		}
					
	}

}
