package abhilash_Asignments;
  
//Multi level inheritance using static and nonstatic methods

class kazipet  //sub super most class
{
	static void add()
	{
		System.out.println("this static in super most classs");
	}
}

class hanmakonda extends kazipet   //sub super class 
{
	static void sub()     //static class
	{
		System.out.println("this is static in super class");
	}
}

public class Assignment38_StaticMethod extends hanmakonda  //child class get releation ship with help of key word extends 

{
	static void div()                        //static class
	{
		System.out.println("this is static in child class");
	}
	
	
	public static void main(String[] args)    //main method 
	{
	
	add();  //we can call the static method without creating an object
	sub();
	div();
	
	}
}
  



