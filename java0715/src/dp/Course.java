package dp;

import java.util.Vector;

public class Course {
	private String id;
	private String name;
//	private Integer numOfStudent = 0; //이렇게 쓰면 메서드를 가짐
	private int numOfStudent = 0;
	private Vector<Student> students; //
	
	public Course(String id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.students = new Vector<Student>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNumOfStudent() {
		return numOfStudent;
	}
	
	public Vector<Student> getStudents() {
		return students;
	}
	
	public void setStudents(Vector<Student> students) {
		this.students = students;
	}
	
	public void addStudent(Student student) {
		students.add(student);
		++numOfStudent;
	}
	
	public void deleteStudent(Student student) {
		if(students.contains(student)) {
			students.remove(student);	
			--numOfStudent;
		}
	}
}
