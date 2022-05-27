package a220128;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.ToString;

public class CloneEx1 {
	public static void main(String[] args) {
		Target t1 = new Target(1, 2, new int[] {5, 6, 7});
		Target t2 = t1.clone();
		System.out.println(t1);
		System.out.println(t2);
		t1.x = 10;
		t1.arr[0] = 50;
		System.out.println(t1);
		System.out.println(t2);
		
		int[] arr1 = {1, 2, 3};
		int[] arr2 = arr1.clone();
		
		arr1[0] = 10;
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}
}

@AllArgsConstructor
@ToString
class Target implements Cloneable {
	int x;
	int y;
	int[] arr;
	@Override
	public Target clone() {
		Target obj = null;
		try {
			obj = (Target)super.clone();
			obj.arr = arr.clone(); // 깊은 복사
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}
}