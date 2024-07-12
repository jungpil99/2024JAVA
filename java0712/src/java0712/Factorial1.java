package java0712;

public class Factorial1 {
	public static int fac2(int n) {// 재귀호출 메서드 (recursive)
		if (n == 0) {
			return 1;
		}else {
			return n * fac(n-1);
		}
	}
	
	public static int fac(int n) {
		int res = 1;
		for (int i = 1; i <= n; i++ ) {
			res = res * i;
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 4;
		int result = fac2(num);
		System.out.println(result);
	}

}
