package edu.monmouth.linkedStack;
import java.util.Arrays;

public class ArrayStack 
{
    private Object[] myArr;
    public ArrayStack()
    {
        myArr = new Object[0];
    }
    public ArrayStack(int stackSize)
    {
        myArr = new Object[stackSize];
    }

    public Object top() throws StackUnderflowException
    {
        if(myArr.length == 0)
        {
            throw new StackUnderflowException("there is nothing in the list!");
        }

        return myArr[0];
    }

    public Object pop() throws StackUnderflowException
    {
        if(myArr.length == 0)
        {
            throw new StackUnderflowException("there is nothing in the list!");
        }

        Object obj = myArr[0];
        myArr = Arrays.copyOfRange(myArr, 1, myArr.length);

        return obj;
    }

    public void push (Object obj) throws StackOverflowException
    {
        int nullCounter = 0;
        for(Object o : myArr)
        {
            if(o == null)
            {
                nullCounter++;
            }
        }

        if(nullCounter == 0)
        {
            throw new StackOverflowException("Maximum size of array-stack reached!");
        }

        //FIXME create a new array that is a copy but with additional slot at beginning, which will be the new element
    }

    public boolean isEmpty()
    {
        try
        {top();}
        catch(StackUnderflowException sue)
        {
            return true;
        }
        return false;
    }


    @Override
    public String toString()
    {
        return Arrays.toString(myArr);
    }

    public void print()
    {
        System.out.println(toString());
    }

}
