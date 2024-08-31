package abhilash_Asignments;

//Write a program on combination of method overloading and constructor overloading

public class Assignment15_ // classs
{
	static void add() // static method
	{
		System.out.println("This is methord overLoading");
	}

	Assignment15_() // constructor method
	{
		System.out.println("This construction OverLoading");
	}

	public static void main(String[] args) // main method

	{
		add(); // We can call the static method without creating any object
		
		
		// object created for constructor
		Assignment15_ n1 = new Assignment15_(); // this Constructive over loading
	}
}
