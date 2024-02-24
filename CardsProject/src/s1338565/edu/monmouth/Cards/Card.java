package s1338565.edu.monmouth.Cards;


public class Card 
{
	private Rank rank;
	private Suit suit;	
	public final static Rank MAXRANK = Rank.KING;
	public final static Rank MINRANK = Rank.ACE;
	public final static Suit MAXSUIT = Suit.HEART;
	public final static Suit MINSUIT = Suit.DIAMOND;
	
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
		return rank + " of " + suit + "S";
	}
}
//End of Class
