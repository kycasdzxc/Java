package a220209;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Bingo {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		while (set.size() < 25) {
			set.add((int)(Math.random() * 50) + 1);
		}
		int cnt = 0;
		Iterator<Integer> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.printf("%3d", iter.next());
			if(cnt++ % 5 == 4) {
				System.out.println();
			}			
		}
		System.out.println("===============");
		
		for(Integer i : set) {
			System.out.printf("%3d", i);
			if(cnt++ % 5 == 4) {
				System.out.println();
			}
		}
	}
}
