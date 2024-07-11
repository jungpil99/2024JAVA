package java0710;

/**
 *전체 구구단 출력 
 */
public class Prob11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prod = 0;
		for (int i = 1; i < 10; i++) {
			
			for(int y = 1; y < 10; y++) {
				prod = i * y;
				System.out.printf(i + "x" + y + "=" + "%d\t", prod);
			}
			System.out.printf("--%d단--\n", i);
		}
	}
}
