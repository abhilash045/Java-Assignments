package abhilash_Asignments;

public class Assignment74_ {
	static int count_of_special = 0;

	public static void main(String[] args) {
		String Emailid = "Testing@#$^&";

		System.out.println(Emailid);

		char C1[] = Emailid.toCharArray();

		for (int i = 0; i < Emailid.length(); i++) {
			boolean C2 = Character.isAlphabetic(C1[i]);

			if (C2 != true) {
				count_of_special++;
			}
		}

		System.out.println("count of special character : " + count_of_special++);
	}
}
