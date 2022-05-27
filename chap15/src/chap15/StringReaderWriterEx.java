package chap15;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringReaderWriterEx {
	public static void main(String[] args) throws IOException {
		String inputData = "ABCD";
		StringReader sr = new StringReader(inputData);
		StringWriter sw = new StringWriter();
		
		int data = 0;
		
		while((data=sr.read()) != -1) {
			sw.write(data);
		}
		
		System.out.println(inputData);
		System.out.println(sw);
		System.out.println(sw.getBuffer());
	}
}
