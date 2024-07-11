package java0711;

import java.util.Scanner;

/**
 *3개의 정수값을 입력받아 중앙갑을 구하고 출력 
 */
public class Prob1 {
	public static int med(int a, int b, int c) {
		if((b >= a && c <= a) || (b <= a && c >= a)) {
			return a;
		}else if((a > b && c < b) || (a < b && c > b)) {
			return b;
		}
		return c;
	}
		
		/*if(a >= b) { //a는 b보다 크거나 같다
			if(b >= c) { //b는 c보다 크거나 같다 a >= b >= c
				return b;
			}else if(a <= c) { //a는 c보다 작거나 같다  c >= a >= b
				return a;
			}else { 
				return c;
			}
		}else if(a > c) { // a는 b보다 작다
			return a;
		}else if(b > c) { // a는 b보다 작다
			return c;
		}else { // a는 b보다 작다, a는 c보다 작거나 같다, b는 c보다 작거나 같다
			return b;
		}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int med;
		Scanner scan = new Scanner(System.in);
		System.out.println("x 값 : ");
		int x = scan.nextInt();
		System.out.println("y 값 : ");
		int y = scan.nextInt();
		System.out.println("z 값 : ");
		int z = scan.nextInt();
		System.out.println(med(x,y,z));
		
		/*if(x >= y) {
			if(y >= z) {
				System.out.println(y);
			}else if(x <= z) {
				System.out.println(x);
			}else {
				System.out.println(z);
			}
		}else if(x > z) {
			System.out.println(x);
		}else if(y > z) {
			System.out.println(z);
		}else {
			System.out.println(y);
		}*/
	}

}
