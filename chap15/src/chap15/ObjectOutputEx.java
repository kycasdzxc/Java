package chap15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ObjectOutputEx {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1, "1길동", 80));
		list.add(new Student(2, "2길동", 90));
		list.add(new Student(3, "3길동", 70));
		
		System.out.println(list);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students.ser"));
		oos.writeObject(list);
	}
}

class Student implements Serializable {
	int no;
	String name;
	int score;

	public Student(int no, String name, int score) {
		this.no = no;
		this.name = name;
		this.score = score;
	}

	@Override
	public String toString() {
		return String.format("Student [no=%s, name=%s, score=%s]", no, name, score);
	}
	
}