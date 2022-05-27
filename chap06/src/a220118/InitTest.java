package a220118;

public class InitTest {
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println(Init.si);
		System.out.println(Init.si);
		
		Init init = new Init();
		System.out.println(init.i);
		
		new Init();
		new Init();
		
		Class.forName("a220118.Init");
	}
}
class Init {
	static int cnt = 1;
	static int count() {
		System.out.println("count().cnt :: " + cnt);
		return cnt++;
	}
	
	//
	static int si = count();
	
	int i = count();

}