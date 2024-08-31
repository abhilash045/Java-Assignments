package abhilash_Asignments;

import java.util.InputMismatchException;

//WAP using multiple catch block ?

public class Assignment63_ {

	public static void main(String[] args) {

		try {
			int a = 1 / 0;
			System.out.println(a);
		}

		catch (InputMismatchException a) {
			System.out.println("The Input you have not Matched");
		}

		catch (ArithmeticException a) {
			System.out.println("Arthemetic error occured");
		}

		finally {
			System.out.println("Thank you");
		}
	}

}
