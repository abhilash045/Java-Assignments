package abhilash_Asignments;

import java.util.ArrayList;

//WAP on ArrayList Methods of get() , Set() , Indexof()

public class Assignment113_ {

	public static void main(String[] args) {
		ArrayList<String> A1 = new ArrayList(); // String is add after arraylist because we are given elements in string
												// format

		A1.add("Wellcome");
		A1.add("to");
		A1.add("Testing");

		System.out.println("Arraylist :-" + A1);

		// get()method

		String S1 = A1.get(2);

		System.out.println("element index 2 ; " + S1);

		// set () Method

		A1.set(1, "automation");

		System.out.println("Set Method output : " + A1);

		// IndexOFF

		int R1 = A1.indexOf("Testing");

		System.out.println("out put for indexoff : " + R1);
	}

}
