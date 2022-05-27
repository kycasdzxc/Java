package chap15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class IOEx3 {
	public static void main(String[] args) throws IOException {
		byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		byte[] outSrc = null;
		byte[] temp = new byte[4];
		
		ByteArrayInputStream bais = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		System.out.println("input source: " + Arrays.toString(inSrc));
		
		int data = 0;
		
		while(bais.available() > 0) {
//			bais.read(temp);
//			baos.write(temp);
			baos.write(temp, 0, bais.read(temp));
//			System.out.println("temp       : " + Arrays.toString(temp));
			outSrc = baos.toByteArray();
			printArrays(temp, outSrc);
		}
	}
	static void printArrays(byte[] temp, byte[] outSrc) {
		System.out.println("temp        : " + Arrays.toString(temp));
		System.out.println("outSrc      : " + Arrays.toString(outSrc));
	}
}