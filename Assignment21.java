package abhilash_Asignments;

//Calling Non-static method inside main method

public class Assignment21 // class inside the package
{
	public void add() // non static method
	{
		System.out.println("this is Nonstatic Methord1 ");
	}
	public void sub() // non static method
	{

		System.out.println("this is nonstatic methord2");
	}
	public static void main(String[] args) // main method
	{
		Assignment21 N1 = new Assignment21(); //Creating an object for class and calling with the help of ref variable!

		N1.add();
		N1.sub();
	}
}
