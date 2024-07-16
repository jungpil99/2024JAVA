package dp;

import java.util.Vector;

public class Student {
	private Professor advisor;
	private String name;
	private Vector<Course> courses; //
	
	public Student() {}
	
	public Student(String name) {
//		super(); 부모의 생성자를 호출한다
		this.name = name;
		this.courses = new Vector<Course>(); 
	}
	
	public void registerCourse(Course course) {
		courses.add(course);
	}
	
	public void dropCourse(Course course) {
		if(courses.contains(course)) {
			courses.remove(course);	
		}
	}
	
	
	public String getName() {
		return name;
	}

	public void setAdvisor(Professor advisor) {
		this.advisor = advisor;
	}

	
	@Override
	public String toString() {
		return "Student [advisor=" + advisor + ", name=" + name + ", courses=" + courses + "]";
	}

	public void advise(String msg) {
		System.out.println(msg);
	}
}
