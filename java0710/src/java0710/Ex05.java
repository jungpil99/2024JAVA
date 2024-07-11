package java0710;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int balance = 0;
		String id, pwd, email, num;
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------");
			System.out.println("1.로그인 | 2.회원가입 | 3.입금/출금 | 4.종료");
			System.out.println("------------------------------------");
			System.out.println("선택>");
			
			int menuNum = Integer.parseInt(scan.nextLine());
			
			switch(menuNum) {
			case 1: //로그인
				System.out.println("아이디>");
				id = scan.nextLine();
				System.out.println("패스워드>");
				pwd = scan.nextLine();
				break;
			case 2: //회원가입
				System.out.println("아이디>");
				id = scan.nextLine();
				System.out.println("비밀번호>");
				pwd = scan.nextLine();
				System.out.println("이메일>");
				email = scan.nextLine();
				System.out.println("전화번호>");
				num = scan.nextLine();
				break;
			case 3: // 입출금
				System.out.println("-----------------------------");
				System.out.println("1.입금 | 2.출금 | 3.잔액 | 4.종료");
				System.out.println("-----------------------------");
				System.out.println("선택>");
				int subMenu = Integer.parseInt(scan.nextLine());
				
				switch(subMenu) {
				case 1:
					System.out.println("입금액>");
					balance += Integer.parseInt(scan.nextLine());
					break;
				case 2:
					System.out.println("출금액>");
					balance -= Integer.parseInt(scan.nextLine());
					break;
				case 3:
					if(balance < 0) {
						balance = 0;
					}
					System.out.printf("잔액>%d\n", balance);
					break;
				case 4:
					break;
				}
				break;
			case 4: //종료
				run = false;
				break;
			}
			System.out.println("");
		}
		System.out.println("프로그램 종료");
	}	
}


