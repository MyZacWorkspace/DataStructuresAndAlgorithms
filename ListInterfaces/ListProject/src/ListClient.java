
import java.util.ArrayList;
import java.util.Vector;
import java.util.List;

public class ListClient 
{
    public static void main(String[] args)
    {
        final int MAX = 1000000;

        List<Integer> list = new ArrayList<Integer>();
        List<Integer> vector = new Vector<Integer>();

        long start = System.currentTimeMillis();
        for(int i = 0; i < MAX ; i++)
        {
            list.add(i);
        }
        long end = System.currentTimeMillis();

        System.out.println((end-start) + " milliseconds for the ArrayList to Compute");

        start = System.currentTimeMillis();
        for(int i = 0; i < MAX ; i++)
        {
            vector.add(i);
        }
        end = System.currentTimeMillis();

        System.out.println((end-start) + " milliseconds for the Vector to Compute");
        //Vectors take much longer!

    }
}
