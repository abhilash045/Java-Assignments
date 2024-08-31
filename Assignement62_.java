package abhilash_Asignments;

import java.util.InputMismatchException; 

import java.util.Scanner;

//WAP in which age,salary,your_weight,are_you_student with try catch block

public class Assignement62_ 
{
	
	public static void main(String[] args)
	{
		
		Scanner x1 = new Scanner (System.in);
		//System.out.println(x1);
		
		try {
			
			System.out.println("Enter the Age: ");
			x1.nextInt();
			
			
			System.out.println("Enter the Salary");
			x1.nextInt();
			
			System.out.println("Enter ARE YOU A STUDENT");
			x1.hasNextBoolean();
			
			
			Scanner s2 = new Scanner (System.in);
			
			System.out.println("Enter you weight");
			
			s2.nextInt();
			
			System.out.println("thank you");
			
		}
		
		catch (InputMismatchException co)           //catch block 
		{
			System.out.println("please enter valid details ");
			
		}
		
	
	}
	
}
