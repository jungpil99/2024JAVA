package java0712;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] array = {{95, 86}, //2
				          {83, 92, 96}, //3
				          {78, 83, 93, 87, 88}}; //5
		
		System.out.println(array.length); // 3  전체 덩어리 개수라 보면 되고 
		System.out.println(array[0].length); // 2 각각의 덩어리 안의 개수 
		System.out.println(array[1].length); // 3 
		System.out.println(array[2].length); // 5
		
		/*for (int i =0; i < array.length; i++) {
			for (int j =0; j < array[i].length; j++) {// array[i].length i에 대해 length가 있는
				System.out.println(array[i][j]);
			}
		}*/
		
		
	}

}
