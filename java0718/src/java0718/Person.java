package java0718;

public class Person{
	private Role role; //메소드를 쓰기 위해서 쓴거
	
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public void doIt() {
		role.doIt();
	}
	
}
