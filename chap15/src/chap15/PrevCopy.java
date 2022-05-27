package chap15;

import java.io.FileInputStream;
import java.io.FileReader;

public class PrevCopy {
	public static void main(String[] args) throws Exception{

		// 문자 기반 입력 스트림 : Reader
		// 문자 기반 출력 스트림 : Writer
		// 바이트 기반 입력 스트림 : InputStream
		// 바이트 기반 출력 스트림 : OutputStream
		
		// 파일 : File
		
		// FileReader
		FileReader fr = new FileReader("src/chap15/Prev.java");
		int b = 0;
		int cnt = 0;
		while((b = fr.read()) != -1) {
//			System.out.print((char)b);
			cnt++;
		}
		System.out.println(cnt + "번 반복함");
		
		FileInputStream fis = new FileInputStream("src/chap15/Prev.java");
		b = 0;
		cnt = 0;
		while((b = fis.read()) != -1) {
			System.out.print((char)b + "::");
			System.out.print(b);
			System.out.println();
			cnt++;
		}
		System.out.println(cnt + "번 반복함");
		
		// End Of File
		// 400byte
		// byte[] bytes = new Byte[32];
		// read(bytes)
		
		
	}
}
