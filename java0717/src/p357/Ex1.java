package p357;

class A{
	
}

class B extends A{
	
}


public class Ex1 {

	public static void main(String[] args) {
		A a = new B(); //부모타입 변수 b지만 객체생성은 자식클래스 B로 한다 ,자동타입 변환
//		B b = new A(); 
	}
}
