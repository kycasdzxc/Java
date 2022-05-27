package a220119;

public class Deck {
	final int CARD_NUM = Card.KIND_MAX * Card.NUM_MAX; // 카드의 개수
	Card[] cardArr = new Card[CARD_NUM]; // Card 객체 배열을 포함
	
	Deck () {		
		for (int i = 0, k = Card.KIND_MAX ; k > 0 ; k--)
			for (int n = 0 ; n < Card.NUM_MAX ; n++)
				cardArr[i++] = new Card(k, n+1);
	}
	
	Card pick (int index) {
		return cardArr[index];
	}
	
	Card pick() {
		int index = (int)(Math.random() * CARD_NUM);
		return pick(index);
	}
	
	void shuffle() {
		for (int i = 0 ; i < cardArr.length ; i++) {
			int r = (int)(Math.random() * CARD_NUM);
			
			Card temp = cardArr[i];
			cardArr[i] = cardArr[r];
			cardArr[r] = temp;
		}
	}
}
