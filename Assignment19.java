package abhilash_Asignments;

//WAP on diffrent athimrtic opertors using global variable a and b

public class Assignment19 
{

	static int a = 10;   //static method Globel
	static int b =  5;	
	
	public static void main(String[] args)  //main method 
	{
		int sum = a+b;   //accesing the globel variable   
		int sub = a-b;
		int mult = a*b;
		int div = a/b;
		
		System.out.println("Addition     of a and b :- "  + sum);
		System.out.println("subtraction  of a and b :- "  + sub);
		System.out.println("multpication of a and b :- "  + mult);
		System.out.println("division     of a and b :- "  + div);		
	}	
}
