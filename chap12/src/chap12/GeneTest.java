package chap12;

import java.util.ArrayList;
import java.util.List;

public class GeneTest {
	public static void main(String[] args) {
		// Box1
		Box1 box1 = new Box1();
		box1.setItem(1);
		int result = (int)box1.getItem();
		System.out.println(result);
		box1.setItem("홍길동");
		String str = (String)box1.getItem();
		System.out.println(str);
		box1.setItem(box1);
		System.out.println((Box1)((Box1)box1.getItem()).getItem());
		System.out.println(box1);
		
		// Box2
		Box2<String> box2 = new Box2<>();
		box2.setItem("고길동");
		String str2 = box2.getItem();
		box2.setItem(10+"");
		result = Integer.parseInt(box2.getItem());
		System.out.println(result);
		
		Box2<Object> box22 = new Box2<>();
		Box2 box23 = new Box2();
		Box2<?> box24 = new Box2<>(); // 초기값 지정에만 가능. 생성자처럼
		
		List<String> list = new ArrayList<>();
		list.add("가");
		list.add("나");
		list.add("다");
		
		List<?> list2 = new ArrayList<>(list);
//		list2.add("라"); >> 값 추가 불가
		list.forEach(System.out::println);
	}
}

class Box1 {
	private Object item;

	public Object getItem() {
		return item;
	}

	public void setItem(Object item) {
		this.item = item;
	}
}

class Box2<T> {
	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
}