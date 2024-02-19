package s1338565.edu.monmouth.Cards;


public class Card 
{
	
	private int rank;
	private int suit;
	public final static int MAXRANK = 13;
	public final static int MINRANK = 1;
	public final static int MAXSUIT = 4;
	public final static int MINSUIT = 1;
	
	public Card(int rank, int suit)
	{
		this.rank = rank;
		this.suit = suit;
	}
	
	public int getSuit()
	{
		return suit;
	}
	
	public void setSuit(int suit)
	{
		this.suit = suit;
	}
	
	
	public int getRank()
	{
		return rank;
	}
	
	public void setRank(int rank)
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
