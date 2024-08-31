package abhilash_Asignments;

import java.util.Vector;

/*"WAP on Vector methods
           addElements();
           firstElement();
           lastElement();
           removeElement();
           removeElementAt();
           removeAllElements()
           capacity();"
 */

public class Assignment114_ {
	
	public static void main(String[] args) {
		
		
		Vector V1 = new Vector ();
		
		V1.addElement("Abhilash");
		V1.addElement("Ramesh");
		V1.addElement("Rajesh");
		V1.addElement("Vamshi");
		V1.addElement("Manish");
		
		Object First = V1.firstElement();  
		System.out.println("First Elements :- " + First);
		
		Object Last = V1.lastElement();
		System.out.println("Last Elements : " + Last);
		
		V1.removeElement("Rajesh");
		
		System.out.println("After Removed specfic Elements:- " + V1);
		
		V1.removeAllElements();
		System.out.println("Removing all the Elements : " + V1);
		
		V1.capacity();
		System.out.println("Capacity :-   " + V1.capacity());
			
		
	}

}
