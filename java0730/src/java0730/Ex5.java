package java0730;

import java.util.stream.IntStream;

public class Ex5 {

	public static void main(String[] args) {
//		IntStream is = IntStream.range(1, 5);
		int count = 100;
		int sum = IntStream.rangeClosed(1, count).sum();
//		is.forEach(System.out::println);
//		is.forEach(a->{
//			System.out.println(a); 
//		});
		System.out.println(sum);

	}

}
