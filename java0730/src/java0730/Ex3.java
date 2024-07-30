package java0730;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex3 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("박상순", 100));
		list.add(new Student("고순조", 86));
		list.add(new Student("황새치", 91));
		
		//객체 배열 Arrays.sort 사용
		Collections.sort(list, (s1, s2) -> Integer.compare(s2.getScore(), s1.getScore()));
		
		list.stream().forEach(s->{
			System.out.println(s.getName() + "," + s.getScore());
		});
		
	}

}
