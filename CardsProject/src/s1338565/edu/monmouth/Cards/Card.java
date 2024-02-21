package s1338565.edu.monmouth.Cards;


public class Card 
{
	private Rank rank;
	private Suit suit;
	public final static int MAXRANK = 13;
	public final static int MINRANK = 1;
	public final static int MAXSUIT = 4;
	public final static int MINSUIT = 1;
	
	public Card(Rank rank, Suit suit)
	{
		this.rank = rank;
		this.suit = suit;
	}
	
	public Suit getSuit()
	{
		return suit;
	}
	
	public void setSuit(Suit suit)
	{
		this.suit = suit;
	}
	
	
	public Rank getRank()
	{
		return rank;
	}
	
	public void setRank(Rank rank)
	{
		this.rank = rank;
	}
	
	@Override
	public String toString()
	{
		return "Card Rank and Suit: " + rank + " " + suit;
	}
}
//End of Class
