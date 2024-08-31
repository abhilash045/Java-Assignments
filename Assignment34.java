package abhilash_Asignments;

//Area of rectangle using Scanner class

import java.util.Scanner;

public class Assignment34 {

	public static void main(String[] args)
	{
		Scanner L1 = new Scanner(System.in);

		// System.out.println(L1); //by using this satement we are unable to get answer in console!

		System.out.println("eneter the area of rectangle");

		double length = L1.nextDouble();

		double width = L1.nextDouble();

		double area = length * width;

		System.out.println("Area of Rectangle :- " + area);
		}
}
