package a220204;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class Prev {
	public static void main(String[] args) {
//		Vector<E>
//		Class<T>
		List<String> list = new ArrayList<String>();
//		ArrayList<E>
//		HashMap<K, V>
		list.add("가");
		list.add("나");
		list.add("가");
		list.add("가");
		list.add("나");
		list.add("가");
		System.out.println(list);
		System.out.println(list.get(2));
		
		// set : 집합
		Set<Integer> set = new HashSet<Integer>();
		set.add(3);
		set.add(2);
		set.add(1);
		set.add(3);
		set.add(2);
		set.add(1);
		System.out.println(set);
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("A", 10);
		map.put("B", 5);
		map.put("C", 20);
		map.put("A", 100);
		System.out.println(map);
		
		Set<String> set2 = map.keySet();
		System.out.println(set2);
		
		list.addAll(set2);
		System.out.println("==================================");
		System.out.println(list);
		System.out.println(list.contains("가"));
		System.out.println(list.contains("다"));
		
		Map<String, String> student = new HashMap<String, String>();
		student.put("no", "220001");
		student.put("name", "김경보");
		student.put("kor", "90");
		student.put("eng", "80");
		student.put("mat", "80");
		System.out.println(student);
		
	}
}
