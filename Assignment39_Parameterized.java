package abhilash_Asignments;

// super calling with paramterised and non parameterised using Constructor

//parameterized contructor 

class Birds 
{
	Birds() 
	{
		System.out.println("This is Birds Constrctor");
	}
}
class Animals extends Birds {

	Animals(String name)
	{
		System.out.println("this animal constructor");
	}
}

public class Assignment39_Parameterized extends Animals
{
	Assignment39_Parameterized()
	{
		super("Tigers"); // parameterized statement

		System.out.println("this is excute constructor");
	}

	public static void main(String[] args)
	{
		Assignment39_Parameterized h1 = new Assignment39_Parameterized(); // creating the object to class
	}

}