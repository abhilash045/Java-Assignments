package abhilash_Asignments;

//WAP to perform add,sub,multi,div using same 2 variables in switch case?

import java.util.Scanner;

//WAP to perform add,sub,multi,div using same 2 variables in switch case

public class Assignment55
{  

	    public static void main(String[] args) //Main method   
	    
	    {
	        Scanner t1 = new Scanner(System.in);  //scanner class is imported
	        
	     
	        
	        System.out.print("Enter the first number: ");
	        
	        double a1 = t1.nextDouble();   
	        
	        System.out.print("Enter the second number: ");
	        
	        double  a2 = t1.nextDouble();   
	        
	        // Input operation choice
	        
	        
	        System.out.println("select the option for opertion required : ");
	         
	        System.out.println("Addition");
	        
	        System.out.println("Subtraction");
	        
	        System.out.println("Multiplication");
	        
	        System.out.println("Division");
	        
	        System.out.print("Enter your choice: ");
	        
	        int choice = t1.nextInt();
	        
	        // Perform the chosen operation
	        
	        switch (choice) {
	            case 1:
	            	
	                System.out.println("Result: " + (a1 + a2));
	                break;
	            case 2:
	                System.out.println("Result: " + (a1 - a2));
	                break;
	            case 3:
	                System.out.println("Result: " + (a1 * a2));
	                break;
	            case 4:
	            	
	            	System.out.println("Result: " + (a1/a2));
	            	
	                break;
	            default:
	                System.out.println("Invalid choice.");
	                break;
	        }

	    }	
}


