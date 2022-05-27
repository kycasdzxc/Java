package a220204;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapEx {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		System.out.println(map.isEmpty());
		map.put("가", "A");
		map.put("나", "B");
		map.put("다", "C");
		map.put("라", "C");
		
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		
		// Set keySet(), Set entrySet(), Collection values()
		Set<String> result1 = map.keySet();
		System.out.println(result1);
		
		Collection<String> c = map.values();
		System.out.println(c);
		
		List<String> l = new ArrayList<String>(c);
		Set<String> s = new HashSet<String>(c);
		
		System.out.println("l : " + l);
		System.out.println("s : " + s);
		
		Set<Map.Entry<String, String>> entrySet = map.entrySet();
		System.out.println(entrySet);
		
		for (String str : result1) {
			System.out.println(str);
		}
		
		for(Map.Entry<String, String> e : entrySet) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
	}
}