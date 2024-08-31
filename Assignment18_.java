package abhilash_Asignments;

//WAP on area of circle using global variable?

public class Assignment18_ {
	
	static double pivalue = 62.25;  //pi value need to be store in Globel static Method 
	
	 static void  area()     //static globel method 
	{
		int r = 25;                          //r---> radius
		double area = pivalue * r * r;       //area formula ---> r*r
		
		System.out.println("Area of Circle:- " + area);
	}
	public static void main(String[] args)  //Main Method!
	{
		area();	
	}
}
