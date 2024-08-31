package abhilash_Asignments;

//WAP on given string to find out how many are alphabets  present?

public class Assignment72_ {
	static int count_of_alphabet = 0;

	public static void main(String[] args)

	{
		String S1 = "Well come to java program";
		// System.out.println(S1);

		char S2[] = S1.toCharArray();

		for (int i = 0; i < S2.length; i++) {

			boolean S3 = Character.isLetter(S2[i]);

			if (S3 == true)

			{
				count_of_alphabet++;
			}

		}

		System.out.println("count of alphabet : " + count_of_alphabet++);

	}
}
