package project1;

public class Member {

	String name;
	String num; //주민번호 패스워드
	String pno;
	int balance;
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", num=" + num + ", pno=" + pno + ", balance=" + balance + "]";
	}

	public Member(String name, String num, String pno) {
		super();
		this.name = name;
		this.num = num;
		this.pno = pno;
		this.balance = 0;
	}
	
	public Member() {}
}
