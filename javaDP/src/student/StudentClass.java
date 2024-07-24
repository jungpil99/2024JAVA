package student;

import java.util.Iterator;

public class StudentClass implements Iterable<Student>{
	private Student[] student;
	private int last = 0;
	
	@Override
	public Iterator<Student> iterator() {
		// TODO Auto-generated method stub
		return new ClassIterator(this);
	}

	public StudentClass(int maxsize) {
		this.student = new Student[maxsize];
	}
	
	public Student getStudentAt(int index) {
		return student[index];
	}
	
	public void appendStudent(Student student) {
		this.student[last] = student;
		last++;
	}
	
	public int getLength() {
		return last;
	}
	
	

}
