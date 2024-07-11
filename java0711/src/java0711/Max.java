package java0711;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {15, 63, 10, 72, 98};
		int max = a[0]; 
		//최대값 구하기
		for (int i = 1 ; i < a.length; i++ ) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		//최대값을 출력
		System.out.println("최대값:" + max);
	}

}
