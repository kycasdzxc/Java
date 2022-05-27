package a220128;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class CardToString {
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card("HEART", 2);
		
		System.out.println(c1.toString());
		System.out.println(c1);
		System.out.println(c2);
	}
}

@AllArgsConstructor
@Data
class Card {
	String kind;
	int number;
	
	public Card() {
		this("SPADE", 1);
	}

	@Override
	public String toString() {
		return kind + ", " + number;
	}
	
		
}