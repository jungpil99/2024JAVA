package p337;

public class C extends P{

	C(int x) {
//		System.out.println();
		super(x); //강제적으로 부모의 생성자를 호출해야 한다
//		super.x = 700;
		System.out.println(x);
		method1();
	}

//	@Override //재정의 해주는 친구
//	void method1() {
//		// TODO Auto-generated method stub
//		
//	}
	
}
