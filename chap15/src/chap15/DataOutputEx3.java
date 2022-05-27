package chap15;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputEx3 {
	public static void main(String[] args) throws Exception{
		DataOutputStream dos = new DataOutputStream(
				new BufferedOutputStream(new FileOutputStream("result3.dat")));
		dos.writeChars("a가"); // 4
		dos.writeChar('a');
		dos.writeChar('가');
		dos.writeUTF("a가"); // 6
		dos.write("a가".getBytes()); // 4
		dos.close();
	}
}
