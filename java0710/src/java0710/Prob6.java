package java0710;

import java.util.Scanner;

public class Prob6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 입력:");
		int x = scan.nextInt();
		
		if(x >= 0) {
			System.out.printf("%d",x);
		}else if (x < 0) {
			int abs = Math.abs(x);
			System.out.printf("%d", abs);
		}
	}

}
