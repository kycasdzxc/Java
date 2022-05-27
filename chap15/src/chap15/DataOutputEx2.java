package chap15;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputEx2 {
	public static void main(String[] args) throws Exception{
		DataOutputStream dos = new DataOutputStream(
				new BufferedOutputStream(new FileOutputStream("result2.dat")));
		dos.writeLong(Long.MAX_VALUE);
		dos.writeDouble(Math.PI);
		
		dos.close();
	}
}
