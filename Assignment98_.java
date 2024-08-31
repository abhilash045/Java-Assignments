package abhilash_Asignments;

//WAP with equalsIgnoreCase, endswith, isEmpty & Repeat in String Class?

public class Assignment98_ {
	
	public static void main(String[] args) 
	{
		String Name = "Hello WelCome to Automation Testing"; 
		boolean N1 = Name.equalsIgnoreCase(Name);                 //equalsIgnoreCase method
		
		System.out.println(N1);
		
		
		boolean N2 = Name.endsWith("ing");                //endsWith METHOD
		System.out.println(N2);
		
		boolean N3 = (Name.isEmpty());     //isEmpty Method
		System.out.println(N3);
		
		String N5 = " Testing ";
		String N4 = N5.repeat(10);   //repeat Method
		
		System.out.println(N4);
	}

}
