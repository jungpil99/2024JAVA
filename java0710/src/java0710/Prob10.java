package java0710;

/**
 *1부터 100까지의 짝수의 합 출력 
 */
public class Prob10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int x = 2; x < 101; x+=2) {
			sum += x;
		}
		System.out.println(sum);

	}

}
