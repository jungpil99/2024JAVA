package java0718;

public abstract class Phone { //클래스가 할수 있는건 다할수 있지만 객체 생성만 못한다
	String name;
	void turnOn() {
		System.out.println("폰 켜기");
	}
	abstract void turnOff(); //추상 메소드
}
