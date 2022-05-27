package a220413;

public class CardTest {
	public static void main(String[] args) {
		Card card = new Card(Kind.CLOVER, Number.TWO);
		Card card2 = new Card(Kind.SPADE, Number.TWO);
		System.out.println(Kind.CLOVER.ordinal());
		System.out.println(Kind.SPADE.ordinal());
		System.out.println(card);
		System.out.println(card2);
	}
}

class Card {
//	int kind;
	Kind kind;
	Number number;
	
	public Card(Kind kind, Number number) {
		this.kind = kind;
		this.number = number;
	}

	@Override
	public String toString() {
		return String.format("Card [kind=%s, number=%s]", kind, number);
	}
}

enum Kind {CLOVER, HEART, DIAMOND, SPADE}
enum Number {TWO, THREE, FOUR, FIVE}