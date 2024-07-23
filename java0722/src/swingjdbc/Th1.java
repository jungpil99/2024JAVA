package swingjdbc;

import java.time.LocalTime;

public class Th1 implements Runnable{

	@Override
	public void run() {
		for (;;) {
			LocalTime localTime = LocalTime.now();
			System.out.printf("%d:%d:%d\n",
					localTime.getHour(),localTime.getMinute(),localTime.getSecond());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
