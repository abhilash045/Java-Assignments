package abhilash_Asignments;

//  Assignment 13 Calling Non-Static method  with and without parameters inside main method

public class Assignment13 {

	// non static without parameters

	void message() {
		System.out.println("This non static without parameters");
	}

	void message(String Name) {
		System.out.println("This non static with parameters");
	}

	public static void main(String[] args)  //Main Method

	{
		Assignment13 c1 = new Assignment13();  //Creating an object for the class to call it easly

		c1.message();                //calling non static method with referance variable without parameter
		c1.message("Parameters");	 //calling non static method with referance variable with parameter
	}

}
