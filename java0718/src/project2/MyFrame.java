package project2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
	
	JLabel la1 = new JLabel("아이디"); JLabel la2 = new JLabel("SSN"); 
	JLabel la3 = new JLabel("전화번호"); JLabel la4 = new JLabel("금액");
	JTextField tf1 = new JTextField(7); JTextField tf2 = new JTextField(7); 
	JTextField tf3 = new JTextField(10); JTextField tf4 = new JTextField(7);
	JTextArea ta = new JTextArea(20,60);
	JButton jb1 = new JButton("로그인"); JButton jb2 = new JButton("회원가입"); JButton jb3 = new JButton("예금");
	JButton jb4 = new JButton("출금"); JButton jb5 = new JButton("잔고");
	List<Member> list;
	Member member;
	MyFrame(){
		
		try (FileInputStream fis = new FileInputStream("c:\\temp\\members.dat");
	             ObjectInputStream ois = new ObjectInputStream(fis)) {
			Member[] list2 = (Member[]) ois.readObject();
			list = new ArrayList<>(Arrays.asList(list2));
			
			System.out.println("파일에서 객체를 가져왔습니다.");
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		for(Member member : list) {
			System.out.println(member);
		}	
		
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel(); 
		JPanel jp3 = new JPanel();
		JPanel jp4 = new JPanel();
		JPanel jp5 = new JPanel();
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		con.add(jp1, BorderLayout.NORTH);
		jp1.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 30));
		jp1.add(la1); jp1.add(tf1); jp1.add(la2); jp1.add(tf2); jp1.add(la3); jp1.add(tf3);
		jp1.add(la4); jp1.add(tf4);
		
		con.add(jp2, BorderLayout.CENTER);
		jp2.setLayout(new FlowLayout());
		jp2.add(ta);
		
		con.add(jp3, BorderLayout.SOUTH);
		jp3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 40));
		jp3.add(jb1); jp3.add(jb2); jp3.add(jb3); jp3.add(jb4); jp3.add(jb5);
		
		con.add(jp4, BorderLayout.WEST);
		
		con.add(jp5, BorderLayout.EAST);
		
		this.setBounds(1100, 200, 700, 500); 
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.addWindowListener(new JFrameWindowClosingEventHandler());
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jb5.addActionListener(this);
	}
	
	class JFrameWindowClosingEventHandler extends WindowAdapter{

		@Override
		public void windowClosing(WindowEvent e) {
			Member[] list2 = list.toArray(new Member[list.size()]);
			try (FileOutputStream fos = new FileOutputStream("c:\\temp\\members.dat");
		             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
				
				 oos.writeObject(list2);
		         System.out.println("객체를 파일에 저장했습니다.");
				
				
			} catch (IOException e1){
				e1.printStackTrace();
			}
			
			super.windowClosing(e);
		}
		
	}
	
	public static void main(String[] args){
		new MyFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()) {
		case "로그인":
			String name = tf1.getText(); // name 변수의 값 입력
			String strPassword = tf2.getText();//패스워드입력
			
			for (Member member2 : list) {
				if(member2.getName().equals(name) && member2.getSsn().equals(strPassword)) {
					member = member2;
					ta.setText("로그인 성공");
					break;
				}
			}
			break;
		case "회원가입" :
			String name2 = tf1.getText();
			String ssn = tf2.getText();
			String phone = tf3.getText();
			
			list.add(new Member(name2, ssn, phone));
			break;
		case "예금" :
			member.deposit(Integer.parseInt(tf4.getText()));
			if (Integer.parseInt(tf4.getText()) <= 0 ) {
				ta.setText("금액을 정확히 입력하세요.");
				return;
			}else {
				ta.setText("예금액: " + tf4.getText());
			}
			break;
		case "출금" :
			member.withdraw(Integer.parseInt(tf4.getText()));
			
			if(Integer.parseInt(tf4.getText()) > member.balance) {
				ta.setText("잔액이 부족합니다");
				return;
			}else if(Integer.parseInt(tf4.getText()) <= 0) {
				ta.setText("0원 및 마이너스 단위는 출금하실 수 없습니다");
				return;
			}else if(Integer.parseInt(tf4.getText()) <= member.balance) {
				ta.setText("출금액: " + tf4.getText());
			}
			
			break;
		case "잔고" :
			ta.setText("잔고: " + member.getBalance());
			break;
		}
	}
}
