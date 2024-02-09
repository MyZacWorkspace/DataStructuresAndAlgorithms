package edu.monmouth.CaeserCipher;

public class Cipher
{
    String message;
    short offset;

    public Cipher(String message, short offset)
    {
        this.message = message;
        this.offset = offset;
    }

    public String encode()
    {
        int position = 0;
        String encoded = "";
        for(int i = 0 ; i < message.length() ; i++)
        {
            position = ((int) (message.charAt(i) + offset));
            if(position > 122) //goes beyond z
            {
                //position - 122 + 96 gives us correct character position
                encoded += ((char) (position - 26));
            }
            else
            {
                encoded += (char) position;
            }
        }
        
        message = encoded;

        return encoded;
    }

    public void println()
    {
        System.out.println(message);
    }
}