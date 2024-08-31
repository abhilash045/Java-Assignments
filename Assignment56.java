package abhilash_Asignments;

//WAP using switch case

import java.util.Scanner; //java . uitle pacakege for scanner class

public class Assignment56 {
	
	//WAP using switch case ?

	public static void main(String[] args) // main method
	{
		System.out.println("select the required email to register");

		Scanner s1 = new Scanner(System.in); // scanner class
		
		int b = s1.nextInt(); // decleration

		switch (b) // switch class with cases
		{

		case 1:

			System.out.println("register with the gmail id");
			break;

		case 2:
			System.out.println("register with the ymail id");
			break;

		case 3:
			System.out.println("register with the outlook mail id");
			break;

		case 4:
			System.out.println("login with hotmail.com");
			break;

		default: // default case which is used to instructe wheather the data entered is invald
					// or valid by human

			System.out.println("invalid input to register the email id ");

		}

	}
}
