package a220120;

import java.util.Arrays;

public class FinalTest {
	final int NUMBER; // 비초기화 파이널 변수 >> 1. 초기화 블럭 2. 생성자
	
	FinalTest() {
		NUMBER = 10;
	}
	
	public static void main(String[] args) {
		final int[] arr = {1, 2, 3, 4, 5};
		arr[2] = 10;
		System.out.println(Arrays.toString(arr));
		
//		arr = new int[3]; 불가
		
		final FinalTest test = new FinalTest();
//		test = new FinalTEst(); 불가
		
	}
}
