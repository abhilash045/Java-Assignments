package abhilash_Asignments;


//WAP using ListIterator ?


import java.util.ArrayList;
import java.util.ListIterator;

public class Assignment106_ {
	
	public static void main(String[] args) {
		
		
		ArrayList A1 = new ArrayList ();
		
		A1.add(12);
		A1.add(02);
		A1.add(33);
		A1.add(40);
		A1.add(5);
		A1.add(72);
		
		System.out.println(A1);
		 
		ListIterator  List =  A1.listIterator();  //List.Iterator retun type list iterator
		
		while (List.hasNext())
		{
			System.out.println(List.next());
		}
		
		System.out.println("--------------------------------------------------------------");
		
		while (List.hasPrevious())
		{
			System.out.println(List.previous());
		}
		
	
		
	}

}
