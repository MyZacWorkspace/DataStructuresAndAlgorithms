package s1338565.edu.monmouth.Cards;

import java.util.Random;
import java.util.ArrayList;

public class Deck 
{
	private Card[] deck;
	
	public Deck()
	{
		deck = new Card[DeckConstants.MAXCARDSINDECK];
		
		//13*4 = 52
		for(int s = Card.MINSUIT ; s <= Card.MAXSUIT; s++)
		{
			for(int r = Card.MINRANK ; r <= Card.MAXRANK ; r++)
			{
				if(s > 1)
					deck[((s-1)*13) + (r - 1)] = new Card(r,s);
				else
					deck[(s*r) - 1] = new Card(r,s);
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
		//deck = newDeck.toArray();
		newDeck = null;
		return drawn;
	}
	
	
}
