package a220107;

public class ConditionOper {
	public static void main(String[] args) {
		int i = 0;
		String result = i % 2 == 0 ? "짝수" : "홀수";
		System.out.println(result);
		
		int result2 = i > 0 ? 1 : i == 0 ? 0 : -1;
		System.out.println(result2); // if가 더 직관적이고 내부적 처리가 더 빠르다
		
		// 과제: 윤년 계산 수식 만들기. 4년 100년 400년
		// 자바의정석 예제 챕터3 다 풀기
	
		i = i + 3;
		i = 3 + i;
		
		i += 3; // i = i + 3;
		i += 1;
		i++;
		
		System.out.println(i);
	
		String str = "ABCD";
		str += "가나다라";
		str += "1234";
		System.out.println(str);
		
	}
}
