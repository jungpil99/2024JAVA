package java0718;

public class InterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplC implC = new ImplC();
		
		InterA ia = implC;
		ia.methodA();
		
		InterB ib = implC;
		ib.methodB();
		
		InterC ic = implC;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
