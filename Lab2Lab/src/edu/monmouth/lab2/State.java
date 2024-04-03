package edu.monmouth.lab2;

public class State 
{
    private String name;
    private int coastLength;
    private String stateBird;
    
    public State(String name, int coastLength, String stateBird)
    {
        setName(name);
        setCoastLength(coastLength);
        setStateBird(stateBird);
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setCoastLength(int coastLength)
    {
        this.coastLength = coastLength;
    }

    public void setStateBird(String stateBird)
    {
        this.stateBird = stateBird;
    }

    public String getName()
    {
        return name;
    }

    public int getCoastLength()
    {
        return coastLength;
    }

    public String getStateBird()
    {
        return stateBird;
    }

    @Override
    public boolean equals(Object otherObject)
    {
        if(otherObject == null)
        {
            return false;
        }
        else if(!(otherObject instanceof State))
        {
            return false;
        }
        
        State otherSt = (State) otherObject;

        if(otherSt.getName() == getName() && otherSt.getCoastLength() == getCoastLength() && otherSt.getStateBird() == getStateBird())
        {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        return getName().hashCode() + getCoastLength() + getStateBird().hashCode();
    }

    @Override
    public String toString()
    {
        return "State of " + name + ", coast length " + coastLength + ", State Bird " + stateBird;
    }
}
