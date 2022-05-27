package a220204;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListEx {
	public static void main(String[] args) {
		// toArray() : list >> array
		// Arrays.asList([]) : array >> list
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
		System.out.println(list);
		list.add(2, 5);
		System.out.println(list);
		
		System.out.println(list.indexOf(1));
		list.addAll(list);
		list.addAll(list);
		System.out.println(list); // [1, 2, 5, 3, 4, 1, 2, 5, 3, 4, 1, 2, 5, 3, 4, 1, 2, 5, 3, 4]
		
		System.out.println(list.indexOf(5));
		System.out.println(list.lastIndexOf(5));
		
		System.out.println(list.remove(2));
		System.out.println(list);
		
		list.set(0, 10);
		System.out.println(list);
		
		list.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2 - o1;
			}
		});
		System.out.println(list);
		
		System.out.println(list.subList(3, 5));
	}
}