package a220125;

import java.io.FileInputStream;
import java.io.IOException;

public class Prev {
	public static void main(String[] args) throws IOException {
		// try, catch, finally, throw, throws
		
		// RuntimeException : unchecked Exception
		// 컴파일러가 무시
		// non-RuntimeException : checked Exception
		// 컴파일러가 체크
		
		FileInputStream fis = new FileInputStream("test.txt");
		int b = 0;
		while((b = fis.read()) != -1) {
			System.out.println(b + "::" + (char)b);
		};
		fis.close();
	}
}
