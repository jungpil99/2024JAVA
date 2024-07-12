package java0711;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int scores[]; //이것만 선언하면 메모리에 값을 넣을 장소가 없다 
		int scores[] = {83, 90, 87}; //초기화를 하기는 했는데 값을 넣어준것
		int scores2[] = new int[] {83, 90, 87}; //[]안에 숫자 값을 쓰면 오류, 위에것과 같은방식
		
		double sum = 0;
		double avg = 0;
		
		//System.out.println(scores[4]); //크기는 3개인데 4개를 불러오려 해서 오류
		System.out.println(scores[scores.length-1]); //length를 그냥 불러오려하면 안되고 -1을 해주어야함
		
		for (int i = 0; i < scores.length; i++) {//배열이 자기 인덱스 길이 정보를 가지고 있다
			System.out.println(scores[i]);
			sum += scores[i];
			avg = sum / scores.length;
		}
		System.out.println(sum);
		System.out.println(avg);
		
		int myArr [] = new int [5]; //[]의 위치는 상관없음 new 명령어와 함께 0으로 초기화 , 배열 생성(초기화)
		
		for (int i = 0; i < 5; i++) {
			System.out.println(myArr[i]);
		}
		
		double myArr2[] = new double[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.println(myArr2[i]);
		}
		
		boolean myArr3[] = new boolean[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.println(myArr3[i]);
		}
		
		int MyArr4[] = new int[] {12,22,33,44,55};
		System.out.println(MyArr4[4]); //4가 55이니까 그럼 배열은 Arr[1]부터가 아니라 Arr[0]부터 시작한다 Arr[0]이 12
		
	}

}
