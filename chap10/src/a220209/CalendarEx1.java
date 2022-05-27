package a220209;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarEx1 {
	public static void main(String[] args) throws ParseException {
		Calendar cal = Calendar.getInstance();
//		Calendar cal = new GregorianCalendar();
		
		Date date = new Date();
		
		// epoch : 1970 01 01 00:00:00에서 부터 경과된 ms
		
		System.out.println(cal.getTimeInMillis());
		System.out.println(date.getTime());
		System.out.println(System.currentTimeMillis());
		System.out.println(cal.getTimeInMillis());
		
		Date date2 = cal.getTime();
		System.out.println(date2.getTime());
		
		System.out.println(new Date(70, 0, 1).getTime());
		
		// 날짜 간격 계산
//		cal.get
//		set : 지정, get : 호출
		
		System.out.println(cal.get(1) + "년");
		System.out.println(cal.get(2) + 1 + "월");
		System.out.println(cal.get(5) + "일");
		
//		cal.set(1970, 1, 0, 0, 0, 0);
		cal.set(1, 2000);
		cal.set(Calendar.YEAR, 2000);
		cal.set(Calendar.MONTH, 11);
		cal.set(Calendar.DATE, 25);
		
		System.out.println(cal.get(1) + "년");
		System.out.println(cal.get(2) + 1 + "월");
		System.out.println(cal.get(5) + "일");
		
		date.setYear(100);
		System.out.println(date.getYear() + 1900);
		System.out.println(date.getMonth() + 1);
		System.out.println(date.getDate());
		
//		DateFormat dateFormat = DateFormat.getDateInstance();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(dateFormat.format(System.currentTimeMillis()));
		
		String str = "1998-12-25 16:41:38";
		
		long result = dateFormat.parse(str).getTime();
		
		System.out.println(result);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sdf.parse(sdf.format(result)).getTime());
		
		long past = new Date().getTime() - sdf.parse(sdf.format(result)).getTime();
		System.out.println(past / 1000 / 60 / 60 / 24 / 365d);
		
		Calendar birth = Calendar.getInstance();
		birth.set(1994, 10, 2, 0, 0, 0);
		
		past = System.currentTimeMillis() - birth.getTimeInMillis();
		System.out.println(past);
		System.out.println(past / 1000 / 60 / 60 / 24 / 365d);
	}
}
