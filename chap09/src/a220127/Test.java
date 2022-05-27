package a220127;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		long now = System.currentTimeMillis();
		System.out.println(now);
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		System.out.println(format.format(now));
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("희망 진료년도를 입력하세요.");
//		String year = scanner.nextLine();
		String year = "2020";
		System.out.println("희망 진료달을 입력하세요.");
//		String month = scanner.nextLine();
		String month = "2";
		System.out.println(year + month);
		
		Calendar calendar = Calendar.getInstance(); // 현재 시간
		calendar.set(Calendar.YEAR, Integer.parseInt(year));
		calendar.set(Calendar.MONTH, Integer.parseInt(month)-1);
		
		// 현재 입력받은 데이터를 기반
		// 일 정보를 1로 초기화 > 1개월을 더하고 > 하루를 뺌
		calendar.set(Calendar.DATE,1);
		calendar.add(Calendar.MONTH, 1);
		calendar.add(Calendar.DATE, -1);
		
		System.out.println(format.format(calendar.getTime()));
		
		System.out.println(calendar.get(Calendar.DATE));
	}
}
