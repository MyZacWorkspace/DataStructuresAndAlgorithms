package s1338565.edu.monmouth.inClassExercise1;

import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;

public class DoctorListClient
{
    public static void main(String[] args)
    {
        List<Doctor> linkedlist = new LinkedList<>();

        try
		{
			Doctor doc = new Doctor("Dr. Smith", "Sports Medicine");
			Orthopedic orthoDoc = new Orthopedic("Dr. Jon");
			Pediatric pedi = new Pediatric("Dr. Tommy");
			//Doctor mac = new Doctor("Mackenzie" , "Bone Medicine");

            linkedlist.add(doc);
            linkedlist.add(orthoDoc);
            linkedlist.add(pedi);
            //.add(mac);

			if(Doctor.NUMDOCS > 3)
			{
				throw new DoctorException("Max number of doctors reached!");
			}
		}
		catch(DoctorException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

        //You can iterate through linked lists like so.
        //Iterators can make modifications as the list runs 
        ListIterator<Doctor> listIterator = linkedlist.listIterator();

        while(listIterator.hasNext() == true)
        {
            System.out.println(listIterator.next());
        }

        //ListIterator<Doctor> listIterator = linkedlist.listIterator();

        while(listIterator.hasPrevious() == true)
        {
            System.out.println(listIterator.previous());
        }

        System.out.println(linkedlist.contains(new Doctor("Dr. Smith" , "Sports Medicine")));
        //Doctor d1 = new Doctor("Mario" , "Pipes");
        //Doctor d2 = d1;
        //System.out.println(d2.equals(d1));
        //System.out.println(new Doctor("Mario" , "Pipes").equals(new Doctor("Mario" , "Wrenches")));
    }
}