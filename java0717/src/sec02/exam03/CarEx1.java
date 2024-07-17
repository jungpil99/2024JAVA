package sec02.exam03;

public class CarEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		
		for (int i = 1; i <= 5; i++) {
			TireLoc problemLocation = car.run();
			
			switch (problemLocation) {
			 case FrontLeftTire:
				System.out.println("앞왼쪽 HankookTire로 교체");
				car.frontLeftTire = new HankookTire("앞왼쪽", 15); //필드의 다형성
				break;
			 case FrontRightTire:
				System.out.println("앞오른쪽 KumhoTire로 교체");
				car.frontRightTire = new KumhoTire("앞오른쪽", 13); //필드의 다형성
				break;
			 case BackLeftTire:
				System.out.println("뒤왼쪽 HankookTire로 교체");
				car.backLeftTire = new HankookTire("뒤왼쪽", 14); //필드의 다형성
				break;
			 case BackRightTire:
				System.out.println("뒤오른쪽 KumhoTire로 교체");
				car.backRightTire = new KumhoTire("뒤오른쪽", 17); //필드의 다형성
				break;
			 case NoProblem:
				System.out.println("문제 없음");
			}
			System.out.println("----------------------------");
		}
	}

}
