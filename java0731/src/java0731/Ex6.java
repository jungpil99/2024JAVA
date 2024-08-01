package java0731;

import java.util.Arrays;
import java.util.List;

public class Ex6 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("홍순조", "박태평", "황새치", "홍구방", "홍구방");
		
		names.stream().limit(3).forEach(n -> System.out.println(n));
		
//		names.stream().distinct().forEach(n -> System.out.println(n));
//		System.out.println(); 
		
//		names.stream().filter(n -> n.startsWith("홍")).forEach(n -> System.out.println(n));
//		System.out.println();
		
//		names.stream().distinct().filter(n -> n.startsWith("박")).forEach(n -> System.out.println(n));
	}

}
