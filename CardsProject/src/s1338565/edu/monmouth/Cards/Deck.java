package s1338565.edu.monmouth.Cards;

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class Deck 
{
	private Card[] deck;
	
	public Deck()
	{
		deck = new Card[DeckConstants.MAXCARDSINDECK];

		Rank[] ranks = Rank.values();
		Suit[] suits = Suit.values();
	
		for(int s = Card.MINSUIT.ordinal(); s <= Card.MAXSUIT.ordinal(); s++)
		{
			for(int r = Card.MINRANK.ordinal(); r <= Card.MAXRANK.ordinal(); r++)
			{
				if(s >= 1)
					deck[(s*13) + (r)] = new Card(ranks[r],suits[s]);
				else
					deck[r] = new Card(ranks[r],suits[s]);
			}
			
		}
	
		/*For Debugging
		for(Card c : deck)
		{
			System.out.println("Card rank and suit: " + c.getRank() + " " + c.getSuit());
		}
		*/

	}
	
	public void shuffle()
	{
		//New Deck Contents to be copied int deck after shuffle
		ArrayList <Card> newDeck = new ArrayList <Card>();
		//Copy that we will throw out afterwards
		ArrayList <Card> copyDeck = new ArrayList <Card>();
		
		for(int i = 0 ; i < deck.length ; i++)
		{
			copyDeck.add(deck[i]);
		}
		
		Random ran = new Random();
		int rand1 = 0;
		int rand2 = 0;
		
		
		for(int h = 0; h < deck.length/2 ; h++)
		{
			rand1 = ran.nextInt(copyDeck.size());
			newDeck.add(copyDeck.remove(rand1));
			
			rand2 = ran.nextInt(copyDeck.size());
			newDeck.add(copyDeck.remove(rand2));
		}
		
		
		for(int i = 0 ; i < deck.length ; i++)
		{ deck[i] = newDeck.get(i); }
		
		
		//System.out.println(newDeck);
		
		/*
		for(Card c : deck)
		{
			System.out.println(c);
		}
		*/
		
		//System.out.println(copyDeck);
		
		newDeck = null;
		copyDeck = null;
		
		//For Debugging
		//System.out.println(newDeck);
		//System.out.println(deck);
		//System.out.println(copyDeck);
	}
	
	public Card draw()
	{
		//FIXME Consider turning this into an exception
		if(cardsLeft() == 0)
		{
			System.out.println("No more cards left");
			return null;
		}
		Random ran = new Random();
		int select = ran.nextInt(deck.length);
		Card drawn = null;
		
		ArrayList <Card> newDeck = new ArrayList <Card> ();
		
		for(int i = 0 ; i < deck.length ; i++)
		{
			if(i != select)
			{
				newDeck.add(deck[i]);
			}
			else
			{
				drawn  = deck[select];
			}
		}
		
		deck = new Card[deck.length - 1];

		for(int i = 0 ; i < deck.length ; i++)
		{ deck[i] = newDeck.get(i); }

		newDeck = null;
		return drawn; 
	}
	
	public int cardsLeft()
	{ return deck.length; }

	public Card[] deal(int cardsToDeal)
	{
		Card[] hand = new Card[cardsToDeal];

		for(int h = 0 ; h < cardsToDeal ; h++)
		{
			hand[h] = draw();
		}

		return hand;
	}
	
	@Override
	public String toString()
	{

		return Arrays.toString(deck);

	}
}
