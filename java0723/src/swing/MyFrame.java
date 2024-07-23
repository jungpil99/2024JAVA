package swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	String[] run = {"run1.gif", "run2.gif", "run3.gif"};
	String[] stand = {"stand.gif"};
	String[] walk = {"walk1.gif", "walk2.gif"};
	JLabel lb1;
	MyFrame(){
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Field field = new Field();
		Control control = new Control();
		this.add(field, BorderLayout.CENTER);
		this.add(control, BorderLayout.SOUTH);
		this.setBounds(1200, 100, 500, 500);
		this.setVisible(true);
		
		Thread thread = new Thread(field);
		thread.start();
	}
	
	private class Field extends JPanel implements Runnable{
		
		Field(){
			this.setLayout(new BorderLayout());
			lb1 = new JLabel();
			lb1.setIcon(new ImageIcon("./src/stand.gif"));
			this.add(lb1, BorderLayout.CENTER);
		}
		@Override
		public void run() {
			while(true) {
				String[] path = stand;
				for(int i = 0; i < path.length; i++) {
					lb1.setIcon(new ImageIcon("./src/" + path[i]));
					System.out.println(i);
					try {
						Thread.sleep(1000);
					}catch(InterruptedException e){}
				}
			}
		}
	}
	
	private class Control extends JPanel implements ActionListener{
		private JButton standingBtn, walkingBtn, runningBtn;
		public Control() {
			this.setLayout(new FlowLayout());
			
			standingBtn = new JButton("Standing");
			walkingBtn = new JButton("Walking");
			runningBtn = new JButton("Running");
			
			standingBtn.addActionListener(this);
			walkingBtn.addActionListener(this);
			runningBtn.addActionListener(this);
			this.add(standingBtn);
			this.add(walkingBtn);
			this.add(runningBtn);
		}
		
		
		@Override
		public void actionPerformed(ActionEvent e) {
			switch(e.getActionCommand()) {
			case "Standing" :
				
			case "Walking" :
				
			case "Running" :
				
			}
			
		}
		
	}
	
	public static void main(String[] ar) {
		new MyFrame();
	}
	
	
}
