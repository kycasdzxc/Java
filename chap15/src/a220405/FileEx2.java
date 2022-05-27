package a220405;

import java.io.File;

public class FileEx2 {
	public static void main(String[] args) {
		System.out.println(Test.CONST);
		System.out.println(Test.const2);
	}
}

class Test {
	static final String CONST = "const";
	static final String const2; // 비초기화 상수
	
	static {
		const2 = System.getProperty("os.name").toLowerCase().contains("window") ? "\\" : "/";
	}
	
	public Test() {}
}