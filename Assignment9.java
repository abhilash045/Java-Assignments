package abhilash_Asignments;

//_NestedIf_Else

public class Assignment9 {

	public static void main(String[] args) {
		int a = 4;

		// Check if the number is positive, negative, or zero
		if (a > 0) {
			System.out.println("The a is Greater than 0."); // true this will start executing

			// Nested if-else to check if the positive number is even or odd

			if (a % 3 == 0) {
				System.out.println("The positive number is even.");
			} else {
				System.out.println("The positive number is odd."); // true
			}

		} else {
			System.out.println("The number is zero.");
		}
	}
}
