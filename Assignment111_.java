package abhilash_Asignments;

import java.util.ArrayList;
import java.util.ListIterator;

//WAP- Iterator in concept of ListIterator ?

public class Assignment111_ {

	public static void main(String[] args) {
		ArrayList L1 = new ArrayList();

		L1.add("Abhilash");
		L1.add("Prashanth");
		L1.add("Vishnu Vardhan");
		L1.add("Pavan");
		L1.add("Sami");
		L1.add("Charan");

		System.out.println(L1);

		ListIterator L2 = L1.listIterator();

		while (L2.hasNext())
		{
			System.out.println(L2.next());
		}

		System.out.println("---------------------------------------------------------");

		while (L2.hasPrevious()) 
		{
			System.out.println(L2.previous());
		}
	}
}
