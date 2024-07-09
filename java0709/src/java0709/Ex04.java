package java0709;

import java.util.Scanner;

public class Ex04 {

	public static int getCount(String msg, Scanner sc) {
		System.out.print(msg);
		String input = sc.nextLine();
		return Integer.parseInt(input);
		
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int apple = getCount("사과의 개수:", scan);
		//System.out.print("사과의 개수:");
		//String input = scan.nextLine();
		//int apple = Integer.parseInt(input);
		
		int people = getCount("인원수:", scan);
		//System.out.print("인원수:");
		//input = scan.nextLine();
		//int people = Integer.parseInt(input);
		
		int remainder = apple % people;
		System.out.printf("남은 사과의 개수: %d\n", remainder);
	
		int result = apple / people;
		System.out.printf("먹은 사과의 개수: %d\n", result);
		
	}

}
