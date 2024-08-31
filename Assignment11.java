package abhilash_Asignments;

//_ifElse statement 4 else if block statements

public class Assignment11 // class
{

	public static void main(String[] args) // main method

	{
		int a = 7;

		if (a < 0) //Given statement is false  so it will not excute

		{
			System.out.println("a is negetive");
		}

		else if (a == 0) // Given statement is false  so it will not excute

		{
			System.out.println("a is equal to zero.");
		}

		else if (a > 0 && a <= 5) // Given statement is false  so it will not excute
		{
			System.out.println("a is grater than 0 and a is lesss or equal to five");
		}

		else if (a > 5 & a < 10) // the given Statement is true it will start excute

		{
			System.out.println("A is grater than five and A is lesser than ten");
		}

		else {
			System.out.println("a is odd and greater than 10.");
		}
	}
}
