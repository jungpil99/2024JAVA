package java0730;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Ex6 {
	
	public static void main(String[] ar) {
		String URL = "jdbc:mysql://localhost:3307/spring5fs";
		List<Score> list = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "select * from Score";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(URL, "root", "mysql");
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				int num = rs.getInt("num");
				String name = rs.getString("name");
				int kor = rs.getInt("kor");
				int eng = rs.getInt("eng");
				int math = rs.getInt("math");
				int sum = kor + eng + math;
				list.add(new Score(num, name, kor, eng, math));
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		list.stream().forEach(System.out::println);
		
		int korSum = list.stream().mapToInt(s->s.getKor()).sum();
        System.out.println("국어 총점: "+ korSum);
        
        OptionalDouble korAvg = list.stream().mapToInt(s->s.getKor()).average();
        korAvg.ifPresent(avg -> System.out.println("국어 평균: " + avg));
        //===============================================================
        int engSum = list.stream().mapToInt(s->s.getEng()).sum();
        System.out.println("영어 총점: "+ engSum);
        
        OptionalDouble engAvg = list.stream().mapToInt(s->s.getEng()).average();
        engAvg.ifPresent(avg -> System.out.println("영어 평균: " + avg));
        //===============================================================
        int totSum = list.stream().mapToInt(s->s.getSum()).sum();
        System.out.println("전체 총점: "+ totSum);
        
        OptionalDouble totAvg = list.stream().mapToDouble(s->s.getAvg()).average();
        totAvg.ifPresent(avg -> System.out.println("전체 평균: " + avg));
	}
}
