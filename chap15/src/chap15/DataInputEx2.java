package chap15;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputEx2 {
	public static void main(String[] args) throws Exception {
		DataInputStream dis = new DataInputStream(new FileInputStream("result2.dat"));
		System.out.println(dis.readLong());
		System.out.println(dis.readDouble());
	}
}
