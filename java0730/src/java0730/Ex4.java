package java0730;

import java.util.Arrays;
import java.util.List;

public class Ex4 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("asd", "qwe", "zxc");
		list.forEach(System.out::println);
	}

}
