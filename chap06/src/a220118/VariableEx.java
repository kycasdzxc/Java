package a220118;

public class VariableEx {
	
	static int i = 100;
	
	public static void main(String[] args) {
		int i = 1000;
		System.out.println(i);
		System.out.println(VariableEx.i);
		
		System.out.println(add(10, 22, 33));

		Integer[] arr = {5, 10, 15};

		System.out.println(add(arr));
		
	}
	
	static int add(Integer... a) {
		int sum = 0;
		for (int i = 0 ; i < a.length ; i++) {
			sum += a[i];
		}
		return sum;
	}
	
}
