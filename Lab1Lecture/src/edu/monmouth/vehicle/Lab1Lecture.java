package edu.monmouth.vehicle;

import java.io.PrintStream;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Iterator;

public class Lab1Lecture 
{

	public static void main(String[] args) 
	{
		final int BADARGS = -1;
		final int BADFILE = -2;
		// verify there is 1 and only 1 cmd arg-exit if not
		if(args.length != 1)
		{
			System.out.println("Supply one and only one command line argument");
			System.exit(BADARGS);
		}
		// direct standard out & err to the file name in the cmd arg
		PrintStream myps = null;
		try
		{
			myps = new PrintStream(args[0]);
			System.setErr(myps);
			System.setOut(myps);
		}
		catch(IOException ioe)
		{
			System.out.println("Could not redirect stderr and stdout to " + args[0] + " " + ioe.getMessage());
			ioe.printStackTrace();
			System.exit(BADFILE);
		}
		// declare a List (named list) that stores Vehicle objects
		
		// it can refer to an ArrayList or a LinkedList
		List<Vehicle> list = new ArrayList<Vehicle>();
		
		// populate the list with Cars & Boats 
		
		list.add(new Car(1));
		list.add(new Car(3));
		list.add(new Car(4));
		list.add(new Car(10));
		list.add(new Boat(12));
		list.add(new Boat(15));
		list.add(new Boat(22));
		list.add(new Boat(25));
		list.add(new Boat(26));
		
		
		// using a ListIterator, iterate forward thru the list, printing each Vehicles data and go and stop
		System.out.println("Iterating forward through list");
		ListIterator<Vehicle> litv = list.listIterator();
		Vehicle v = null;
		while(litv.hasNext())
		{
			v = litv.next();
			System.out.println(v);
			v.go();
			v.stop();
		}
		// using a ListIterator, iterate backwards thru the list, printing each Vehicles data and go and stop
		System.out.println("Iterating backwards through list");
		v = null;
		while(litv.hasPrevious())
		{
			v = litv.previous();
			System.out.println(v);
			v.go();
			v.stop();
		}
		// print the number of elements in the list
		System.out.println("List list is size: " + list.size());
		
		//System.out.println(list); //Testing
		Car deleteMe = new Car(4);
		// delete the Car declared above from the List
		list.remove(deleteMe);
		
		// using an Iterator, iterate forward thru the list, printing each Vehicle
		System.out.println("Iterating forward after removal of Car with engineSize 4");
		Iterator<Vehicle> it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		Vehicle findMe0 = new Car(0);
		// using a method of the List interface determine if findMe0 is in the list-print result
		System.out.println(findMe0 + " is present in list: " + list.contains(findMe0));
				
		// using a method of the List interface determine if findMe3 is in the list-print result
		Vehicle findMe3 = new Car(3);

		System.out.println(findMe3 + " is present in list: " + list.contains(findMe3));
		
		findMe3 = null;
		// findMe3 has been reassigned-determine if findMe3 is in the list-print result
		System.out.println(findMe3 + " is present in list: " + list.contains(findMe3));
		
		Boat deleteBoat = new Boat(15);	
		// delete the Boat declared above from the List

		list.remove(deleteBoat);
		
		// using an Iterator, iterate forward thru the list, printing each Vehicle
		System.out.println("Iterating forward after removal of Boat with boatLength of 15");

		it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		// determine the number of Vehicles in the List
		int numVehicles = list.size();
		// use this to declare & size an array of references to Vehicles
		Vehicle[] vs = new Vehicle[numVehicles]; 
		
		// using a List method transfer the List to the array
		vs = list.toArray(vs);
		
		// iterate thru the array, printing out each Vehicle
		System.out.println("Contents of array");

		for(Vehicle thisVehicle : vs)
		{
			thisVehicle.go();
			thisVehicle.stop();
		}
		

	}

}
