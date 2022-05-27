package a220111;

public class FlowEx18 {
	public static void main(String[] args) {
		for(int i = 2 ; i <= 3 ; i++) {
			for(int j = 1 ; j <= 3 ; j++) {
				System.out.printf("%d x %d = %d%n", i, j, i * j);
			}
		}
		// 정렬, 탐색
		// 알고리즘 : 측정값
		
		// 2차원 반복문 >> n^2
		// 1차원 반복문 >> n
		
		// (5, 3, 2, 1, 4)
		// 순차탐색 : n
		
		// (88, 77, 63, 34, 22, 21, 10, 2)
		
		// 숫자 1을 찾아라
		// 이진 탐색 n=32 >> 5 n = 64 >> 6
		// n이 1024개 였을 때 >> 10
		// 밑수가 2인 1024의 로그 결과가 10이다.
		// 결론 : 이진탐색의 시간 복잡도는 log n 이다.
		
	}
}
