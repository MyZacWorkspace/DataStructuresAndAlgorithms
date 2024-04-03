package edu.monmouth.lab2;

import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class Lab2 
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
			System.err.println("Could not redirect stderr and stdout to " + args[0] + " " + ioe.getMessage());
			ioe.printStackTrace();
			System.exit(BADFILE);
		}


		State newJersey = new State("New Jersey", 130,  "Eastern Goldfinch");
		State newYork = new State("New York", 127,  "Eastern Bluebird");
		State pennsylvania = new State("Pennsylvania", 0,  "Ruffled Grouse");
		State delaware = new State("Delaware", 28,  "Blue Hen");
		State maryland = new State("Maryland", 31,  "Oriole");
		State connecticut = new State("Connecticut", 96,  "Robin");
		State newJersey2 = new State("New Jersey", 130,  "Eastern Goldfinch");
		
		Governor njGov = new Governor("Murphy", 65);
		Governor nyGov = new Governor("Hochul", 64);
		Governor paGov = new Governor("Shapiro", 49);
		Governor deGov = new Governor("Carney", 66);
		Governor mdGov = new Governor("Moore", 44);
		Governor ctGov = new Governor("Lamont", 69);

		
		// verify State hashCode and equals methods are consistent
		System.out.println("States");
		System.out.println("New Jersey and New Jersey 2 (hash)");
		System.out.println(newJersey.hashCode() == newJersey2.hashCode());
		System.out.println("New Jersey and New Jersey 2 (equals)");
		System.out.println(newJersey.equals(newJersey2));
		System.out.println("New Jersey and New York (hash)");
		System.out.println(newJersey.hashCode() == newYork.hashCode());
		System.out.println("New Jersey and New York (equals)");
		System.out.println(newJersey.equals(newYork));
		
		
		// verify Governor hashCode and equals methods are consistent
		System.out.println("Governors");
		System.out.println("New Jersey and New Jersey (hash)");
		System.out.println(njGov.hashCode() == njGov.hashCode());
		System.out.println("New Jersey and New Jersey (equals)");
		System.out.println(njGov.equals(njGov));
		System.out.println("New Jersey and New York (hash)");
		System.out.println(njGov.hashCode() == nyGov.hashCode());
		System.out.println("New Jersey and New York (equals)");
		System.out.println(njGov.equals(nyGov));

		// create a HashSet that can only house State objects
		Set<State> hst = new HashSet<State>();

		// attempt to insert all 7 State objects to the HashSet
		System.out.println("Just added NJ " + hst.add(newJersey));
		System.out.println("Just added NY " + hst.add(newYork));
		System.out.println("Just added PA " + hst.add(pennsylvania));
		System.out.println("Just added DE " + hst.add(delaware));
		System.out.println("Just added MA " + hst.add(maryland));
		System.out.println("Just added CT " + hst.add(connecticut));
		System.out.println("Just added NJ2 " + hst.add(newJersey2));
		// print whether or not the object was added or not

		// iterate through the HashSet for each State
		Iterator<State> it = hst.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		// create a HashMap associating State and Governor objects
		HashMap<State, Governor> hm = new HashMap<State, Governor>();

		hm.put(newJersey, njGov);
		hm.put(newYork, nyGov);
		hm.put(pennsylvania, paGov);
		hm.put(delaware, deGov);
		hm.put(maryland, mdGov);
		hm.put(connecticut, ctGov);
		// for the 6 unique State objects insert State and Governor objects 
		
		// print the number of elements in the HashMap
		System.out.println("Hash Map Size: " + hm.size());
		// print all elements in the HashMap
		for(State key : hm.keySet())
		{
			System.out.println("Key: " + key);
			System.out.println("Value: " + hm.get(key));
		}
		// print the governor for newYork State object
		System.out.println("New York Governor: " + hm.get(newYork));
		// determine if the State object newJersey exists as a key in the HashMap containing states
		System.out.println("New Jersey is a key in the HashMap, " + hm.containsKey(newJersey));
		if(hm.containsKey(newJersey))
		{
			System.out.println(hm.get(newJersey));
		}
		// if it exists, print the governor
		
		State rhodeIsland = new State("Rhode Island", 40, "Rhode Island Red");
		// determine if the State object rhodeIsland exists as a key in the HashMap containing states
		System.out.println("Rhode Island is a key in the HashMap, " + hm.containsKey(rhodeIsland));

    }

}
