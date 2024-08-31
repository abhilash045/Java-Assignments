package abhilash_Asignments;

//WAP to check if 'n' is present in the middle of given string "automation testing" or not?

public class Assignment96_ {
	
	public static void main(String[] args) {
		
		String Name = "automation testing";
		
		System.out.println("Input String :- " + Name);
		
		boolean B2 = Name.matches("(.*)n(.*)");  //keyword "mathes" "(.*)n(.*)"
		System.out.println("output :- " + B2);
		
		
	}

}
