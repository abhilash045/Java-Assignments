package abhilash_Asignments;

// Assignment 12 Calling Static method  with and without parameters inside main method

public class Assignment12 {

	// Static method without parameters

	static void message() {
		System.out.println("Hi this is static without parameter");
	}

	// Static method with parameters

	static void message(String name) {
		System.out.println(" Hi this is static with Parameters");
	}

	static void message(float a) {
		System.out.println(" hi this is float datatype");
	}

	public static void main(String[] args) {
		
		// Calling the static method without parameters
		message();

		// Calling the static method with parameters
		message("Automation batch");

		message(7.15f);
	}

}
