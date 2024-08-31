package abhilash_Asignments;


//"WAP using Iterator (process of iteration through iterable )" 


import java.util.ArrayList;
import java.util.Iterator;

public class Assignment105_ 
{
	public static void main(String[] args)  //main method
	{
		ArrayList L1 = new ArrayList ();  //ArrayList  "it does not have length
		
		L1.add("This");
		L1.add("Automation");    //Adding the "Different types Elements to ArrayList"
		L1.add("testing");
		L1.add("by");
		L1.add("MKT");
		L1.add(42);
		
		System.out.println(L1);	       //Printing the ArrayList Statement
		
			Iterator iterator = L1.iterator();   //using iterator function the list is done iteration
		
			while (iterator.hasNext())       //While loop for iteration with function hasnext is used for print next element
			{ 
	            Object List = iterator.next();
	            
	            System.out.println(List);
	        }
	}
}
