package java0710;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		for(;;) {
			System.out.print("명령>");
			String input = scan.nextLine();
			if(input.equalsIgnoreCase("q")) {
				break;
			}
		}
		System.out.println("끝");
	}

}
