package abhilash_Asignments;

//Calling static method inside main method

public class Assignment3 // creating a classs
{

	static void add() // static methord

	{
		int a = 20;
		int b = 10;
		int sum = (a + b);

		System.out.println("Sum Output in StaticMethod :- " + sum);
	}

	public static void main(String[] args)

	{
		add(); // calling of static method we can call without creating any object!

		// System.out.println(sum); // we cant do by this methord
	}
}
