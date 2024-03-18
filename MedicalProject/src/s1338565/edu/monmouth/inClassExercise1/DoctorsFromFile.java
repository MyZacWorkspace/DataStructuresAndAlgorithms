package s1338565.edu.monmouth.inClassExercise1;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import java.util.Iterator; 

public class DoctorsFromFile 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		final String FILENAME = "C:\\Users\\zmact\\GitRepos\\School\\dsalgos\\DataStructuresAndAlgorithms\\MedicalProject\\docData" , DELIMITER = ", ";
		final int FNFEXIT = -1;
		final int READEXIT = -2;
		final int NAMEOFFSET = 0;
		final int SPECIALOFFSET = 1;
		BufferedReader inFile = null;
		
		try
		{
			inFile = new BufferedReader(new FileReader(FILENAME));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Cannot open " + FILENAME + " " + e.getMessage());
			e.printStackTrace();
			System.exit(FNFEXIT);
		}
		
		System.out.println("File opened--reading");

		Set<Doctor> set = new HashSet<>();	
		
	
		String inputString = null;
		
		try
		{
			while((inputString = inFile.readLine()) != null)
			{
				System.out.println("just read " + inputString);
				String parts[] = inputString.split(DELIMITER);
				System.out.println(parts.length);
				Doctor doc = new Doctor(parts[NAMEOFFSET] , parts[SPECIALOFFSET]);
				System.out.println(doc);
				boolean docAdded = set.add(doc);
				System.out.println(docAdded);
			}
		}
		catch(IOException e)
		{
			System.out.println("Cannot read " + FILENAME + " " + e.getMessage());
			e.printStackTrace();
			System.exit(READEXIT);
		}

		Iterator<Doctor> docIter = set.iterator();
		while(docIter.hasNext())
		{
			System.out.println(docIter.next());
		}

		
			Doctor newDoc = new Doctor("rosca" , "computers");
			boolean docThere = set.contains(newDoc);
			System.out.println(newDoc + " " + docThere);
		

	}

}
