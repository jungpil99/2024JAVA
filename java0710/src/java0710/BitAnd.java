package java0710;

public class BitAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = -10;
		System.out.printf("[%32s] %d\n", Integer.toBinaryString(a),a);
		System.out.printf("[%32s] %d\n", Integer.toBinaryString(b),b);
		System.out.printf("[%32s] %d\n", Integer.toBinaryString(a&b),a&b); // Bit 끼리 And가 된다
		System.out.printf("[%32s] %d\n", Integer.toBinaryString(a|b),a|b);
	}

}
