package java0710;

import java.util.Scanner;

/**
 * 2개의 숫자를 입력받아 더 큰 숫자를 출력
 */
public class Prob3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str1, str2;
		int x = 0;
		int y = 0;
		int result = 0;
		String inputData;
		
		for (;;) {
			System.out.print("숫자1 입력:");
			str1 = scan.nextLine();
			
			System.out.print("숫자2 입력:");
			str2 = scan.nextLine();
			
			x = Integer.parseInt(str1);
			y = Integer.parseInt(str2);
			
			if(x > y) {
				result = x;
			}else if(x == y) {
				result = 0;
			}else {
				result = y;
			}
			
			System.out.println(result);
			
		}
		

	}

}
