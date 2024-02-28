package s1338565.edu.monmouth.Cards;

public class DeckOfCardTest2 {

	public static void main(String args[] ) {
		// verify Card constructor
		Card c1 = new Card(Rank.EIGHT, Suit.HEART);
		Card c2 = new Card(Rank.TWO, Suit.HEART);
		Card c3 = new Card(Rank.NINE, Suit.HEART);
		System.out.println("Card c1: " + c1);
		System.out.println("Card c2: " + c2);
		System.out.println("Card c3: " + c3);
		
		// verify Deck constructor & toString
		Deck deck = new Deck();
		System.out.println("Newly created deck:\n" + deck);
		deck.shuffle();
		System.out.println("Shuffled deck:\n" + deck);
		
		try
		{
			System.out.println("Draw card: " + deck.draw());
			System.out.println("Draw card: " + deck.draw());
			System.out.println("Draw card: " + deck.draw());
			int cardsLeft = deck.cardsLeft();
			System.out.println("cardsLeft: " + cardsLeft);
			
			
			for(int i=0; i < cardsLeft+1; i++) {
				System.out.println("Draw card: " + deck.draw());
			}
			System.out.println("Complete");
		}
		catch(DeckException de)
		{
			System.out.println(de.getMessage());
			de.printStackTrace();
			System.exit(-3);
		}
		
	}

}
