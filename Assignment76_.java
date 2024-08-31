package abhilash_Asignments;

//Find out the average value of 4 numbers in array of int data type?

public class Assignment76_ {

	public static void main(String[] args) {
		int Number[] = new int[4]; // created the array to store the 4 numbers

		Number[0] = 15;
		Number[1] = 16;
		Number[2] = 17;
		Number[3] = 18;

		int sum = 0; // doing the sum of arrays
		double average = 0; // divide the sum/ no of elements

		for (int i = 0; i < Number.length; i++) // for loop
		{
			sum = sum + Number[i]; // it is logic for the sum
		}

		System.out.println(sum); // to print the sum

		average = sum / 4; // average = sum of the number / no of all the numbers . sum/4 or
							// sum/number.length;

		System.out.println(average);
	}

}
