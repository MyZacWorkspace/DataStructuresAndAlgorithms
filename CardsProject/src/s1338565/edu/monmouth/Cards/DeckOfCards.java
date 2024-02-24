package s1338565.edu.monmouth.Cards;

public class DeckOfCards {

	public static void main(String[] args) 
	{
		
		
		//For Debugging
		//Rank[] r = Rank.values();
		//System.out.println(r[5]);
		//System.out.println(Rank.KING.ordinal());
		//System.out.println(new Card(Rank.ACE, Suit.SPADE));

		
		Deck d = new Deck();
		System.out.print(d);
		
		
		d.shuffle();
		System.out.println(d);
		
		System.out.println("Drew Card: " + d.draw());

		System.out.println(d);

		System.out.println("Cards left: " + d.cardsLeft());
		
	}

}
