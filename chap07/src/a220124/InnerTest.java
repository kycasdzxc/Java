package a220124;

import java.util.Arrays;
import java.util.Comparator;

public class InnerTest {
	public static void main(String[] args) {
		// 인스턴스 클래스 1%
		// static 클래스 2%
		// 지역 클래스 1%
		// 익명 클래스 96%
//		Inner inner = new Inner();
		
		class Local { // 지역 클래스
			
		}
		Outer.Inner inner = new Outer().new Inner();
		Outer.SInner inner2 = new Outer.SInner();
		
		Integer[] arr = {3, 5, 2, 1, 4};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return 02 - o1;
			}
		});
		System.out.println(Arrays.toString(arr));
	}
	
	int i;
	
}
class Outer {	
	class Inner { // 인스턴스 클래스
		
	}
	
	static class SInner { // static 클래스
		
	}
}