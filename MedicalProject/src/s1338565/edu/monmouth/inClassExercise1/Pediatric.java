package s1338565.edu.monmouth.inClassExercise1;

public class Pediatric extends Doctor 
{
	public Pediatric(String name)
	{
		super(name, "Baby Doctor");
		
	}
	
	public void scheduleAppointment()
	{
		System.out.println("Your appointment has been made");
	}
	
	public void giveShot()
	{
		System.out.println("Shot received.");
	}
}
