package a220126;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWriterEx {
	public static void main(String[] args) {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter("abc.txt");
			pw.println("안녕하세요~");
			pw.println(Math.PI);
			pw.println("abcd");
			pw.println("1234");
						
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			pw.close();
		}
	}
}
