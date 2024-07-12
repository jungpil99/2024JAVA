package project1;

import java.util.Scanner;

public class project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member = null;
		boolean run1 = true;
		int balance = 0;
		String id, email, name, num, pno, pwd;
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
				//객체 생성
				
				member = new Member(name, num, pno);
				System.out.println("회원가입 성공");
				break;
			case 2:
				System.out.print("아이디>"); //출력문
				id = scan.nextLine(); //name 변수값 입력
				System.out.print("비밀번호>");
				pwd = scan.nextLine(); // num 변수값 입력
				
				if(id.equals(member.name)) {
					if(pwd.equals(member.num)) {
						System.out.println("로그인 성공");
					}else {
						System.out.println("로그인 실패:패스워드가 틀림");
					}
				}else {
					System.out.println("로그인 실패:아이디가 존재하지 않음");
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
						System.out.print("예금액> ");
						balance += Integer.parseInt(scan.nextLine());
						member.balance += balance;
						break;
					case 2:
						System.out.print("출금액> ");
						balance -= Integer.parseInt(scan.nextLine());
						member.balance -= balance;
						break;
					case 3:
						System.out.print("잔액> ");
						System.out.println(balance);
						break;
					case 4:	
						run2 = false;
						break;
					default:
						System.out.println();
						break;
					}
					
				}
				break;
			case 4:
				run1 = false;
				System.out.println("프로그램 종료");
				break;	
			default:
				System.out.println();
			}
		}
	}
}
