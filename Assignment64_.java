package abhilash_Asignments;

//WAP using finally block in try catch ?

import java.util.IllegalFormatException;

//WAP using finally block in try catch

public class Assignment64_ {

	public static void main(String[] args) {
		try { // try block

			int a = 10 / 0;

			System.out.println("print number 1");
		}

		catch (Exception c) // catch block
		{
			System.out.println(c); // this is for exception

			System.out.println("print number 2");
		}

		finally // finally block
		{

			System.out.println("IM Done");
		}

	}
}
