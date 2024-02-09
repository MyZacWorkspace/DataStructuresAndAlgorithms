package edu.monmouth.Vehicles;

public class Boat implements Vehicle
{
    @Override
    public void stop()
    {
        System.out.println("Anchor");
    }

    @Override
    public void go()
    {
        System.out.println("Steam Engine");
    }
}
