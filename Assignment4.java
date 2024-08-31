package abhilash_Asignments;

//Addition,sub,multiplication and divison

public class Assignment4 // class is created

{
	static void sum() // staticMethods
	{
		int a = 5;
		int b = 3;
		int sum = a + b;

		System.out.println("Addition in Static Method:-  " + sum); // Output: Sum: 8
	}

	static void sub() // subtraction
	{
		int no1 = 10;
		int no2 = 30;

		int sub = no1 - no2;
		System.out.println("Subtraction in Static Method:-  " + sub); // output -20
	}

	static void mul() {
		int no1 = 5;
		int no2 = 2;

		int mul = no1 * no2;
		System.out.println("Multipication in Static Method:-  " + mul); // output 10
	}

	static void div()

	{
		int no1 = 10;
		int no2 = 2;

		int div = no1 / no2;

		System.out.println("Divisition in Static Method:-  " + div); // output 5 quotient

	}

	public static void main(String[] args) // main method
	{
		sum(); // calling staticmethod without creating object for the class
		sub();
		mul();
		div();
	}
}
