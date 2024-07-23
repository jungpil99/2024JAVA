package java0723;

public class A {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	static class B{
		void method() {
//			field1 = 10;
//			method1();
			
			field2 = 10;
			method2();
		}
	} //중첩 클래스
	
	public static void main(String[] ar) {
		A.B b = new A.B();
		b.method();
//		System.out.println(A.field2); //static 메소드
//		System.out.println(field1);
//		A a = new A(); //객체 생성을 하고 
//		System.out.println(a.field1); //생성한 객체로 부른다
//		A.B b = a.new B();
//		b.method();
	}
}
