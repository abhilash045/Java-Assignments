package abhilash_Asignments;

//WAP to remove all capital letters in a given string  ?

public class Assignement85_ {
	
	public static void main(String[] args)
	{
		String Name = "My Name is Abhilash Pasikanti";
		
		System.out.println("InputString:  " + Name);
		
		String N1 = Name.replaceAll("[A-Z]", "");  //key word "replaceAll" used to remove all capital alphabets
											
		
		System.out.println("OutPut String:   " + N1);
	}

}
