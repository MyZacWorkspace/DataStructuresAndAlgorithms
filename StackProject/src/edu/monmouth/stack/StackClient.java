package edu.monmouth.stack;

import java.util.Stack;

public class StackClient 
{
    public static void main(String[] args) throws Exception
    {
        Stack<String> stackOfPlates = new Stack<>();
        stackOfPlates.push("Plate A");
        stackOfPlates.push("Plate B");
        stackOfPlates.push("Plate C");
        stackOfPlates.push("Plate D");

        System.out.println(stackOfPlates.pop());
        System.out.println(stackOfPlates.pop());
        System.out.println(stackOfPlates.pop());
        System.out.println(stackOfPlates.peek());
        System.out.println(stackOfPlates.pop());

        //Pop an empty stack? This will cause a runtime exception (it is unchecked before program execution)
        //System.out.println(stackOfPlates.pop());
        System.out.println(stackOfPlates.search("Plate C"));
    }
}
