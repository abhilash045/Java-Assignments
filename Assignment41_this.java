package abhilash_Asignments;

public class Assignment41_this // class

{
	// without parameter also we can create a constructor

	Assignment41_this(int a) // constructor
	{

		System.out.println("This is First Constructor");
	}

	Assignment41_this(int a, int b) // constructor
	{
		this(01);
		System.out.println("This is second constructor");
	}

	Assignment41_this(int a, double b) // constructor
	{
		this(6, 7);
		System.out.println("This is Third constructor");
	}

	Assignment41_this(double a) // constructor
	{
		this(10, 20.2); // ----------------------------------------this calling statement it can be
						// first line of every cnstructor

		System.out.println("This is Fourth constructor");
	}

	public static void main(String[] args) // main method
	{
		Assignment41_this a2 = new Assignment41_this(2.55); // creating an object to the class
	}
}
