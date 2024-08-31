package abhilash_Asignments;

//WAP on updating global static and non static variable

public class Assignment17

{
	static int a = 20;     // static method Globel
	int b = 30;            // globel non static method

	public static void main(String[] args) // main method

	{
		a = 30;    // static declerazation
		System.out.println("Updating the value of Global static variable:- " + a); // value updatation

		
		Assignment17 n1 = new Assignment17(); // object created for non static method 
		
		n1.b = 40; 
		System.out.println("Updating the value for non static Global Variable" + n1.b);
	}
}
