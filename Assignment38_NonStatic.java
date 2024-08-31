package abhilash_Asignments;

//Multi level inheritance using static and nonstatic methods


//Supermost class with non-static method
class Ameerpet
{
	void add()
	{
		System.out.println("This is non-static method in supermost class");
	}
}

//Subclass inheriting from Ameerpet with another non-static method
class Srnagar extends Ameerpet
{
	void sub()
	{
		System.out.println("This is non-static method in super class");
	}
}

//Child class demonstrating multilevel inheritance

public class Assignment38_NonStatic extends Srnagar
{
	public static void main(String[] args)
	{
		// Creating an object of the child class to call non-static methods
		
		Assignment38_NonStatic A1 = new Assignment38_NonStatic();

		A1.add(); // Calling non-static method from Ameerpet
		A1.sub(); // Calling non-static method from Srnagar
	}
}
