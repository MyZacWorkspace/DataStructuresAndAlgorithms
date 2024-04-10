package edu.monmouth.linkedStack;
public class StackPretenderClient
{
    public static void main(String[] args)
    {
        ArrayStack as = new ArrayStack(10);
        
        try
        {
            as.print();
            as.top();
            as.print();
            as.pop();
            as.print();
            as.push("Hello");
            as.print();
        }
        catch(StackUnderflowException sue)
        {
            System.err.println("StackUnderflowException has occured, " + sue.getMessage());
            sue.printStackTrace();
            System.exit(-1);
        }
        catch(StackOverflowException soe)
        {
            System.err.println("StackOverflowException has occured, " + soe.getMessage());
            soe.printStackTrace();
            System.exit(-2);
        }
        
    }
}
