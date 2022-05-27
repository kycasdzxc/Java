package chap15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FilePaste {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(args[0]);
		FileOutputStream fos = new FileOutputStream(args[1]);
		
		int data = 0;
		int cnt = 0;
		
		while((data = fis.read()) != -1) {
			char c = (char)data;
			System.out.print(c);
			fos.write(data);
			cnt++;
		}
		System.out.println(cnt + "bytes");
	}
}
