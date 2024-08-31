package abhilash_Asignments;

class Sky {
	
	Sky() 
	{
		super(); // Explicitly calling superclass constructor (Object class constructor in this  case)
		
		System.out.println("This is Birds Constructor");
	}
}

class Forest extends Sky 
{
	Forest(String name) 
	{
		System.out.println("this animal constructor");
	}
}

public class Assignment39_NonParameterized extends Animals 
{
	Assignment39_NonParameterized()
	{
		super("Automation_testing"); // Calling superclass constructor with parameter
		
		System.out.println("this is execute constructor");
	}

	public static void main(String[] args) 
	{
		Assignment39_Parameterized h1 = new Assignment39_Parameterized(); // Creating an object of the class
	}
}
