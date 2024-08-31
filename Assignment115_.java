package abhilash_Asignments;

import java.util.Stack;

//"WAP on Stack methods pop() peak() push()"

public class Assignment115_ {

	public static void main(String[] args) {

		Stack<String> S1 = new Stack<>();

		S1.add("Ramu");
		S1.add("Krishna");
		S1.add("Sai");
		S1.add("Suresh");

		System.out.println("Initial Stack: " + S1);

		String poppedElement = S1.pop(); // Pop method is used to remove the last element
		System.out.println("Stack pop method: " + poppedElement);

		String R1 = S1.peek(); // Peek method is used to retrieve the last added element without removing it
		System.out.println("Peek method: " + R1);

		S1.push("Ganesh"); // Push method is used to add an element to the stack
		System.out.println("After push method: " + S1);

	}

}
