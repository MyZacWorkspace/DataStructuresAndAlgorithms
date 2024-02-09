package edu.monmouth.improvedCipher;

public class SubstitutionCipher 
{
    private String m;
    private String c;
    private char[][] letters;


    
    public SubstitutionCipher(String m, String c)
    {
        this.m = m;
        this.c = c;
        letters = new char[26][2];
        for(int r = 0; r < letters.length; r++)
        {
            //System.out.println((char)( r + 97));
            letters[r][0] = (char)( r + 97);//alphabet
            //System.out.println(c.charAt(r));
            letters[r][1] = c.charAt(r);//encoded
        }

    }

    public String encode()
    {
        String encoded = "";
        int code;
        char chr;

        int matchInd;
        boolean matchFound = false;

        for(int c = 0 ; c < m.length() ; c++) //For all characters in message
        {
            chr = m.charAt(c);
            code = (int)m.charAt(c);
            
            if(code >= 97 && code <= 122 ) //If it is in the alphabet
            {

                int find = 0;
                matchFound = false;
                while(!matchFound)
                {

                    System.out.println(letters[find][0]);
                    if((int) letters[find][0] - code == 0)
                    {
                        encoded += letters[find][1];
                        matchFound = true;
                        /*
                        matchInd = find;
                        matchFound = true;
                        */
                    }

                    find++;
                }

            }
            else
            {
                encoded += " ";
            }
        }

        return encoded;
    }
    
    /*My version of encode(), without using data structures
    public SubstitutionCipher(String m, String c)
    {
        this.m = m;
        this.c = c;
    }
    public String encode()
    {
        int code = 0;
        String encoded = "";
         
        for(int i = 0 ; i < m.length() ; i++)
        {

            code = (int) m.charAt(i);

            if(code >= 97)
            {
                code = code - 97;
                
                encoded += c.substring(code,code+1);
            }
            else
                encoded += " ";
        }

        return encoded;
    }
    */
}
