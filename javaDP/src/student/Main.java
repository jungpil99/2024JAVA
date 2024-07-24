package student;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		StudentClass studentClass = new StudentClass(3);
		studentClass.appendStudent(new Student("강상추", "2400157", 80));
		studentClass.appendStudent(new Student("바상추", "2400468", 60));
		studentClass.appendStudent(new Student("오상추", "2401556", 89));
		
		Iterator<Student> it = studentClass.iterator();
		while(it.hasNext()) {
			Student student = it.next();
			System.out.println(student);
		}
		System.out.println("---------------------");
		
		for (Student student : studentClass) {
			System.out.println(student); 
		}

	}

}
