package abhilash_Asignments;

public class Assignment73_

{
	static int count_of_space = 0;

	public static void main(String[] args) {
		
		String Name = "Wellcome to manualTesting with JAVA Selinimum";
		// System.out.println(Name);

		char Z1[] = Name.toCharArray();

		for (int i = 0; i < Name.length(); i++)

		{
			boolean Z2 = Character.isSpaceChar(Z1[i]);

			if (Z2 == true) {
				count_of_space++;
				}

		}
		System.out.println("Count of space in string :  " + count_of_space++);
	}
}
