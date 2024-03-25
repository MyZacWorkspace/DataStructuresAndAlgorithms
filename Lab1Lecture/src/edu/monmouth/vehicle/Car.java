package edu.monmouth.vehicle;

public class Car implements Vehicle
{
    private int engineSize;

    public Car(int engineSize)
    {
        setEngineSize(engineSize);
    }

    public int getEngineSize()
    {
        return engineSize;
    }

    public void setEngineSize(int engineSize)
    {
        this.engineSize = engineSize;
    }

    @Override
    public void go()
    {
        System.out.println(toString() + " accelerates!");
    }

    @Override
    public void stop()
    {
        System.out.println(toString() + " brakes!");
    }

    @Override
    public boolean equals(Object otherObject)
    {
        if(otherObject == null)
        {
            return false;
        }
        else if(!(otherObject instanceof Car))
        {
            return false;
        }
        
        Car otherCar = (Car) otherObject;

        return this.getEngineSize() == otherCar.getEngineSize();
    }

    @Override
    public String toString()
    {
        return "Car with engine size " + getEngineSize();
    }
}
