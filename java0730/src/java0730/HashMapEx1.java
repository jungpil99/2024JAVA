package java0730;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx1 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		System.out.println(map.size());
		System.out.println(map.get("홍길동"));
		
		Set<String> ks =  map.keySet();
		for(String str : ks) {
			System.out.println(str);
			System.out.println(map.get(str));
		}
		
		Set<Map.Entry<String, Integer>> es = map.entrySet();
		for(Map.Entry<String, Integer> me : es) {
			String m = me.getKey();
			Integer e = me.getValue();
//			System.out.println(m + "," + e);
			String msg = MessageFormat.format("{0}, {1}", m, e);
			System.out.println(msg);
		}
	}

}
