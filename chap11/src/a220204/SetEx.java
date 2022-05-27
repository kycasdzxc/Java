package a220204;

import java.util.HashSet;
import java.util.Set;

public class SetEx {
	public static void main(String[] args) {
		// Set : 집합
		
		// 교집합, 합집합, 차집합
		
		Set<String> set1 = new HashSet<String>();
		set1.add("사과");
		set1.add("바나나");
		
		Set<String> set2 = new HashSet<String>();
		set2.add("포도");
		set2.add("바나나");
		
		System.out.println("set1 : " + set1);
		System.out.println("set2 : " + set2);
		
		// 교집합
		Set<String> result = new HashSet<String>(set1); // clone		
		result.retainAll(set2);
		System.out.println("교집합 : " + result);
		
		// 합집합
		result = new HashSet<String>(set1);		
		result.addAll(set2);
		System.out.println("합집합 : " + result);

		// 차집합
		result = new HashSet<String>(set1);		
		result.removeAll(set2);
		System.out.println("차집합 : " + result);
	}
}
