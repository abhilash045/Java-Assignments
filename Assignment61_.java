package abhilash_Asignments;

//WAP with simple try catch block

import java.util.InputMismatchException;      

import java.util.Scanner;                       //package

public class Assignment61_ 
{
	
	public static void main(String[] args)   //mainmethod 
	
	{
		    Scanner u1 = new Scanner (System.in);  //scanner class
		
		try {                                              //try block
			System.out.println("Enter the age: ");
			u1.nextInt();	   
		}
		 
		catch (InputMismatchException co)            //catch block
		{
			Scanner u2 = new Scanner(System.in);
			System.out.println("enter the vaid age ");
			u2.nextInt();
		}
	}
	
}
