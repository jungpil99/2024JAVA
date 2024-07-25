package java0725;

import java.util.Arrays;
import java.util.Comparator;

public class StudentEx {

	public static void main(String[] args) {
		Student[] students = {
				new Student("웋린욷", 97),
				new Student("구린둥", 99),
				new Student("안린둥", 87),
				new Student("겇린둥", 96),
				new Student("옹링둥", 85)
		};
		
		Comparator<Student> c = new Comparator<Student>() {
			
			@Override
			public int compare(Student o1, Student o2) {
				return Integer.compare(o2.getScore(), o1.getScore());
			}
		};
		
		Arrays.sort(students, c);
		for (Student st : students) {
			System.out.println(st);
		}
		
	}

}
