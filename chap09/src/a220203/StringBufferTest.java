package a220203;

public class StringBufferTest {
	public static void main(String[] args) {
		String str = "a";
		str += "b";
		str += "c";
		str += "d";
		str += "e";
		str.concat("f"); // 적용 x
		str = str.concat("f");
		System.out.println(str);
		
		StringBuffer sb = new StringBuffer("a");
		sb.append("b");
		sb.append("c").append("d").append("e"); // method chaining
		
		sb.append("f");
		System.out.println(sb);
		
		System.out.println(str.equals(sb.toString()));
	}
}
