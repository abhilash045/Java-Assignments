package abhilash_Asignments;

import java.util.Arrays;

public class Assignment79_ {

	public static void main(String[] args) {

		int rollno[] = new int[5]; // creating an array

		rollno[0] = 20;
		rollno[1] = 21;
		rollno[2] = 22;
		rollno[3] = 23;
		rollno[4] = 24;

		int Rollno[] = new int[5]; // creating an another array to where i want to be copied //you can write length
									// as "rollno.length";

		for (int i = 0; i < rollno.length; i++) // for loop
		{
			Rollno[i] = rollno[i]; // coping the values in java program excution takes place from right to left
		}

		System.out.println(Arrays.toString(rollno)); // print statement conversion of "arrays to string "
		System.out.println(Arrays.toString(Rollno));

	}

}
