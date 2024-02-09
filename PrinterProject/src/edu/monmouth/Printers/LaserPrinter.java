package edu.monmouth.Printers;

public class LaserPrinter implements Printer
{
    String tonerType; 
    public LaserPrinter(String tonerType)
    {
        this.tonerType = tonerType;
    }

    @Override //Not required but required for this class 
    public void print() 
    {
        System.out.println("Place toner on paper");
    }
}
