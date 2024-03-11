package s1338565.edu.monmouth.inClassExercise1;

public class Doctor 
{
	public static int NUMDOCS = 0;

	private String name, specialization;

	public String getName() 
	{
		return name;
	}
	
	public Doctor(String name, String specialization) 
	{
		NUMDOCS++;
		System.out.println("Doctor constructor");
		this.name = name;
		this.specialization = specialization;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getSpecialization() 
	{
		return specialization;
	}
	
	public void setSpecialization(String specialization) 
	{
		this.specialization = specialization;
	}
	
	@Override
	public String toString() {
		return "Doctor [name=" + name + ", specialization=" + specialization + "]";
	}
	
	
	

}
