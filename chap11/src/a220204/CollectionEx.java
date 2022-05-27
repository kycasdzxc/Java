package a220204;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionEx {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		c.add("가");
		c.add("A");
		c.add("A");
		c.add("A");
		c.add("B");
		
		System.out.println(c);
		c.remove("A");
		c.remove("C");
		System.out.println(c.remove("A"));
		System.out.println(c.remove("C"));
		
		System.out.println(c);
		Object[] s = c.toArray();
		System.out.println(Arrays.toString(s));
		
		String[] sArr = new String[c.size()];
		c.toArray(sArr);
		System.out.println(Arrays.toString(sArr));
		// .length : 배열
		// .length() : 문자열
		// .size() : 컬렉션
		
		ArrayList list = new ArrayList(); // <> 사용하지 않아도 됨. 타입을 지정하지 않는 것.
		 // 하지만 이러면 불러올 때 캐스팅 다 해줘야 함.
		list.add("가");
		list.add(1);
		list.add(new CollectionEx());
		list.add(1.1);
		
		System.out.println(list);
		
	}
}
