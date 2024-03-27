import java.util.Properties;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Arrays;

public class PropertiesClient 
{
    public static void main(String[] args)
    {
        final String DELIMITER = ",";
        final int EXPECTEDNUMBEROFELEMENTS = 3;
        final int BADVALUE = -4;
        Properties properties = new Properties();
        if(args.length != 1)
        {
            System.err.println("Enter name of props file");
            System.exit(-1);
        }

        String propsFileName = args[0];

        try
        {
            properties.load(new BufferedReader(new FileReader(propsFileName)));
        }
        catch(IOException ioe)
        {
            System.out.println("Cannot load file " + propsFileName + " " + ioe.getMessage());
            ioe.printStackTrace();
            System.exit(-2);
        }

        String nameValue = properties.getProperty("name");
        if(nameValue != null)
            System.out.println("name value: " + nameValue + " with a length of " + nameValue.length());
        System.out.println(propsFileName);

        String enrollmentValue = properties.getProperty("enrollment");
        if(enrollmentValue != null)
            System.out.println("enrollment value: " + enrollmentValue + " with a length of " + enrollmentValue.length());

        HashMap<String, Integer> myhm = new HashMap<String,Integer>();


        String names[] = nameValue.split(DELIMITER);
        String enrolls[] = enrollmentValue.split(DELIMITER);

        if(names.length != EXPECTEDNUMBEROFELEMENTS || enrolls.length != EXPECTEDNUMBEROFELEMENTS)
        {
            System.err.println("The number of name keys or the number of enrollment values is not " + EXPECTEDNUMBEROFELEMENTS + ". Program terminating...");
            System.exit(EXPECTEDNUMBEROFELEMENTS);
        }
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(enrolls));

        try
        {
            for(int kv = 0 ; kv < names.length && kv < enrolls.length ; kv++)
            {
                myhm.put(names[kv] , Integer.parseInt(enrolls[kv]));
            }
        }
        catch(NumberFormatException ne)
        {
            System.err.println("Could not parse enrollment value from " + Arrays.toString(enrolls));
            ne.printStackTrace();
            System.exit(BADVALUE);
        }
        

        System.out.println(myhm);

        System.out.println(myhm.get("Monmouth University")); //6500 enrollment value returned
        System.out.println(myhm.get("Unknown University")); //null
        myhm.replace("Monmouth University" , 6000);
        System.out.println(myhm.get("Monmouth University")); //6000 should now be returned
        System.out.println(myhm.containsKey("Monmouth University")); //Will return true
        for(String key : myhm.keySet())
        {
            Integer value = myhm.get(key);
            System.out.println("Key: " + key + "\nValue: " + value + "\n");
        }

    }
}
