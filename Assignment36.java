package abhilash_Asignments;

//Find % operator using scanner class

import java.util.Scanner; //importing java util

public class Assignment36 // creating the class
{

	public static void main(String[] args) // main method
	{

		Scanner m1 = new Scanner(System.in); // creating the scanner

		// System.out.println(m1); //we can use this utlization

		System.out.println("enter the value of int for modules");

		int a = m1.nextInt();

		System.out.println("enetr the value of int b for modules");

		int b = m1.nextInt();

		int modulus = a % b;

		System.out.println("result " + modulus);

	}
}
