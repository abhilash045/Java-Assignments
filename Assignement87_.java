package abhilash_Asignments;

//WAP to remove all numeric values in a given string ?

public class Assignement87_ {
	
	public static void main(String[] args)
	{
		String Name = "automation Testing 141 Batch ";
		
		System.out.println("InputString:  " + Name);
		
		String N1 = Name.replaceAll("[1-9]", "");  //key word "replaceAll" used to remove numeric value
		System.out.println("OutPut String:   " + N1);
	}

}
