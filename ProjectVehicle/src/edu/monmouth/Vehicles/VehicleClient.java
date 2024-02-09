package edu.monmouth.Vehicles;

public class VehicleClient
{
    public static void main(String[] args) throws Exception 
    {
        System.out.println("Hello, World!");

        Vehicle v;

        v = new Boat();
        v.go();

        v = new Car();
        v.go();

        Car car = new Car();
        Boat boat = new Boat();

        executeGo(car);
        executeGo(boat);
    }

    public static void executeGo(Vehicle vehicle)
    {
        vehicle.go();
    }
}
