package edu.monmouth.CaeserCipher;
public class CaeasarCipherClient 
{
    public static void main(String[] args) throws Exception 
    {
        final short OFF = 3;
        Cipher c = new Cipher("hello", OFF);

        System.out.println("Before encryption: ");
        c.println();

        c.encode();

        System.out.println("After encryption: ");
        c.println();


    }
}
