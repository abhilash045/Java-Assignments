package abhilash_Asignments;

import java.util.Arrays;
import java.util.Scanner;

///WAP to send 5 int value from scanner class

public class Assignment70_ {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);

		System.out.println("Enter the int value :- ");
		s1.nextInt();

		System.out.println("Enter the int value :- ");
		s1.nextInt();

		System.out.println("Enter the int value :- ");
		s1.nextInt();

		System.out.println("Enter the string :- ");
		s1.next();

		System.out.println("Enter the string :- ");
		s1.next();

		Object store[] = new Object[5];

		store[0] = s1;
		store[1] = s1;
		store[2] = s1;
		store[3] = s1;
		store[4] = s1;

		System.out.println(Arrays.toString(store));

	}

}
