package edu.monmouth.StringOperations;
//s1338565@monmouth.edu
public class StringOperations 
{
    //Variables
    private StringBuffer sb;

    //Constructor
    public StringOperations(String s)
    {
        sb = new StringBuffer(s);
        //System.out.println(sb.toString());
    }

    //Letters Only, Using a While Loop
    public String lettersOnly()
    {
        int i = 0;
        //A duplicate since we will be making deletions
        StringBuffer s2 = new StringBuffer(sb.toString());
        while(i < s2.length())
        {
            if(!(Character.isLetter(s2.charAt(i))))
            {
                s2.deleteCharAt(i);
            }
            else
            {
                i++;
            }
        }

        return s2.toString();
    }

    //Uppers Only
    public String uppersOnly()
    {
        return sb.toString().toUpperCase();
    }

    //Number of Vowels
    public int numberOfVowels()
    {
        int count = 0;
        
        for(int i = 0 ; i < sb.length(); i++)
        {
            if((sb.charAt(i)+"").equals("a") || (sb.charAt(i)+"").equals("e")
            || (sb.charAt(i)+"").equals("i") || (sb.charAt(i)+"").equals("o")
            || (sb.charAt(i)+"").equals("u"))
            {
                count++;
            }
        }

        return count;
    }

    public int numberOfConsonants()
    {
        int letters = lettersOnly().length();

        int vowels = numberOfVowels();

        return letters - vowels; //Total number of letters minus vowels must be number of consonants
    }

    public String reverseString()
    {
        StringBuffer s2 = new StringBuffer(sb.toString());

        char swap1 = 'a';
        char swap2 = 'a';
        String temp = "";

        for(int i = sb.length() - 1 ; i > sb.length()/2 ; i--)
        {
            //Swap beginning and end
            swap1 = s2.charAt(i);
            swap2 = s2.charAt(sb.length() - 1 - i);
            s2.setCharAt(sb.length() - 1 - i, swap1);
            s2.setCharAt(i, swap2);
        }

        return s2.toString();
    }

    public String getVowels()
    {

        return "";
    }

    public String getConsonants()
    {
        return "";
    }
}
