package abhilash_Asignments;


//Using scanner class static and nonstatic lets do Addition,Substraction , Multiplicaion division and modulus of 4 diff method.

import java.util.Scanner;   //import java utile 

public class Assignment32 {   //class 
	
//creating scanner globally
	
	static Scanner s1 = new Scanner(System.in);  //scanner class 

	

		static void add()             //static method 
		{
			//System.out.println("Addition" );
			
			//System.out.println("enter the A  number-->");
			
			int a = s1.nextInt();   
			
			//System.out.println("enter the B number");
			
			int b = s1.nextInt();
			
			int add = a+b;
			
			System.out.println("result-->" + add);
	}
	
		static void sub()
		
		{
			System.out.println("Subtraction");
			
			System.out.println("enter the number int a");
			
			int a = s1.nextInt();
			
			System.out.println("enter the number int b");
			int b = s1.nextInt();
			
			int sub = a-b;
			
			System.out.println("result-->" + sub);
			
		
		}
	
	      static void mul()

	      {
	    	  System.out.println("Multipcation");
	    	  System.out.println("Enter the a value ");
	    	  
	    	  int a = s1.nextInt();
	    	  
	    	  System.out.println("enter the number int b");
	    	  
	    	  int b = s1.nextInt();
	    	  
	    	  int mul = a*b;
	    	  
	    	  System.out.println("result-->" + mul);
	    	    
	      }
	      
	      static void div ()
	      {
	    	  System.out.println("Division");
	    	  System.out.println("eneter the  value a");
	    	  
	    	  int a = s1.nextInt();
	    	  
	    	  System.out.println("Enter the value b");
	    	  
	    	  int b = s1.nextInt();
	    	  
	    	  int div = a/b;
	    	  
	    	  System.out.println("result-->" + div);
	    	    
	      }
	
	      static void modulas()
	      {
	    	  System.out.println("modules");
	    	  System.out.println("Enter the value of a");
	    	  
	    	  int a = s1.nextInt();
	    	  
	    	  System.out.println("enter the second value b");
	    	  
	    	  int b = s1.nextInt();
	    	  
	    	  int modulas = a % b;  
	    	  
	    	  System.out.println("result-->" + modulas); 
	      } 
}
