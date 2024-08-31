package abhilash_Asignments;

//WAP using upcasting concept?

class NewOne // NEW Parent class
{
	void numbers() // Non-static Methods there will be ony this methods in "upcasting"
	{

		System.out.println("this is numbers");

	}

	void alphabets() {
		System.out.println("this is alphabets");
	}
}

public class Assignment107_ extends NewOne // sub class get releation with parent class
{
	void Hindi() {

		System.out.println("this is Hindi");

	}

	public static void main(String[] args) // Main method
	{

		NewOne N1 = new Assignment107_(); // creating upcasting for the parent method

		N1.numbers(); // Accessing the parent class method with help of variable given .
		N1.alphabets();
		// N1.Hindi(); //we cannot access the child class method with out creating the
		// object to the child class

	}
}
