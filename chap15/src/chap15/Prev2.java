package chap15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Prev2 {
	public static void main(String[] args) throws Exception{
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/chap15/Prev.java"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/chap15/PrevCopy.java"));
		
		int b = 0;
		while((b = bis.read()) != -1) {
			bos.write(b);
		}
		
		bis.close();
		bos.close();
	}
}
