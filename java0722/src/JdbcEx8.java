import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcEx8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String URL = "jdbc:mysql://localhost:3307/spring5fs";
		Connection conn = null;
		Statement stmt = null;
//		String sql = "select * from dept where loc = '서울'";
		
		System.out.print("지역: ");
		String str = scan.nextLine();
		String sql = String.format("select * from dept where loc = '%s' ", str);
		System.out.println(sql);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(URL, "root", "mysql");
			System.out.println("접속 성공");
			stmt = conn.createStatement();
			System.out.println("쿼리 성공");
			ResultSet rs = stmt.executeQuery(sql);
//			boolean bb = rs.next();
//			System.out.println(bb);
//			System.out.println(rs.getInt("deptno"));
			if(!rs.next()) {
				System.out.println("정보 없음");  
			}
			int i = 0;
			while(rs.next()) { //rs.next 에의해 반복 구조가 결정됨
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				System.out.printf("%d %s %s\n", deptno, dname, loc);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
