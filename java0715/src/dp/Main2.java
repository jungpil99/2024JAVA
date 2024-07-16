package dp;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student minsu = new Student("민수"); //학생등록
		Course java = new Course("cs100", "자바"); // 코스등록
		Course cplus = new Course("cs100", "C/C++"); // 코스등록
		minsu.registerCourse(java);
		java.addStudent(minsu);
		minsu.registerCourse(cplus);
		cplus.addStudent(minsu);
		
		Student mansu = new Student("만수"); //학생등록
		mansu.registerCourse(java);
		
//		System.out.println(minsu);
//		System.out.println(mansu);
		
		//코스별 신청자 출력
		java.addStudent(mansu);
		System.out.println("자바 수강신청자"+java.getNumOfStudent() +"명"); 
		for (Student student : java.getStudents()) {
			System.out.println(student.getName());
		}
	}

}
