package a220118;

class ConstructorTest {
	public static void main(String[] args) {
		Data1 d1 = new Data1();
		Data2 d2 = new Data2();
		Data2 d2_2 = new Data2(5);
		
		String str = "";
		String str2 = new String();
		String str3 = new String("abcd");
		String str4 = new String(new char[] {'a', 'b', 'c'});
		System.out.println(str4);
	}
}

class Data1 {
	int value;
}

class Data2 {
	int value;
	
	Data2() {

	}
	
	Data2 (int x) { // 매개변수가 있는 생성자
		value = x;
	}
}
