package java0710;

import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수 입력:");
		int x = scan.nextInt();
		String score = (x >= 90) ? "A": 
			(x >= 80) ? "B": 
				(x >= 70) ? "C": 
					(x >= 60) ? "D": "F";
		System.out.println(score);
		
		
		/*switch(x / 10) { //몫 계산
		case 10:
		case 9:
			score = "A";
			System.out.printf("학점은" + score);
			break;
		case 8:
			score = "B";
			System.out.printf("학점은" + score);
			break;
		case 7:
			score = "C";
			System.out.printf("학점은" + score);
			break;
		case 6:
			score = "D";
			System.out.printf("학점은" + score);
			break;
		default:
			score = "F";
			System.out.printf("학점은" + score);
		}*/
	}

}
