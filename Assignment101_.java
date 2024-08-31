package abhilash_Asignments;

import java.util.ArrayList;

//WAP using Collection methods?

public class Assignment101_ {
	public static void main(String[] args) {
		ArrayList L1 = new ArrayList(); // creating the Array list

		L1.add("Ben10"); // Adding the values or elements with the help of variablename.add
		L1.add("Dora Mon");
		L1.add("Chota Beem");
		L1.add("Kid Vs Cat");
		L1.add("Power Rangers");
		L1.add("He-MAN");

		System.out.println(L1); // print the arraylist

		System.out.println("==============================================");

		L1.add(7890); // we can add diffrent data in arraylist

		System.out.println("After Adding the Numeric values : " + L1); // Add method in collection --->1

		System.out.println("==============================================");

		ArrayList L2 = new ArrayList();

		L2.addAll(L1); // Addall method in collection
		System.out.println("After adding the L1 collection to L2 collection :- " + L2);

		System.out.println("==============================================");

		boolean B3 = L2.contains("Power Rangers"); // Contains(object) method

		System.out.println("Output of contain object Retun type Boolean : - " + B3);

		System.out.println("==============================================");

		boolean B4 = L2.containsAll(L1); //// Contains(collection) method

		System.out.println("Output of contain Collection Retun type Boolean: - " + B4);

		System.out.println("==============================================");

		boolean B5 = L2.isEmpty(); //// isempty(boolean) method

		System.out.println("Output of is empty object Retun type Boolean: - " + B5);

		System.out.println("==============================================");

		L1.remove(3); // remove method by using index number remove object

		System.out.println("object removed with help of remove method by using index number" + L1);

		System.out.println("==============================================");

		L2.removeAll(L1); // removeall method (colection) not getting

		System.out.println(L2);

		System.out.println("==============================================");

		int A2 = L1.size(); // size method to know exact size of collection

		System.out.println("size of L1 collection :  " + A2);

		System.out.println("==============================================");

		L1.clear();
		System.out.println("Clearing the data or elements in L1 collection : " + L1);

	}
}
