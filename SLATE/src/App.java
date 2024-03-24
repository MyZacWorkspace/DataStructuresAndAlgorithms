import java.util.HashMap;

public class App 
{
    public static void main(String[] args) 
    {
        String a  = "a";
        char[] form = a.toCharArray();
        System.out.println((char)(form[0] + 1));

        HashMap <Integer, String> myhashmap = new HashMap<Integer, String>();

        myhashmap.put(999, "Mario");
        myhashmap.put(989, "Luigi");
        myhashmap.put(2003, "Wario");
        myhashmap.put(2005, "Waluigi");

        System.out.println(myhashmap);
        System.out.println(myhashmap.containsKey(999));
        myhashmap.put(999, "Metal Mario");
        System.out.println(myhashmap);

        Pair<Double, Integer> id = new Pair<Double, Integer>();
    }
}
