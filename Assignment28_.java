package abhilash_Asignments;

// WAP on area of circle using maths class

import java.util.Scanner;  //Importing scanner class

public class Assignment28_ {

	public static void main(String[] args) // main method
	{
		Scanner s1 = new Scanner(System.in); // scanner class in side method


		System.out.print("Enter the radius of the circle: ");
		

		double radius = s1.nextDouble(); // using scanner class double

		// Calculate the area using Math.PI and Math.pow
		

		double area = Math.PI * Math.pow(radius, 2);

		System.out.println("The area of the circle: " + area);
	}
}
