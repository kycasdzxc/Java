package a220203;

import java.util.Arrays;

public class StringMethodEx {
	public static void main(String[] args) {
		String str = "https://search.naver.com/search.naver?where=nexearch&sm=tab_jum&query=%EA%B3%A0%EC%96%91%EC%9D%B4";
		
		String protocol = str.substring(0, str.indexOf("://"));
		System.out.println(protocol);
		
		String domain = str.substring(str.indexOf("://") + 3, str.indexOf("/", str.indexOf("://") + 3));
		System.out.println(domain);
		
		String fileName = str.substring(str.lastIndexOf("/") + 1, str.indexOf("?"));
		System.out.println(fileName);
		
		String parameters = str.substring(str.indexOf("?") + 1);
		System.out.println(parameters);
		
		String[] params = parameters.split("&");
		System.out.println(Arrays.toString(params));
		
		for (String s : params) {
			System.out.println("key : " + s.split("=")[0]);
			System.out.println("value : " + s.split("=")[1]);
		}
	}
}