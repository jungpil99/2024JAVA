package projcet1_1;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member mb = null;
		Member[] list = {
				new Member("강하나", "990611", "010-1234-1234"),
				new Member("나하나", "990712", "010-1234-1236"),
				new Member("오하나", "990616", "010-1234-1235"),
		};
		for (Member member : list) {
			System.out.println(member);
		}
        int find = -1; // 찾기 전 또는 못 찾았을 때
		
		for (int i = 0; i < list.length; i++) {
			if (list[i].name.equals("강하나") && list[i].ssn.equals("990611")) {
				find = i;
				mb = list[i];
				break;
			}
		}
		System.out.println("인덱스:"+find);
		System.out.println(mb);
	}

}
