package edu.monmouth.vehicle;

public class Boat implements Vehicle
{
    private int boatLength;

    public Boat(int boatLength)
    {
        setBoatLength(boatLength);
    }

    public int getBoatLength()
    {
        return boatLength;
    }

    public void setBoatLength(int boatLength)
    {
        this.boatLength = boatLength;
    }

    @Override
    public void go()
    {
        System.out.println(toString() + " spins the propellers!");
    }

    @Override
    public void stop()
    {
        System.out.println(toString() + " slows down to a stop!");
    }

    @Override
    public boolean equals(Object otherObject)
    {
        if(otherObject == null)
        {
            return false;
        }
        else if(!(otherObject instanceof Boat))
        {
            return false;
        }
        
        Boat otherBoat = (Boat) otherObject;

        return this.getBoatLength() == otherBoat.getBoatLength();
    }

    @Override
    public String toString()
    {
        return "Boat with length of " + this.getBoatLength();
    }
}
