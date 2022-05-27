package chap15;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputEx1 {
	public static void main(String[] args) throws Exception {
		DataInputStream dis = new DataInputStream(new FileInputStream("result.dat"));
		System.out.println(dis.readLong());
		System.out.println(dis.readBoolean());
		System.out.println(dis.read());
		System.out.printf("%x", 127);
		
		// 
	}
}
