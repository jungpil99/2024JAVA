package ramda;

public class Ex4 {

	public static void main(String[] args) {
		MyInterf3 myInterf3 = (x, y) ->{
			System.out.println(x + y);
			System.out.println(y * x);
		};
		
		myInterf3.method(50, 30);
	}

}
