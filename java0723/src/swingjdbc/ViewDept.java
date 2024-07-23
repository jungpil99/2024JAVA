package swingjdbc;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalTime;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ViewDept extends JFrame{
	Connection conn;
	Statement stmt;
	JTextField tf = new JTextField(20);
	JTextArea ta = new JTextArea(15, 40);
	JButton jb = new JButton("조회");
	JFrame jf;
	
	ViewDept(){
//		Wintime wintime = new Wintime();
//		wintime.start();
		jf = this;
		String URL = "jdbc:mysql://localhost:3307/spring5fs";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(URL, "root", "mysql");
			stmt = conn.createStatement();
			
			
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		JPanel jp1 = new JPanel(new FlowLayout());
		
		jp1.add(tf); jp1.add(jb);
		con.add(jp1, BorderLayout.NORTH);
		
		JPanel jp2 = new JPanel();
		jp2.setLayout(new FlowLayout());
		jp2.add(ta);
		con.add(jp2, BorderLayout.CENTER);
		
		Wintime wintime = new Wintime();
		Thread thread = new Thread(wintime);
		thread.start();
		con.add(wintime, BorderLayout.SOUTH);
		
		this.setTitle("테이블");
		this.setBounds(1300, 200, 500, 400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String str = tf.getText();
//				String sql = String.format("select * from dept where loc like '%%%s%%'", str);
				try {
					
					ResultSet rs = stmt.executeQuery(str);
					ResultSetMetaData rsmd = rs.getMetaData();
		            int columnsNumber = rsmd.getColumnCount();
					ta.setText("");
					
//					boolean flag = true;
					while(rs.next()) { //rs.next 에의해 반복 구조가 결정됨
//						flag = false;
						for (int i = 1; i <= columnsNumber; i++) {
		                    if (i > 1) ta.append(",  ");
		                    String columnValue = rs.getString(i);
		                    ta.append(rsmd.getColumnName(i) + ": " + columnValue);
		                }
		                ta.append("\n");
					}
//					if(flag) {
//						JOptionPane.showMessageDialog(jf, "자료 없음","정보", JOptionPane.ERROR_MESSAGE);
//					}
					
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(jf, "자료 없음","정보", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
	}
	
	
	
	public static void main(String[] ar) {
		new ViewDept();
	}
	
	class Wintime extends JPanel implements Runnable{
		JLabel lb;
		Wintime(){
			lb = new JLabel("");
			this.add(lb);
		}
		@Override
		public void run() {
			for (;;) {
				LocalTime localTime = LocalTime.now();
				String str = String.format("%d:%d:%d\n",
						localTime.getHour(),localTime.getMinute(),localTime.getSecond());
				lb.setText(str);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}
}
