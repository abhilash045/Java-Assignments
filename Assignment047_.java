package abhilash_Asignments;

//WAP in which super most interface class having 2AM, abstract class having 2AM&2CM, subclass having 2CM

interface School 
{
	void Classroom1 ();
	
	void Classroom2 ();
}

abstract class College implements School
{
	
	abstract void Mechanical ();
	
	abstract void Civil ();
	
	void Classroom3 ()
	
	{
		System.out.println("Classroom3");
	}
	
	void Classroom4 ()
	{
		
		System.out.println("Classroom4");
		
	}	
}

public class Assignment047_  extends College
{

	@Override
	public void Classroom1()
	{
		
		System.out.println("Classroom1");
	}

	@Override
	public void Classroom2() 
	{
	
		System.out.println("classroom2");
		
	}

	@Override
	void Mechanical()
	{
		
		System.out.println("Mechnaical");
	}

	@Override
	void Civil() 
	{
		System.out.println("Civil");
		
	}
	
	static void manualTesting ()
	{
		System.out.println("Manualtesting");
	}
	
	static void AutomationTesting ()
	{
		System.out.println("AutomationTesting");
	}
	
	public static void main(String[] args)
	{
		Assignment047_ a1 = new Assignment047_();
		
		a1.Classroom1();
		a1.Classroom2();
		a1.Mechanical();
		a1.Civil();
		a1.Classroom1();
		a1.Classroom2();
		a1.manualTesting();
		a1.AutomationTesting();
	}
}

