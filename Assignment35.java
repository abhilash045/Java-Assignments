package abhilash_Asignments;

//Circumfernce of circle using Scanner class

import java.util.Scanner; //importing the scanner 

public class Assignment35 {

	public static void main(String[] args) {

		Scanner v1 = new Scanner(System.in); // importing the scanner

		// System.out.println(v1); //by using this sysout we are getting eeror

		System.out.println("enter the  radius of circle");

		double radius = v1.nextDouble();

		double circumfrence = 2 * Math.PI * radius;

		System.out.println("circumfrence of circle:- " + circumfrence);
	}

}
