package abhilash_Asignments;

import java.util.Arrays;

//WAP with split(string regex) & split(string regex, int index) ?

public class Assignment99_ {

	public static void main(String[] args) {
		String N1 = "this is abhilash Well come to java";

		// Split the string based on whitespace
		String[] N2 = N1.split(" ");

		// Print the array as a string
		System.out.println(Arrays.toString(N2)); // split(string regex)

		String[] N3 = N1.split(" ", 2);
		System.out.println(Arrays.toString(N3));
	}
}
