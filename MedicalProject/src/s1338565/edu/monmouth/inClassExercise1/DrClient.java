package s1338565.edu.monmouth.inClassExercise1;

import java.io.PrintStream;
import java.io.FileNotFoundException;

public class DrClient 
{
	public static void main(String[] args)
	{
		PrintStream myps;
		try
		{
			myps = new PrintStream("C:\\Users\\zmact\\GitRepos\\School\\dsalgos\\datastructuresandalgorithms\\MedicalProject\\Output.txt");
			System.setOut(myps);
			System.setErr(myps);
		}
		catch(FileNotFoundException e)
		{

		}
		
	
		
		try
		{
			Doctor doc = new Doctor("Dr. Smith", "Sports Medicine");
			Orthopedic orthoDoc = new Orthopedic("Dr. Jon");
			Pediatric pedi = new Pediatric("Dr. Tommy");
			Doctor mac = new Doctor("Mackenzie" , "Bone Medicine");

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
		


	}
}
