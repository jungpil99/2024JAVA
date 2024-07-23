package ramda;

public class Ex5 {

	public static void main(String[] args) {
		MyInterf4 myInterf4 = (x, y)-> {
			return x*y;
		};
		int a = myInterf4.method(50, 60);
		System.out.println(a);
	}

}
