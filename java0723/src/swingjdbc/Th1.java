package swingjdbc;

import java.time.LocalTime;

public class Th1 implements Runnable{

	@Override
	public void run() {
		for (;;) {
			LocalTime localTime = LocalTime.now();
			String.format("%d:%d:%d\n",
					localTime.getHour(),localTime.getMinute(),localTime.getSecond());
			
//			ViewDept.this.setTitle(str);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
