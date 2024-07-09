package java0709;

/**
 * 가나다라 
 */
public class Ex02 {

	/**
	 * @param a
	 * @param b
	 */
	public static void swap(int a, int b) {
		int temp = a;
	    a = b;
		b = temp;
		System.out.printf("x=%d, y=%d\n", a, b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10;
		int y = 20;
		System.out.printf("x=%d, y=%d\n", x, y);
		swap(x, y);
		
		//스와핑
		// int temp = x;
		// x = y;
		// y = temp;
		// System.out.printf("x=%d, y=%d\n", x, y);
	}

}
