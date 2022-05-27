package chap15;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputEx3 {
	public static void main(String[] args) throws Exception {
		DataInputStream dis = new DataInputStream(new FileInputStream("result3.dat"));
		System.out.println(dis.readChar());
		System.out.println(dis.readChar());
		System.out.println(dis.readChar());
		System.out.println(dis.readChar());
		System.out.println(dis.readUTF());
		byte[] bytes = new byte[3];
		dis.read(bytes);
		System.out.println(new String(bytes, "ms949"));
		
		for(byte b : bytes) {
			System.out.printf("%x%n", b);
		}
	}
}
