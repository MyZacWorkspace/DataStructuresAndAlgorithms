package s1338565.edu.monmouth.Cards;
import java.util.Arrays;

public class DealTest 
{
    
    public static void main(String[] args)
    {
        int CARDSINHAND = 0;
        
        try
        {
            CARDSINHAND = Integer.parseInt(args[0]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.err.println("There is no command line argument! Program terminated.");
            e.printStackTrace();
            System.exit(DeckConstants.BADNUMBEROFARGUMENTS);
        }
        catch(NumberFormatException e)
        {
            System.err.println("Argument cannot be converted to an int. Program terminated.");
            e.printStackTrace();
            System.exit(DeckConstants.BADINT);
        }

        Deck deck = new Deck();

        Card player1Hand[] = null;
        Card player2Hand[] = null;
        Card player3Hand[] = null;
        Card player4Hand[] = null;

        try
		{
            player1Hand = deck.deal(CARDSINHAND);
            player2Hand = deck.deal(CARDSINHAND);
            player3Hand = deck.deal(CARDSINHAND);
            player4Hand = deck.deal(CARDSINHAND);
		}
		catch(DeckException de)
		{
			System.err.println(de.getMessage());
			de.printStackTrace();
			System.exit(-3);
		}


      

        System.out.println(Arrays.toString(player1Hand));
        System.out.println(Arrays.toString(player2Hand));
        System.out.println(Arrays.toString(player3Hand));
        System.out.println(Arrays.toString(player4Hand));

        System.out.println("Cards in Deck: " + deck.cardsLeft());
    }
}
