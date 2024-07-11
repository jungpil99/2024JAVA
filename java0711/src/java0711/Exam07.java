package java0711;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run1 = true;
		int balance = 0;
		int sum = 0;
		String id, email, name, num, pno;
		String pwd = "12345";
		Scanner scan = new Scanner(System.in);
		
		while(run1) { //true면 무한루프
			System.out.println("------------------------------------");
			System.out.println("1.회원가입 | 2.로그인 | 3.예금/출금 | 4.종료");
			System.out.println("------------------------------------");
			System.out.print("선택>");
			int menuNum = Integer.parseInt(scan.nextLine());
			
			switch(menuNum) {
			case 1:
				System.out.println("[필수 정보 입력]");
				System.out.print("이름>");
				name = scan.nextLine();
				System.out.print("주민번호>");
				num = scan.nextLine();
				System.out.print("전화번호>");
				pno = scan.nextLine();
				
				System.out.println("[입력된 내용]");
				System.out.println("이름:" + name);
				System.out.println("주민번호:" + num);
				System.out.println("전화번호:" + pno);
				
				System.out.println("회원가입 성공");
				break;
			case 2:
				System.out.print("아이디>");
				id = scan.nextLine();
				System.out.print("비밀번호>");
				pwd = scan.nextLine();
				
				if(pwd.equals("12345")) {
					System.out.println("로그인 성공");
				}else {
					System.out.println("로그인 실패:패스워드가 다름");
				}
				break;
			case 3:
				boolean run2 = true;
				
				while(run2) {
					System.out.println("-----------------------------");
					System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
					System.out.println("-----------------------------");
					System.out.print("선택>");
					int subNum = Integer.parseInt(scan.nextLine());
					
					switch(subNum) {
					case 1:
						System.out.print("예금액>");
						balance += Integer.parseInt(scan.nextLine());
						break;
					case 2:
						System.out.print("출금액>");
						balance -= Integer.parseInt(scan.nextLine());
						break;
					case 3:
						sum = balance;
						if(sum < 0) {
							sum = 0;
						}
						System.out.println("잔액>" + sum);
						break;
					case 4:
						run2 = false;
						break;
					}
				}
				break;
			case 4:
				run1 = false;
				System.out.println("프로그램 종료");
				break;			
			}
		}
	}
}
