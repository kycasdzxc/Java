package a220209;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSetLotto {
	public static void main(String[] args) {
//		Set<Integer> set = new HashSet<>();
		TreeSet<Integer> set = new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2 - o1;
			}
			
		}); // 정렬 set
		while (set.size() < 6) {
			set.add((int)(Math.random() * 45) + 1);
		}
		System.out.println(set);
//		System.out.println(set.descendingSet());
//		List<Integer> list = new ArrayList<>(set);
//		Collections.sort(list);
//		System.out.println(list);
	}
}
