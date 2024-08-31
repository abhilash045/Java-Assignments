package abhilash_Asignments;

//WAP using charAt, indexofchar, subString- Single and double

public class Assignment66_ {
	public static void main(String[] args) {
		
		String UserName = "Abhilash.var5";
		System.out.println("string output :- " + UserName);

		char a = UserName.charAt(5); // for calling the exact char in the strig "variable.charAt" is used
		System.out.println("string charat:- " + a);

		String Username = "Automation";
		int a2 = Username.indexOf('n'); // for calling the exact index number with the help of char
		System.out.println("String indexat:- " + a2);

		String course = "ManualTesting";
		String c1 = course.substring(6, 10); // this is used to call the between char or string with the help of  indexing number
												
		System.out.println("sub string of string output :- " + c1);

	}
}
