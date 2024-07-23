package sec01.exam05;

public class OutterEx {
	public static void main(String[] ar) {
		Outter outter = new Outter();
		Outter.Nested nested = outter.new Nested();
		nested.print();
	}
}
