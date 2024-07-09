package java0709;

import java.util.Scanner;

/**
 * 100점만점의 학점을 입력 받아 90점이상이면 A, 80점 이상이면 B, 70점 이상이면 C, 60점 이상이면 D, 60점 미만이면 F를 구하는 프로그램
 * 입력 받은 점수는 0~100점 사이의 값만 넣어야함
 */
public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("점수:");
		int a = scan.nextInt();
		
		String grade;
		
		if(a >= 90) {
			grade = "A";
		}else if (a >= 80) {
			grade = "B";
		}else if (a >= 70) {
			grade = "C";
		}else if (a >= 60) {
			grade = "D";
		}else {
			grade = "F";
		}
		
		System.out.print("학점은" + grade + "입니다");
	}

}
