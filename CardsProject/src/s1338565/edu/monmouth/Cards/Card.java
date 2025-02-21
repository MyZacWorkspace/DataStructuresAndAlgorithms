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

	@Override
	public boolean equals(Object otherObject)
	{
		System.out.println("Returning equality");
		if (this.suit == ((Card) otherObject).getSuit()
				&& this.rank == ((Card) otherObject).getRank())
			return true;

		return false;
	}
	
	@Override
	public int hashCode()
	{
		System.out.println("Returning hash");
		return getRank().hashCode() + getSuit().hashCode();
	}
}
//End of Class
