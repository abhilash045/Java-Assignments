package abhilash_Asignments;

// Assignment 14  WAP on constructor calling with and without parameters

public class Assignment14 {

	public Assignment14() // constructor with out parameter
	{
		System.out.println("This is constructer without parameter");
	}

	public Assignment14(String name) // constructor with parameter
	{
		System.out.println("This constructor with parameter");
	}

	public static void main(String[] args) // main method
	{
		//calling the constructor without parameters
		Assignment14 n1 = new Assignment14(); 
				
		// constructor with parameter
		Assignment14 n2 = new Assignment14("Testing");
	}
}
