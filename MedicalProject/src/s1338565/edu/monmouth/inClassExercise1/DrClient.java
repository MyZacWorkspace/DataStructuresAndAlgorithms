package s1338565.edu.monmouth.inClassExercise1;

public class DrClient 
{
	public static void main(String[] args)
	{
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
