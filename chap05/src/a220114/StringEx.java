package a220114;

import java.util.Arrays;

public class StringEx {
	public static void main(String[] args) {
		String str1 ="abc";
		String str2 = new String("abc");
		String str3 ="abc";
		String str4 = new String("abc");
		
		System.out.println(str2 == str4);

		
		
		StringEx ex = new StringEx();
		ArrayEx10 arrayEx10 = new ArrayEx10();
		
		
		// 참조자료형은 고유의 리터럴이 존재 하지 않음. 단 배열, 문자열은 제외
		// 문자열 리터럴을 생성하면상수 풀에 등록
		
		System.out.println(str1 == str2.intern());
		System.out.println(str2);
		System.out.println(str2.intern());
		
		String[] strs = new String[3];
		strs[0] =str1;
		strs[1] =str2;
		strs[2] ="abc";
		
		System.out.println(Arrays.deepToString(strs));
		System.out.println(strs[0] == strs[2]);
		System.out.println("abc"== "abc");
				
	}
}
