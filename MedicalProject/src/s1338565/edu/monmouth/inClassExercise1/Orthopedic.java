package s1338565.edu.monmouth.inClassExercise1;

public class Orthopedic extends Doctor 
{

	public Orthopedic(String name)
	{
		super(name, "bones");
	}
	public void orderXRays()
	{
		System.out.println("Get me an XRAY!");
	}
	
	public void fixBrokenBone()
	{
		System.out.println("Get me a cast");
	}
}
