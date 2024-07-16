package dp2;

public class Transcript {
	private Course course;
	private Student student;
	private String date;  //학기 정보
	private String grade; //학점
	
	public Transcript(Course course, Student student, String date, String grade) {
		super();
		this.course = course;
		this.student = student;
		this.date = date;
		this.grade = grade;
	}
	
	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getDate() {
		return date;
	}

	
	public void setDate(String date) {
		this.date = date;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getGrade() {
		return grade;
	}

	@Override
	public String toString() {
		return "Transcript [course=" + course + ", student=" + student + ", date=" + date + ", grade=" + grade + "]";
	}
	
	
}
