package s1338565.edu.monmouth.Cards;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.LinkedList;

public class HashTester
{
    public static void main(String[] args)
    {
        Set<Card> setOfCards = new HashSet<Card>();

        Deck d = new Deck();
        d.shuffle();
        Card[] cards = null;

        try
        {
            cards = d.deal(DeckConstants.CARDSTODEAL);
        }
        catch(DeckException de)
        {
            System.out.println("Cards cannot be dealt");
            System.exit(DeckConstants.BADINT);
        }

        for(int c = 0 ; c < cards.length ; c++)
        {
            System.out.println("Card " + c + " successfully added " + setOfCards.add(cards[c]));
        }
       
        //Calling .hashCode!
        //Adds if not already present, determined by the hash
        Iterator<Card> it = setOfCards.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        //It seems to go to equals method when .hashCode fails (this accounts for collision)

        Card duplicate = new Card(Rank.TEN, Suit.DIAMOND);
        Card unique = new Card(Rank.ACE, Suit.SPADE);
        System.out.println("Successfully added " + duplicate + " " + setOfCards.add(duplicate));

        System.out.println("The hashSet contains " + duplicate + " " + setOfCards.contains(duplicate));
        System.out.println("the hashSet contains " + unique + " " + setOfCards.contains(unique));
        //This invokes the hashCode method from card class


        System.out.println("Successfully added " + duplicate + " " + setOfCards.add(duplicate));
        System.out.println("Successfully added " + unique + " " + setOfCards.add(unique));

        LinkedList<Card> ll = new LinkedList<Card>();
        ll.addAll(setOfCards);

        Iterator<Card> llit = ll.iterator();
        while(llit.hasNext())
        {
            System.out.println(llit.next());
        }

    }
}
