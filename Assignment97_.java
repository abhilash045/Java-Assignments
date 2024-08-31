package abhilash_Asignments;

//WAP to check in a given string starts with 's' , ends with 'h' and 4 letters in between ?

public class Assignment97_ {
	
	public static void main(String[] args) {
		
		String Name = "salish";
		
		System.out.println("intput :-" + Name);
		
		boolean N2 = Name.matches("s(.*)(.*)h");   //mathes keyword is used in the statement
		
		System.out.println("output :- " + N2);
		
	}

}
