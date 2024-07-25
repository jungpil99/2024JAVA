package java0725;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentEx2 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("웋린욷", 97));
		list.add(new Student("구린둥", 99));
		list.add(new Student("안린둥", 87));
		list.add(new Student("겇린둥", 96));
		list.add(new Student("옹링둥", 85));
		
		Comparator<Student> c = new Comparator<Student>() {
			
			@Override
			public int compare(Student o1, Student o2) {
				return Integer.compare(o2.getScore(), o1.getScore());
			}
		};
		
		Collections.sort(list, c);
		System.out.println(list);
	}
	
	

}
