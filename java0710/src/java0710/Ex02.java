package java0710;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// & && 둘다 true일때 true
		// | || 하나만 true여도 true
		
		String str1 = new String("바나나");
		String str2 = new String("바나나");
		boolean result2 = str1.equals(str2);
		System.out.println(result2);
		
		int num1 = 10;
		int num2 = 10;
		boolean result1 = num1 == num2;
		System.out.println(result1);
		
		int x = 0;
		int y = ++x; //더하고 나서 값을 줄거냐
		//int y = x++; //값을 먼저 주고 더할거냐
		//x = x + 1;
		System.out.println(x);
		System.out.println(y);
	}

}
