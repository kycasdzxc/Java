package a220112;

public class Prev {
	public static void main(String[] args) {

//		int[] score = new int[5];
//		System.out.println(score);
//		score = new int[5];
//		System.out.println(score);
//		score = new int[5];
//		System.out.println(score);
		
		int[] score;
		score = new int[8];
		System.out.println(score);
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);
		
		score[2] = 100;
		score[3] = 50;
		System.out.println("=================");
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);
		
		// score의 타입 : int[]
		// score[0]의 타입 : int
		
		System.out.println("=================");
		for ( int i = 0 ; i < score.length ; i++) {
			System.out.println(score[i]);
		}
		
	}
}
