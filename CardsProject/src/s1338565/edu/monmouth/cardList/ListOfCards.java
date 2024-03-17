package s1338565.edu.monmouth.cardList;

import s1338565.edu.monmouth.Cards.*;

public class ListOfCards 
{

	public static void main(String[] args) 
	{
		// verify constructor, toString and insert
		ListCardNode fullList = new ListCardNode();
		System.out.println("Before adding cards\nnumber of Cards: " + fullList.size());
		System.out.println("isEmpty: " + fullList.isEmpty());
		for (Rank rank : Rank.values()) 
		{ 
			for (Suit suit : Suit.values()) 
			{ 
				fullList.insert(new Card(rank, suit));
			}
		}
		System.out.println(fullList);
		System.out.println("After adding cards\nnumber of Cards: " + fullList.size());
		System.out.println("isEmpty: " + fullList.isEmpty());
		System.out.println("Current tail: " + fullList.getTail());	
		
		// new list to verify new methods
		ListCardNode list = new ListCardNode();
		System.out.println("List in reverse: " + list.printReverse());
		System.out.println("Current tail: " + list.getTail());	
		list.insert(new Card(Rank.ACE, Suit.CLUB));
		System.out.println("Current tail: " + list.getTail());	
		list.insert(new Card(Rank.KING, Suit.CLUB));
		System.out.println("Current tail: " + list.getTail());	
		list.insert(new Card(Rank.JACK, Suit.SPADE));
		System.out.println("Current tail: " + list.getTail());	
		list.insert(new Card(Rank.ACE, Suit.HEART));
		System.out.println("List after 4 cards: " + list);
		System.out.println("List in reverse: " + list.printReverse());
		System.out.println("Current tail: " + list.getTail());	
		
		list.insertAfter(new Card(Rank.JACK, Suit.SPADE), new Card(Rank.THREE, Suit.HEART));
		System.out.println("List after card added: " + list);
		System.out.println("Current tail: " + list.getTail());	
	
		list.insertEnd(new Card(Rank.FIVE, Suit.SPADE));
		System.out.println("List after card added at end: " + list);
		System.out.println("Current tail: " + list.getTail());	
		
		Card cardToRemove = new Card(Rank.QUEEN, Suit.CLUB);
		System.out.println(list.remove(cardToRemove));
		System.out.println("List after attempted remove of " + cardToRemove + "\n" + list);
		System.out.println("Current tail: " + list.getTail());	

		cardToRemove = new Card(Rank.ACE, Suit.CLUB);
		System.out.println(list.remove(cardToRemove));
		System.out.println("List after attempted removal of " + cardToRemove + "\n" + list);	
		System.out.println("Current tail: " + list.getTail());	
	}

}
