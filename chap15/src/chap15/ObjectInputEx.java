package chap15;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

@SuppressWarnings("unchecked")
public class ObjectInputEx {
	public static void main(String[] args) throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students.ser"));
		List<Student> obj = (List<Student>)ois.readObject();
		System.out.println(obj);

		ois.close();
	}
}
