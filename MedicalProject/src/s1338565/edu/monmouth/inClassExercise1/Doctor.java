package s1338565.edu.monmouth.inClassExercise1;

public class Doctor 
{
	private String name, specialization;
	private static int numDocs;
	public String getName() 
	{
		return name;
	}
	
	public Doctor(String name, String specialization) 
	{
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
