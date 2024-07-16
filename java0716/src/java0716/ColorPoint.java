package java0716;

public class ColorPoint extends Point{

	public ColorPoint() {
		super(100, 200);
		System.out.println("자식 기본 생성자 호출");
		System.out.println(x); //부모가 갖고 있는 필드를 가져다씀, super를 생략해서 써도됨
		method1();
		
	}
	
	public ColorPoint(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	void method1() {
		
		System.out.println("자식이 오버라이딩");
		super.method1();
	}
}
