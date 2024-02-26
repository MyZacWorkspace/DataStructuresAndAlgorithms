package s1338565.edu.monmouth.Lab1;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Lab1 
{
	public static void main(String[] args) 
	{
		try
		{
			PrintStream myps = new PrintStream(Lab1Constants.OUTPUTFILE);
			System.setOut(myps);
			System.setErr(myps);
		}
		catch(FileNotFoundException ioe)
		{
			System.err.print("Cannot redirect stdOut and stderr " + ioe.getMessage());
			ioe.printStackTrace();
			System.exit(-1);
		}
		
		
		
		Student student1 = new Student(100,18,"John"); 
		Student student2 = new Student(101,18,"Jane");
		Student student3 = new Student(102,20,"Larry");
		Student student4 = new Student(103,20,"Karen");
		Student student5 = new Student(104,21,"Karl");
		
		System.out.println("Hi");
		// invoke addStudents to add 2 more Student objects to the existing array
	}
	
	/*
	static public Student[] addStudents(Student[] students, int numberOfStudentsToAdd) 
	{
		// 2 additional Student object to be added to the array passed in
		Student studentToAdd1 = new Student(200, 22, "Rolf");
		Student studentToAdd2 = new Student(201, 23, "Dan");
	}
	*/
}
