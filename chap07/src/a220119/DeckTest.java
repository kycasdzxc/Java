package a220119;

import java.util.Arrays;

public class DeckTest {
	public static void main(String[] args) {
		Deck d = new Deck();	// 카드 한 벌(Deck)을 만든다.
		System.out.println(Arrays.toString(d.cardArr));
		Card c = d.pick(0);		// 섞기 전에 제일 위의 카드를 뽑는다.
		System.out.println(c);	// System.out.println(c.toString());
		
		d.shuffle();			// 카드를 섞는다.
		System.out.println(Arrays.toString(d.cardArr));
		c = d.pick(0);			// 섞은 후에 제일 위의 카드를 뽑는다.
		System.out.println(c);
	}
}
