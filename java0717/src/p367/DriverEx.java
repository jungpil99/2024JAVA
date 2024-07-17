package p367;

import java.util.Scanner;

public class DriverEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("차량을 선택하세요(1:버스, 2:택시)");
		int num = scan.nextInt();
		
		Driver driver = new Driver();
		Vehicle v1 = null;
		switch (num) {
		    case 1: v1 = new Bus();
		        break;
		    case 2: v1 = new Taxi();
		        break;
		    default:
		    	System.out.println("선택 오류");
		}
		
		driver.drive(v1);
	}

}
