package a220207;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class LinkedTest {
	public static void main(String[] args) {
		List<Integer> List = new LinkedList<Integer>();
		LinkedList<String> strings = new LinkedList<String>();
		
		strings.add("1길동");
		strings.add("2길동");
		strings.add("3길동");
		
		System.out.println(strings);
		
		System.out.println(strings.get(1));
		
		System.out.println(strings.remove(1));
		
		System.out.println(strings);
		
		System.out.println(strings.set(1, "4길동")); // 3길동
		
		System.out.println(strings);
		
		// Stack(후입선출), Queue(선입선출)
		
		Stack<String> stack = new Stack<String>();
		// 추가 push() 삭제 pop()
		System.out.println(stack.push("가")); // add와 같음. 명칭만 다름
		System.out.println(stack.push("나"));
		stack.push("다");
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack);

		Queue<String> queue = new LinkedList<String>();
		// 추가 offer() 삭제 poll()
		queue.offer("가"); // add와 같음. 명칭만 다름
		queue.offer("나");
		queue.offer("다");
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue);
	}
}