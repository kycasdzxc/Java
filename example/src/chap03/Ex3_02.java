package chap03;

public class Ex3_02 {
	public static void main(String[] args) {
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBucket  = numOfApples % sizeOfBucket == 0 ? numOfApples / sizeOfBucket : numOfApples / sizeOfBucket + 1;
		int numOfBucket2 = (numOfApples + 9) / 10;
		int numOfBucket3 = (numOfApples - 1) / 10 + 1;
		// int numOfBucket = numOfApples / sizeOfBucket + (numOfApples % sizeOfBucket > 0 ? 1 : 0);
		
		System.out.println("필요한 바구니의 수 :" + numOfBucket);
	}
}
