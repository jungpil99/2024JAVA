import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcEx3 {
	
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
		String URL = "jdbc:mysql://localhost:3307/spring5fs";
		Connection conn = null;
		Statement stmt = null;
		String sql = "insert into dept (deptno, dname, loc) values (1001 , '영업부', '서울'), (1002 , '총무부', '인천'),"
				+ "(1003 , '인사부', '일산'), (1004 , '회계부', '서울')";
//		System.out.print("부서번호: ");
//		int deptno = Integer.parseInt(scan.nextLine());
//		System.out.print("부서명: ");
//		String dname = scan.nextLine();
//		System.out.println("지역: ");
//		String loc = scan.nextLine();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(URL, "root", "mysql");
			System.out.println("접속 성공");
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("쿼리 성공");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
