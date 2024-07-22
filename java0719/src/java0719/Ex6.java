package java0719;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex6 {

	public static void main(String[] args) {
		String sql = "select * from customer";
		
		String URL = "jdbc:mysql://localhost:3306/spring5fs";
		Connection con = null;
		Statement stmt =null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, "spring5", "spring5");
			System.out.println("Mysql 접속 성공");  
			stmt = con.createStatement(); 
			ResultSet rs = stmt.executeQuery(sql);//자료를 가져오는 메모리의 위치 정보
			while(rs.next()) {
//				System.out.print(rs.getString("customer_id") + ",");
//				System.out.println(rs.getString("customer_name"));
				System.out.print(rs.getString(1) + ","); //1번째 컬럼
				System.out.println(rs.getString(2)); //2번째 컬럼
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
