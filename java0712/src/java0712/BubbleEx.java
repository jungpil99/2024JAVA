package java0712;

public class BubbleEx {

	public static void printArr(int a[]) {
		for (int c : a) { //a는 배열의 이름 for-each, 향상된 for 문
			System.out.print(c+",");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10, 3, 1, 4, 2 }; //소트 한다는게 정렬을 하는것 배열을 대상으로 많이 함
		
		for (int i = 0; i < a.length-1; i++) {
			for (int j = a.length-1; j > i; j--) { //j는 맨 마지막, j를 i번째까지 
				if (a[j] < a[j-1]) {
					// swap
					int tmp = a[j];
					a[j] = a[j-1];
					a[j-1] = tmp;
					System.out.print("\t교환(j-1="+(j-1)+", j="+j+")");
					printArr(a);
				}
			}
			printArr(a);
		}
		
		printArr(a);
		//for (int i =0; i < a.length; i++) {
			//System.out.print(a[i]+",");
		//}
		System.out.println();
	}

}
