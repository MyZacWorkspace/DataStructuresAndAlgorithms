package s1338565.edu.monmouth.Cards;
import java.util.Arrays;

public class DealTest 
{
    
    public static void main(String[] args)
    {
        int CARDSINHAND = 0;
        
        try
        {
            if(args.length > 1 || args.length < 0)
            {
                System.out.println("Please provide only one command line argument. Program Terminating...");
                System.exit(DeckConstants.BADNUMBEROFARGUMENTS);
            }
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

        //Debugging
        /*Ordinal starts counting at 0!
        System.out.println("Debugging");
        Card ch = new Card(Rank.ACE, Suit.HEART);
        System.out.println(Rank.ACE.ordinal());
        */

        //Player 1
        int rankSumP1 = 0;
        for(Card c : player1Hand)
        {
            rankSumP1 += c.getRank().ordinal();
        }

        //Player 2
        int rankSumP2 = 0;
        for(Card c : player2Hand)
        {
            rankSumP2 += c.getRank().ordinal();
        }


        //Player 3
        int rankSumP3 = 0;
        for(Card c : player3Hand)
        {
            rankSumP3 += c.getRank().ordinal();
        }


        int rankSumP4 = 0;
        for(Card c : player4Hand)
        {
            rankSumP4 += c.getRank().ordinal();
        }

        int[] rankSums = {rankSumP1, rankSumP2, rankSumP3, rankSumP4};
        int maxRankSum = 0;
        int maxRankSumPlayer = 0;
        //Simultaneously, get minimum
        int minRankSum = 0;
        int minRankSumPlayer = 0;
        for(int r = 0 ; r < rankSums.length ; r++)
        {
            System.out.println("Player " + (r+1) + " sum: " + rankSums[r]);
            if(rankSums[r] > maxRankSum)
            {
                maxRankSum = rankSums[r];
                maxRankSumPlayer = r + 1;
            }

            //Different First Iteration
            if(r == 0)
            {
                minRankSum = rankSums[r];
                minRankSumPlayer = r + 1;
            }
            else if(rankSums[r] < minRankSum)
            {
                minRankSum = rankSums[r];
                minRankSumPlayer = r + 1;
            }
        }
        System.out.println("Max Rank Sum for Player " + maxRankSumPlayer + ", " + maxRankSum);
        System.out.println("Min Rank Sum for Player " + minRankSumPlayer + ", " + minRankSum);
        System.out.println("Cards in Deck: " + deck.cardsLeft());

        System.out.println("Testing equals");
        Card c1 = new Card(Rank.ACE , Suit.DIAMOND);
        Card c2 = new Card(Rank.ACE, Suit.DIAMOND);
        Card c3 = new Card(Rank.JACK, Suit.HEART);

        System.out.println("Card " + c1 + " and Card " + c1 + ": " + c1.equals(c1));
        System.out.println("Card " + c1 + " and Card " + c2 + ": " + c1.equals(c2));
        System.out.println("Card " + c1 + " and Card " + c3 + ": " + c1.equals(c3));
        
    }
}
