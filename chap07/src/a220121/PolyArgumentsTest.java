package a220121;

abstract class Product {
	int price;		// 제품의 가격
	int bonusPoint;	// 제품구매 시 제공하는 보너스점수
	
	public Product(int price) {
		this.price = price;
		bonusPoint = (int)(price / 10d);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName();
	}
}

class Tv extends Product { Tv() { super(100);}}
class Computer extends Product { Computer() { super(200); }}
class Audio extends Product { Audio() { super(50); }}

class Buyer {
	int money = 1000;
	int bonusPoint;
	Product[] item = new Product[10];
	int i; // cnt
	
	void buy (Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p;
		System.out.println(p + "를 구입하셨습니다.");
	}

	void summary() {
		int sum = 0;
		String itemList = "";
		for(int i = 0 ; i < this.i ; i++) {
			sum += item[i].price;
			itemList += item[i] + ",";
		}
		
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
	
	@Override
	public String toString() {
		return String.format("Buyer [money=%s, bonusPoint=%s]", money, bonusPoint);
	}
}

public class PolyArgumentsTest {
	public static void main(String[] args) {
		Buyer buyer = new Buyer();
		buyer.buy(new Tv());
		buyer.buy(new Computer());
		buyer.buy(new Audio());
		
		buyer.summary();
		
		// 마린, 마린, 마린, 마린, 마린, 파벳, 파벳, 메딕, 메딕
		// Marine[] marines = new Marin[5];
		// Unit[] marines = new Unit[5];
		
	}
}