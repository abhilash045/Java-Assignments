package abhilash_Asignments;

//Check number 15 is present in given array of size 5,int datatype ?

public class Assignment77_ {

	static int to_check_number = 30;

	public static void main(String[] args) {
		int Variable[] = new int[6];

		Variable[0] = 10;
		Variable[1] = 20;
		Variable[2] = 30;
		Variable[3] = 40;
		Variable[4] = 50;
		Variable[5] = 60;

		int toNumberCheck = 30;

		for (int i = 0; i < Variable.length; i++) {
			if (toNumberCheck == Variable[i])

			{
				System.out.println("Number 30 is avilable");
			}

		}
	}

}
