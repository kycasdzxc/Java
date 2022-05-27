package a220112;

public class PrimeNumber {
	public static void main(String[] args) {

		// 소수 : 1과 자기자신만으로 나누어 떨어지는 숫자
		// >>> 약수의 갯수를 2개
		// 약수 : 자신의 숫자 이하의 자연수 중 나누어 떨어지는 숫자
		
		// 6 : 1, 2, 3, 6
		
		System.out.println(6%1);
		System.out.println(6%2);
		System.out.println(6%3);
		System.out.println(6%4);
		System.out.println(6%5);
		System.out.println(6%6);
		System.out.println("================");
		
		// 30번의 소수를 만날 때까지
		for (int num = 2, cnt = 0 ; cnt < 30 ; num++) {
		boolean flag = false;
			for (int i = 2 ; i < num ; i++) {
				if (num % i == 0) {
	//					System.out.printf("숫자 %d는 %d로 나누었을 때 나머지 %d%n", num, i, num % i);
					flag = true;
					break;
				}
			}
			if (!flag) {
				cnt++;
//				System.out.println(num + "은(는)" + (flag ? "소수아님" : "소수"));
				System.out.println(cnt + " : " + num);
			}
		} 
		
//		int count = 0;
//		while (count < 10) { // 이게 먹히지가 않습니다..
//			for (int i = 2; i <= 120; i++) {
//				for (int j = 2; i >= j; j++) {
//
//					if (i == j) {
//						System.out.println(i);
//						count += 1; // count 개수
//						break;
//
//					} else if (i % j == 0) {
//						break;
//					} 
//				}
//			}
//		}
//		System.out.println(count);
	}
}
