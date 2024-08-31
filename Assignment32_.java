package abhilash_Asignments;

//Using scanner class static and nonstatic lets do Addition,Substraction ,
//Multiplicaion division and modulus of 4 diff method.

import java.util.Scanner; //scanner class  imported

public class Assignment32_ {

	// Static method for addition
	static int add(int a, int b) {
		return a + b;
	}

	// Static method for subtraction
	static int subtract(int a, int b)

	{
		return a - b;
	}

	// Non-static method for multiplication

	int multiply (int a, int b)
	
	{return a * b; }

	// Non-static method for division
	 double divide(int a, int b) 
	 
	 {	return a / b;	}

	// Non-static method for modulus
	public int modulus(int a, int b)
	
	{	return a % b;}

	public static void main(String[] args) // main method
	{
		Scanner scanner = new Scanner(System.in); // scanner class inside the main method

		System.out.print("Enter the first number: ");

		int a1 = scanner.nextInt(); // using scanner class int

		System.out.print("Enter the second number: ");

		int b1 = scanner.nextInt(); // using scanner class int

		// Using static methods

		int add = add(a1, b1);
		int sub = subtract(a1, b1);

		// Using non-static methods

		Assignment32_ c1 = new Assignment32_(); // creating an object for class to access non static method

		int a = c1.multiply(a1, b1);
		double b = c1.divide(a1, b1);
		int c = c1.modulus(a1, b1);

		System.out.println("Addition: " + add); // implementation
		System.out.println("Subtraction: " + sub);
		System.out.println("Multiplication: " + a);
		System.out.println("Division: " + b);
		System.out.println("Modulus: " + c);

	}
}
