package chap16;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class NetworkEx1 {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress ip = null;
		InetAddress[] ipArr = null;
		
		ip = InetAddress.getByName("www.naver.com");
		System.out.println(ip.getHostName());
		System.out.println(ip.getHostAddress());
		System.out.println(ip);
		
		System.out.println("=======================");
		ipArr = InetAddress.getAllByName("www.naver.com");
		System.out.println(Arrays.toString(ipArr));
		
		System.out.println("=======================");
		ip = InetAddress.getLocalHost();
	    System.out.println(ip.getHostName());
	    System.out.println(ip.getHostAddress());
	    System.out.println(ip);
	}
}
