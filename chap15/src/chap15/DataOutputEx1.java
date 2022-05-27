package chap15;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputEx1 {
	public static void main(String[] args) throws Exception{
		DataOutputStream dos = new DataOutputStream(
				new BufferedOutputStream(new FileOutputStream("result.dat")));
		dos.writeBoolean(true);
		dos.writeLong(10L);
		dos.writeFloat(0);
		
		dos.close();
	}
}
