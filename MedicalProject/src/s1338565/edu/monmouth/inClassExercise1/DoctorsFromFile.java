package s1338565.edu.monmouth.inClassExercise1;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DoctorsFromFile 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		final String FILENAME = "docData" , DELIMITER = ", ";
		final int FNFEXIT = -1;
		final int READEXIT = -2;
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
		
		String inputString = null;
		
		try
		{
			while((inputString = inFile.readLine()) != null)
			{
				System.out.println("just read " + inputString);
				String parts[] = inputString.split(DELIMITER);
				System.out.println(parts.length);
				System.out.println(new Doctor(parts[0] , parts[1]));
			}
		}
		catch(IOException e)
		{
			System.out.println("Cannot read " + FILENAME + " " + e.getMessage());
			e.printStackTrace();
			System.exit(READEXIT);
		}
		

	}

}
