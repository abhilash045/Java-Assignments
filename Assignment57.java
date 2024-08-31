package abhilash_Asignments;

//WAP on static and nonstatic main method overloading

public class Assignment57 {

	public static void main() {
		System.out.println("This is main method over loading");
	}

	public static void main(int a) {
		System.out.println(10);
	}

	public static void main(String Name) {
		System.out.println("Abhilash");
	}

	public static void main(String[] args) // Standard main method
	{
		main();
		main(10);
		main("Abhilash");

	}
}
