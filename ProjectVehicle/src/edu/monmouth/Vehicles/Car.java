package edu.monmouth.Vehicles;

public class Car implements Vehicle
{
    @Override
    public void stop()
    {
       System.out.println("Brakes");
    }
  

    @Override
    public void go()
    {
        System.out.println("Wheel turn");

    }
}