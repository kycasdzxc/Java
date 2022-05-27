package a220203;

public class StringBufferTest2 {
	public static void main(String[] args) {
		// 성능 테스트
		String str = new String();
		
		long start = 0;
		long end = 0;
		
		start = System.currentTimeMillis();
		
		for (int i = 0 ; i < 100000 ; i++) {
			str += "0";
		}
		end = System.currentTimeMillis();
		
		System.out.println(end - start + "ms");
		
		StringBuffer sb = new StringBuffer();
		
		start = System.currentTimeMillis();
		
		for (int i = 0 ; i < 100000 ; i++) {
			sb.append("0");
		}
		end = System.currentTimeMillis();
		
		System.out.println(end - start + "ms");
		
		StringBuilder sb2 = new StringBuilder(); // 멀티 쓰레드를 신경 안써서 빠름
		
		start = System.currentTimeMillis();
		
		for (int i = 0 ; i < 100000 ; i++) {
			sb2.append("0");
		}
		end = System.currentTimeMillis();
		
		System.out.println(end - start + "ms");
	}
}
