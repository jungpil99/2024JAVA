package java0729;

class ThreadB extends Thread{

	public ThreadB() {
		this.setName("ThreadB");
	}
	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(this.getName());
		}
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

public class ThreadEx1 {

	public static void main(String[] args) {
		Thread mThread = Thread.currentThread();
		System.out.println(mThread.getName());
		
		
		ThreadA threadA = new ThreadA();
		threadA.start();
		
		ThreadB threadB = new ThreadB(){
			
		};
		threadB.start();
		
		Thread threadC = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 2; i++) {
					System.out.println("threadC");
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		threadC.start();
		
	}

}
