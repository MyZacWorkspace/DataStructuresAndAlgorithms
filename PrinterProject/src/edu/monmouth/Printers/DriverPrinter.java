 package edu.monmouth.Printers;
 
 public class DriverPrinter
 {
    public static void main (String[] args)
    {
        InkJetPrinter ijp = new InkJetPrinter("EPSON");
        ijp.print();
        LaserPrinter lp = new LaserPrinter("HP");
        lp.print();

        Printer printer = new InkJetPrinter("Canon");
        //InkJetPrinter is-a printer 

    }

    static void printType(Printer p)
    {
        p.print();
    }
 }