package s1338565.edu.monmouth.Cards;
import java.util.Arrays;

public class DealTest 
{
    
    public static void main(String[] args)
    {
        Deck deck = new Deck();

        final int CARDSINHAND = Integer.parseInt(args[0]);

        Card player1Hand[] = deck.deal(CARDSINHAND);
        Card player2Hand[] = deck.deal(CARDSINHAND);
        Card player3Hand[] = deck.deal(CARDSINHAND);
        Card player4Hand[] = deck.deal(CARDSINHAND);

        System.out.println(Arrays.toString(player1Hand));
        System.out.println(Arrays.toString(player2Hand));
        System.out.println(Arrays.toString(player3Hand));
        System.out.println(Arrays.toString(player4Hand));

        System.out.println("Cards in Deck: " + deck.cardsLeft());
    }
}
