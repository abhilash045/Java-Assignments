package abhilash_Asignments;

//Intialisation and declartion of all methods of scanner class

import java.util.Scanner;  //scanner class is a public specfier 

public class Assignment33   //class 
{
	
	public static void main(String[] args)  //main method 
	{
		 Scanner v1 = new Scanner(System.in);  //scanner importing 
		 
		 //System.out.println(v1);
		 
		 System.out.println("enter the int value ;");
		 
		int a = v1.nextInt();                             //int data type
		
		System.out.println("enter value : " + a);
	
	 
		 System.out.println("enter the int Byte ;");
		 
		byte Byte_value = v1.nextByte();
		
		System.out.println("enter value : " + Byte_value);
		
		
		System.out.println("enter the value boolean");
		
		boolean boolean_value = v1.nextBoolean();  
		
		System.out.println("entered value ;" + boolean_value);
		
		
		System.out.println("Enter the value of long_data");
		
		double double_value = v1.nextDouble();
		
		System.out.println("entered value of double: " + double_value);
		
		
		
		System.out.println(" enter the value float");
		
		float float_value = v1.nextFloat();
		
		System.out.println("result-->" + float_value);
		
		System.out.println("entered value ");
	 
	}	

}
