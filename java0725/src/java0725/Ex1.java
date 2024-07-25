package java0725;

class Parent {
	int x;
	void method() {
		System.out.println(x);
	}
}

public class Ex1 {

	public static void main(String[] args) {
		Parent parent = new Parent() {//자식 객체

			void method2() {
				System.out.println("가가가가가가");
			}
			
			@Override
			void method() {
				x = 100;
				System.out.println("아아아아아");
				super.method();
				method2();
			} 
			
		};
		
		parent.method();
//		parent.method2(); 
	}

}
