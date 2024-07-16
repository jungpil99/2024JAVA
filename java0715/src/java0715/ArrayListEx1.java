package java0715;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list;  // String list[]; , <String> 제네릭
		list = new ArrayList<String>(); // new String[10]; ,속도는 배열이 조금더 빠름
//		ArrayList<String> list2 = new ArrayList<String>(); //
//		ArrayList<String> list3 = new ArrayList<>();
//	    List<String> list4 = new ArrayList<>(); 

	    list.add("홍길동");
	    list.add("자바");
	    list.add("Hello");
	    
//	    이터레이터 (자바 디자인 패턴)
	    Iterator<String> it = list.iterator(); //반복자
	    while(it.hasNext()) {
	    	String str = it.next();
	    	System.out.println(str);
	    }
	    
//	    for(String str : list) {
//	    	System.out.println(str);
//	    }
	}

}
