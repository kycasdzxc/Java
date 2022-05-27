package a220119;

public class Card {
	static final int KIND_MAX = 4; // 카드 무늬의 수
	static final int NUM_MAX = 13; // 카드 무늬의 수
	
	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;
	
	int kind;
	int number;
	
	Card() {
		this (SPADE, 1);
	}
	
	Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		String[] kinds = {"CLOVER", "HEART", "DIAMOND", "SPADE"};
		String numbers = "A23456789XJQK"; // 숫자 10은 X로 표현네
//		return "kind : " + kinds[kind-1] + ", number : " + numbers.charAt(number-1);
		return String.format("(%s %c)", kinds[kind-1], numbers.charAt(number-1));
	}
}
