package java0712;

import java.util.Scanner;

/**
 * 2차원 배열을 이용하여 국어점수와 수학점수를 입력받아서 학생별 총점과 평균을 출력 
 */
public class Prob1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0;
		double avg = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("학생수:");
		int num = Integer.parseInt(scan.nextLine());
		
		double scores [][] = new double [num][4];
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println(i+"번째 학생");
			System.out.print("국어 점수: ");
			scores[i][0] = Double.parseDouble(scan.nextLine());
			
			System.out.print("수학 점수: ");
			scores[i][1] = Double.parseDouble(scan.nextLine());
			
			sum += scores[0][1]; //총점
			scores[i][2] = sum;
			
			avg = sum / 2; //평균
			scores[i][3] = avg;
		}
		System.out.print("\t국어\t수학\t총점\t평균\n");
		System.out.println("-------------------------------------"); 
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%d번 학생\t%3.2f, %3.2f, %3.2f, %3.2f\n",
					i+1, scores[i][0], scores[i][1], scores[i][2], scores[i][3] );
		}

	}

}
