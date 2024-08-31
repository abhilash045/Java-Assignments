package abhilash_Asignments;


//WAP on how to check the given two strings is an anagram of each other?


import java.util.Arrays;

public class Assignment75_ {
	public static void main(String[] args) {
		String Name = "Medam";
		String Name1 = "medal";

		if (Name.length() != Name1.length()) {
			System.out.println("above string not Elgable for Aanagram");
		}

		else {
			System.out.println("above mentiond string are elgable for Aanagram");
		}

		char a1[] = Name.toCharArray(); // String to char coversion using keyword "tochararray"
		char a2[] = Name1.toCharArray();

		System.out.println(Arrays.toString(a1)); // print statememnt --> "Arrays.toString"
		System.out.println(Arrays.toString(a2));

		boolean finalanswer = Arrays.equals(a1, a2);

		Arrays.sort(a1);
		Arrays.sort(a2);

		if (finalanswer == true) // if statement
		{
			System.out.println("it is an Aanagram");
		} else {
			System.out.println("it is not a Aanagarm");
		}

	}

}
