package project1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Project3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("DEPTNO: " );
		int DEPTNO = Integer.parseInt(scan.nextLine());
		
		
		
		String sql = "INSERT INTO `dept` (`DEPTNO`, `DNAME`, `LOC`) VALUES";
		String URL = "jdbc:mysql://localhost:3306/spring5fs";
		Connection con = null;
		Statement stmt =null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, "spring5", "spring5");
			System.out.println("Mysql 접속 성공");  
			stmt = con.createStatement(); 
			int num = stmt.executeUpdate(sql);
			System.out.println("테이블 삽입" + num);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
