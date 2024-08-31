package abhilash_Asignments;

//WAP to check if the given string is palindrome

public class Assignment68_ {
	public static void main(String[] args) 
	
	{
		String Name = "Malayalam";
		
		System.out.println(Name); // not required, but it's fine if you want to print the original string

		String n1 = Name.toLowerCase(); // converting the string to lowercase for uniformity
		System.out.println(n1); // printing the lowercase string

		String reverse = "";

		for (int i = n1.length() - 1; i >= 0; i--) { // iterating over the string in reverse order
			
			char r1 = n1.charAt(i);  //this is for chartype rversing
			
			reverse = reverse + r1;
		}

		System.out.println(reverse); // printing the reversed string

		boolean results = n1.equals(reverse); // checking if the string is a palindrome

		System.out.println(results); // printing the result of the palindrome check

		if (results)  //if  else statement
		
		{
			System.out.println("string is palindrome");
		} else 
		
		{
			System.out.println("string is not palindrome");
		}
	}
}
