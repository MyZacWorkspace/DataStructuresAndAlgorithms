package s1338565.edu.monmouth.Cards;

public class DeckOfCards {

	public static void main(String[] args) 
	{
		

		Deck d = new Deck();
		System.out.print(d);
		
		d.shuffle();
		System.out.println(d);
		
		System.out.println(d.draw());
		System.out.println("Drew Card: " + d);

		System.out.println("Cards left: " + d.cardsLeft());
	}

}
