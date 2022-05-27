package a220119;

public class BlockTest {
	static {
		System.out.println("static { }");
	}
	{
		System.out.println("{ }");
	}
	public BlockTest() {
		System.out.println("생성자");
	}
	
	int i = 10;
	
	{
		i = 100;
	}
	
	public static void main(String[] args) {
			System.out.println("BlockTest bt = New BlockTest()");
			new BlockTest();
			System.out.println("BlockTest bt2 = New BlockTest()");
//			new BlockTest();
			System.out.println(new BlockTest().i);
	}
}
