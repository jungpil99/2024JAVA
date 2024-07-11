package java0710;

import java.util.Scanner;

/**
 *3개의 값을 입력받아 최대값을 구하기 
 */
public class Prob4 {

	public static int maxNum(int x, int y, int z) {
		int max = 0;
		
		if(x > y) {
			max = x;
		}else if(y > z) {
			max = y;
		}else if(z > x) {
			max = z;
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("3개의 수를 입력:");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		System.out.printf("최대값은 %d\n",maxNum(a,b,c));
	}

}
