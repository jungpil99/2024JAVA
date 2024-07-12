package java0712;

public class SearchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10, 3, 1, 2, 4};
		int val = 4;
		int find = -1; // 찾기 전 또는 못 찾았을 때
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == val) {
				find = i;
				break;
			}
		}
		System.out.println();
	}

}
