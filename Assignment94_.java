package abhilash_Asignments;

//WAP to check if the given String 'R' is present at the second place or not ?

public class Assignment94_ {
	
	public static void main(String[] args)
	{
		String Name = "Pasikanti";
		
		System.out.println("InputString:  " + Name);
		
		boolean N1 = Name.matches("(.*)R(.*)");     //key word "Contains" used to check weather chacter present
		                                          // the type of data should be boolean true/false
												
		System.out.println("OutPut String:   " + N1);

}

}
