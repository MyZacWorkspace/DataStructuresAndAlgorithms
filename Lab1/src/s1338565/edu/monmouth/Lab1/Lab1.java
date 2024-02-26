package s1338565.edu.monmouth.Lab1;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Lab1 
{
	public static String OUTPUT;

	public static void main(String[] args) 
	{

		if(args.length > 1 || args.length <= 0)
		{
			System.out.println("Supply no more than one command line argument. Program terminated.");
			System.exit(-2);
		}

		OUTPUT = args[0];
		
		try
		{
			PrintStream myps = new PrintStream(OUTPUT);
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

		Student[] students = new Student[Lab1Constants.STARTER];
		students[0] = student1;
		students[1] = student2;
		students[2] = student3;
		students[3] = student4;
		students[4] = student5;

		System.out.println("Size of students array: " + students.length);
		
		System.out.println("Student data: ");
		for(Student s : students)
		{
			System.out.println(s);
		}
		System.out.println("");
		System.out.println("Students who are younger than 20: ");

		for(Student s : students)
		{
			if(s.getAge() < Lab1Constants.AGETHRESHOLD)
				System.out.println(s);

		}
		System.out.println("");
		
		// invoke addStudents to add 2 more Student objects to the existing array

		Student[] newStudents = addStudents(students, Lab1Constants.NUMSTUDENTSTOADD);

		System.out.println("newStudents data: ");
		for(Student s : newStudents)
		{
			System.out.println(s);
		}
		System.out.println("");
		Student[] threeStudents = new Student[Lab1Constants.ADDITIONALARRSIZE];

		for(int s = 0 ;  s < threeStudents.length ; s++)
		{
			threeStudents[s] = newStudents[s];
		}

		System.out.println("First three in newStudents: ");
		for(Student s : threeStudents)
		{
			System.out.println(s);
		}


	}
	
	
	static public Student[] addStudents(Student[] students, int numberOfStudentsToAdd) 
	{
		//
		Student[] studentsplus = new Student[students.length + numberOfStudentsToAdd];
		for(int s = 0; s < students.length ; s++)
		{
			studentsplus[s] = students[s];
		}
		// 2 additional Student object to be added to the array passed in
		Student studentToAdd1 = new Student(200, 22, "Rolf");
		Student studentToAdd2 = new Student(201, 23, "Dan");

		studentsplus[students.length] = studentToAdd1;
		studentsplus[students.length + 1] = studentToAdd2;

		return studentsplus;
	}
	
}
