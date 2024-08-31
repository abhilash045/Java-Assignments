package abhilash_Asignments;

import java.util.Arrays;

//WAP on reverse of Array and store into another Array using for loop ?

public class Assignment81_ {

	static int k = 0;

	public static void main(String[] args) {

		int rollno[] = { 15, 87, 65, 44, 32 }; // assigning the values in aarays

		int rollno_reverse[] = new int[5];

		for (int i = 4; i >= 0; i--) // for loop to reverse

		{
			rollno_reverse[i] = rollno[k];
			k++;
		}

		System.out.println("Array Output:- " + Arrays.toString(rollno));
		System.out.println("Reverse the Array :- " + Arrays.toString(rollno_reverse));

	}

}
