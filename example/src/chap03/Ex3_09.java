package chap03;

public class Ex3_09 {
	public static void main(String[] args) {
		char ch = 'z';
		boolean b = (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' || ch >= '0' && ch <= '9');
		
		System.out.println(b);
	}
}
