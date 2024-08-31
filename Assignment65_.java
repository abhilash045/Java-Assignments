package abhilash_Asignments;

//WAP to use String Class length(), touppercase() & tolowercase()

public class Assignment65_ 
{

	
	public static void main(String[] args)
	{
		
		String Name = "Automation testing by MKT";	  //writing a string with the help of keyword string
		
		System.out.println("string output :- " + Name);   //calling with the help of varaiable name 
		
		
		int length = Name.length();   // finding the length of string with the help of key word "variable.length"
		
		System.out.println("String Length:- " + length);
		
		String Captal = Name.toUpperCase(); // converting the lower case string into upper case with help of keyword "toUppercase"
		System.out.println("String Capital :- "  + Captal);
		
		String small = Name.toLowerCase();
		System.out.println("String lowercase output" + small); // converting the lower case string into upper case with help of keyword "tolowercase"
								
	}
}

/*
 
 
 int rollno[]=new int[5];
	rollno[0]=21;
	rollno[1]=24;
	rollno[2]=32;
	rollno[3]=54;
	rollno[4]=15;	
	
	for(int i=0;i<=4;i++)
	{
	System.out.println(rollno[i]);

	}
	*/
