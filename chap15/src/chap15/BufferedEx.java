package chap15;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedEx {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\Users\\user\\Desktop\\file\\새텍스트문서.txt");
		
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream("C:\\Users\\user\\Desktop\\file\\새텍스트문서2.txt", true /* 이어쓰기 */), 4);
		
		int b = 0;
		while((b = fis.read()) != -1) {
			bos.write(b);
		}
		bos.flush();
		bos.close();
	}
}
