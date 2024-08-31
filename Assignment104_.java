package abhilash_Asignments;

import java.util.ArrayList; //import array list

import java.util.ListIterator;

//PLease use backward iteration using listiterator for arraylist without farward iteration and note down the error?

public class Assignment104_ 
{
			 public static void main(String[] args) 
			 {
		        // Create an ArrayList
				 
		        ArrayList a1 = new ArrayList();
		        
		        a1.add("Abhilash");
		        a1.add("Welcome");
		        a1.add("to");
		        a1.add("automation");
		        a1.add("testing");

		        System.out.println( );
		        
		        // ListIterator method
		        
		        ListIterator a2 = a1.listIterator();  //using ListIterator

		        // Attempting to iterate backward through the list without forward iteration
		        
		        while (a2.hasPrevious())
		        
		        {
		            System.out.println(a2.previous());
		        }
		    }
	
}
