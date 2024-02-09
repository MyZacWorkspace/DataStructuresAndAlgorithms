package edu.monmouth.Printers;

public class InkJetPrinter extends Object implements Printer
{
    String inkType; 

    public InkJetPrinter(String inkType)
    {
        this.inkType = inkType;
    }

    @Override //Not required but required for this class 
    public void print() 
    {
        System.out.println("Place ink on paper");
    }
}

